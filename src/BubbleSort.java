public class BubbleSort {

    public static int[] bubblesort(int[] A, int n) // bir diziyi ve dizinin uzunluğunu parametre alan fonksiyon
    {
        int tmp; // swap işlemi için
        for (int i = 0; i < n; i++) {
            int sirali = 1; // dizinin sıralı olup olmadığını kontrol etmek için flag (C/C++ gördüğüm)
            for (int j = 0; j < n - 1 - i; j++) // her döngüde sonuncu eleman hariç kontrol işlemi yapılacak
            {
                if (A[j] > A[j + 1]) // şayet buraya girmiyorsak dizi sıralı demektir
                {
                    sirali = 0; // şayet giriyorsak sıralı değil demektir
                    tmp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = tmp;
                }
            }
            if (sirali == 1) { // dizi sıralı olduğu durumda buraya girecektir ve best case N mertebesinde
                               // olacaktır
                break;
            }
        }
        return A;
    }
}
