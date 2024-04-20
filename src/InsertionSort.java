public class InsertionSort {

    public static int[] insertionSort(int[] A, int n) {
        /*
         * İlk eleman atlanacak şekilde de yapılabilirdi.Çünkü tek başına sıralı bir
         * durumdadır
         * // İkinci elemandan başlayarak dizi boyunca döngü de yapılabilirdi ki
         * processing time açısından daha avantajlı olur
         */

        for (int j = 0; j < n - 1; j++) {
            int key = A[j + 1]; // Araya eklenecek değerim ve 1. işaretçim bunun üzerinde olacak
            int i = j; // Son sıralana öğenin indexi olacaktır.Diğer işaretçi bunun üzerinde olacaktır

            /*
             * Koşul sağlandıkça 1. işaretçim key'de kalacak ve 2.işaretçim key'in
             * solundakilere doğru sıra sıra büyük mü diye kontrol edecektir
             */
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--; // 2. işaretçimin sola kaymasını sağlayacaktır
            }
            // Eklenecek değerin ilgili indekse atanacağı yer
            A[i + 1] = key;
        }
        return A;
    }
}

/*
 * public static int[] insertionSort(int[] A, int n) {
 * 
 * // Bu şekilde yapılarak 1. eleman atlanmış ve processing time dan kısılmış
 * olacaktır.
 * 
 * for (int j = 1; j < n ; j++) {
 * int key = A[j];
 * int i = j-1;
 * 
 * while (i >= 0 && A[i] > key) {
 * A[i + 1] = A[i];
 * i--;
 * }
 * 
 * A[i + 1] = key;
 * }
 * return A;
 * }
 */
