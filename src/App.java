public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 6, 4, 2, 3, 1, 5, 0, 5 }; // counting sortta negatif eleman olmamalı
        int k = 6; // counting sort için max elemanı seç
        // a = SelectionSort.selectionSort(a, 8);
        // a = InsertionSort.insertionSort(a, 8);
        // a = BubbleSort.bubblesort(a, 9);
        a = CountingSort.countingSort(a, k); // k dizideki max sayıdır
        for (int i = 0; i < 7; i++)
            System.out.println(a[i]);
    }
}
