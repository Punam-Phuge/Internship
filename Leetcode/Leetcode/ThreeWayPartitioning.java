public class ThreeWayPartitioning {

    static int[] threeWayPartition(int[] A, int a, int b) {
        int n = A.length;
        int start = 0, end = n - 1;

        // Traverse the array
        for (int i = 0; i <= end;) {
            // If the current element is smaller than the range, swap it with the start element
            if (A[i] < a) {
                swap(A, i, start);
                start++;
                i++;
            }
            // If the current element is greater than the range, swap it with the end element
            else if (A[i] > b) {
                swap(A, i, end);
                end--;
            }
            // If the current element is within the range, move to the next element
            else {
                i++;
            }
        }
        return A;
    }

    static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 3, 4};
        int[] result1 = threeWayPartition(A1, 1, 2);
        System.out.println("Output for [1, 2, 3, 3, 4] with range [1, 2]:");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] A2 = {1, 4, 3, 6, 2, 1};
        int[] result2 = threeWayPartition(A2, 1, 3);
        System.out.println("Output for [1, 4, 3, 6, 2, 1] with range [1, 3]:");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
