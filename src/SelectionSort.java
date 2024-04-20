public class SelectionSort {

    public static int[] selectionSort(int[] A, int n) {
        int temp; // İki ifadeyi swap etmek için 3. bardağa ihtiyaç vardır
        int min;

        // iki tane işaretçi belirleyip bunları karşılaştırarak küçükten büyüğe sıralama
        // yapıldı
        for (int i = 0; i < n - 1; i++) {
            min = i; // aslında birinci işaretçinin indeksi olacak

            for (int j = i; j < n - 1; j++) {
                // ikinci işaretçi (A[j]) ile birinci işaretçi (A[min]) karşılaştırılır
                // Böylelikle dizideki en küçük elemanın indeksini bulacaktır.
                if (A[j] < A[min]) {

                    min = j;
                }

            } // sıralanmış bir dizi olsa da swap işlemi yine de yapılacak (extra cost).
            temp = A[i]; // swap işlemi yapıldı.
            A[i] = A[min];
            A[min] = temp;
        }
        return A;
    }
}
