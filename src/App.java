public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 6, 4, 2, 3, 1, 5 };
        a = SelectionSort.selectionSort(a, 6);
        for (int i = 0; i < 6; i++)
            System.out.println(a[i]);
    }
}
