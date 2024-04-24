public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 6, 4, 2, 3, 1, 5, 0, 9, -5 };
        // a = SelectionSort.selectionSort(a, 8);
        // a = InsertionSort.insertionSort(a, 8);
        a = BubbleSort.bubblesort(a, 9);
        for (int i = 0; i < 9; i++)
            System.out.println(a[i]);
    }
}
