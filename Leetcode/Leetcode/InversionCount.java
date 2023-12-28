 public class InversionCount {

        public static void main(String[] args) {
            int[] arr1 = {2, 4, 1, 3, 5};
            int result1 = countInversions(arr1);
            System.out.println("Output for arr1: " + result1);
    
            int[] arr2 = {2, 3, 4, 5, 6};
            int result2 = countInversions(arr2);
            System.out.println("Output for arr2: " + result2);
    
            int[] arr3 = {10, 10, 10};
            int result3 = countInversions(arr3);
            System.out.println("Output for arr3: " + result3);
        }
    
        static int countInversions(int[] arr) {
            int n = arr.length;
            int[] temp = new int[n];
            return mergeSortAndCount(arr, temp, 0, n - 1);
        }
    
        static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
            int count = 0;
    
            if (left < right) {
                int mid = (left + right) / 2;
    
                count += mergeSortAndCount(arr, temp, left, mid);
                count += mergeSortAndCount(arr, temp, mid + 1, right);
    
                count += merge(arr, temp, left, mid, right);
            }
    
            return count;
        }
    
        static int merge(int[] arr, int[] temp, int left, int mid, int right) {
            int i = left;
            int j = mid + 1;
            int k = left;
            int count = 0;
    
            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    // Inversion found
                    temp[k++] = arr[j++];
                    count += (mid - i + 1);
                }
            }
    
            // Copy the remaining elements of left subarray
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
    
            // Copy the remaining elements of right subarray
            while (j <= right) {
                temp[k++] = arr[j++];
            }
    
            // Copy the merged elements back to the original array
            for (i = left; i <= right; i++) {
                arr[i] = temp[i];
            }
    
            return count;
        }
    }
    
