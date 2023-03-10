public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        System.out.println("Liste Durumu : " + (myList.isEmpty() ? "Boş" : "Dolu"));
        System.out.println("Dizideki Eleman Sayısı : " + myList.getSize());
        myList.add(10);
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(20);
        myList.add(50);
        myList.add(60);
        myList.add(70);
        System.out.println("Dizideki Eleman Sayısı : " + myList.getSize());
        System.out.println("Liste Durumu : " + (myList.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + myList.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + myList.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + myList.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = myList.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = myList.subList(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + myList.contains(20));
        System.out.println("Listemde 120 değeri : " + myList.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        myList.clear();
        System.out.println(myList.toString());
    }
}
