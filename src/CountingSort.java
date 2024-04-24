public class CountingSort {
    public static int[] countingSort(int[] A, int k) {
        // Adım 1: C dizisi benim için sayma dizisi ve sıfırlayarak başlatıyorum
        int[] C = new int[k + 1];

        // Adım 2: A dizisindeki her elemanın geçiş sayısını sayıyorum
        for (int j = 0; j < A.length; j++) {
            C[A[j]]++; // veya C[A[j]]=C[A[j]]+1
        }

        // Adım 3: Sayma dizisini kümülatif bir diziye dönüştürüyoruz
        for (int i = 1; i <= k; i++) {
            C[i] += C[i - 1]; // veya C[i] + C[i - 1]
        }

        // Adım 4: Kümülatif diziyi kullanarak elemanları doğru konumlarına
        // yerleştiriyoruz
        int[] B = new int[A.length];
        for (int j = A.length - 1; j >= 0; j--) {
            B[C[A[j]] - 1] = A[j];
            C[A[j]]--;
        }

        return B;
    }
}
