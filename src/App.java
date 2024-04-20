public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 6, 4, 2, 3, 1, 5, 0, 9 };
        // a = InsertionSort.selectionSort(a, 8);
        a = InsertionSort.insertionSort(a, 8);
        for (int i = 0; i < 8; i++)
            System.out.println(a[i]);
    }
}
