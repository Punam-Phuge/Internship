public class WaveArray {

    static void waveSort(int[] arr, int n) {
        // Traverse all even elements
        for (int i = 0; i < n; i += 2) {
            // If current even element is smaller than previous
            if (i > 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
            }
            // If current even element is smaller than next
            if (i < n - 1 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int n1 = arr1.length;
        waveSort(arr1, n1);
        System.out.print("Wave array for {1, 2, 3, 4, 5}: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr2 = {2, 4, 7, 8, 9, 10};
        int n2 = arr2.length;
        waveSort(arr2, n2);
        System.out.print("Wave array for {2, 4, 7, 8, 9, 10}: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
