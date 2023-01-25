import java.util.ArrayList;

public class MyList<T> {

    private int size = 0;
    private int capacity;
    T[] list;
    T[] tempList;

    public MyList() {
        setCapacity(10);
        this.list = (T[]) new Object[getCapacity()];

    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[getCapacity()];
    }

    public MyList<T> subList(int startIndex, int finishIndex) {

        MyList<T> array = new MyList<>();
        for (int i = startIndex; i <= finishIndex; i++) {
            array.add(list[i]);
        }
        return array;

    }

    boolean contains(T data) {
        for (T find : list) {
            if (find == data) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
    }

    public String toString() {
        ArrayList<T> printList = new ArrayList<>();
        for (T data : list) {
            if (data != null) {
                printList.add(data);
            }
        }

        return printList.toString();
    }


    public boolean isEmpty() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(T data) {
        int index = 0;
        for (T value : list) {
            if (value == data) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {

        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] == data) {
                return i;
            }
        }
        return -1;

    }

    public T[] toArray() {
        T[] array = (T[]) new Object[getSize()];

        for (int i = 0; i < getSize(); i++) {
            array[i] = list[i];
        }
        return array;
    }

    public void set(int index, T data) {

        if (index <= getSize()) {

            list[index] = data;
        }

    }

    public int size() {
        int size = 0;
        for (T list1 : list) {
            if (!(list1.equals(null))) {
                size++;
            }
        }
        return size;
    }

    public T get(int index) {

        if (index <= getSize()) {
            return list[index];
        }

        return null;
    }

    public void remove(int index) {
//		System.out.println(Arrays.toString(list));
//		list[index]= null;

        if (index <= getSize()) {
            for (int i = index + 1; i < list.length; i++) {// index+1 yazılmasının nedeni baştaki indexin yok
                // olmamasıdır.

                list[i - 1] = list[i];// örneğin 3. indexe 4. indexteki değer geliyor
            }

//			System.out.println(Arrays.toString(list));
        } else {
            System.out.println("Hatalı index");
        }
        // System.out.println(Arrays.toString(list)+" liste basıldı.");
        setSize(getSize() - 1);

    }

    public void add(T value) {
        if (capacity >= size) {
            this.list[size] = value;
            setSize(getSize() + 1);
        } else {
            tempList = (T[]) new Object[(this.capacity)];
            setCapacity(getCapacity() * 2);

            int index = 0;
            for (T val : list) {
                tempList[index] = val;
                index++;
            }

            list = (T[]) new Object[(getCapacity())];

            index = 0;
            for (T val : tempList) {
                list[index] = val;
                index++;
            }

            this.list[size()] = value;
            setSize(getSize() + 1);
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
