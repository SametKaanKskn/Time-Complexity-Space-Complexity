public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 6, 4, 2, 3, 1, 5, 9 };
        a = SelectionSort.selectionSort(a, 7);
        for (int i = 0; i < 7; i++)
            System.out.println(a[i]);
    }
}
