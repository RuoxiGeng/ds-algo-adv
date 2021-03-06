package sort;

public class InsertionSort {

    private InsertionSort() {}

    public static void sort(Comparable[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            for (int j = i; j > 0 && arr[j].compareTo(arr[j-1]) < 0; j--)
                swap(arr, j, j-1);
        }
    }

    private static void swap (Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("sort.InsertionSort", arr);

        return;
    }
}
