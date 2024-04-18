public class SelectionSort {

    public static int[] selectionSort(int[] A, int n) {
        int temp; // İki ifadeyi swap etmek için 3. bardağa ihtiyaç vardır
        int min;

        for (int i = 0; i < n - 1; i++) // 1.eleman hariç tüm diziyi gezecek
        {
            min = i;

            for (int j = i; j < n - 1; j++) {
                if (A[j] < A[min]) {

                    min = j;
                }

            }
            temp = A[i]; // swap işlemi yapıldı.
            A[i] = A[min];
            A[min] = temp;
        }
        return A;
    }
}
