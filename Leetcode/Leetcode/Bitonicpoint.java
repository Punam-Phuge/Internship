public class Bitonicpoint {

    static int findMaximum(int arr[], int n) {
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid];
                } else if (arr[mid - 1] > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (mid == 0) {
                if (arr[mid] > arr[mid + 1]) {
                    return arr[mid];
                } else {
                    return arr[mid + 1];
                }
            } else if (mid == n - 1) {
                if (arr[mid] > arr[mid - 1]) {
                    return arr[mid];
                } else {
                    return arr[mid - 1];
                }
            }
        }
        return -1; // This line won't be reached if the array is bitonic
    }

    public static void main(String args[]) {
        int arr1[] = {1, 15, 25, 45, 42, 21, 17, 12, 11};
        int n1 = arr1.length;
        System.out.println("Maximum element in arr1: " + findMaximum(arr1, n1));

        int arr2[] = {1, 45, 47, 50, 5};
        int n2 = arr2.length;
        System.out.println("Maximum element in arr2: " + findMaximum(arr2, n2));
    }
}