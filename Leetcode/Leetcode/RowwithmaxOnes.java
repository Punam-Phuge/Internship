public class RowwithmaxOnes {

    static int rowWithMaxOnes(int[][] Arr, int N, int M) {
        int maxOnesRow = -1; // Initialize the index of the row with max ones
        int maxOnesCount = 0; // Initialize the count of max ones found
        
        // Start from the first row and iterate through all rows
        for (int i = 0; i < N; i++) {
            int onesCount = countOnes(Arr[i]); // Count the number of ones in the current row
            if (onesCount > maxOnesCount) { // If current row has more ones than previous max
                maxOnesCount = onesCount;
                maxOnesRow = i;
            }
        }
        
        return maxOnesRow; // Return the index of the row with max ones
    }

    static int countOnes(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            } else {
                break; // Since rows are sorted, no need to continue counting if we encounter 0
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] Arr1 = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };
        int N1 = 4, M1 = 4;
        System.out.println("Output for Arr1: " + rowWithMaxOnes(Arr1, N1, M1));

        int[][] Arr2 = {
            {0, 0},
            {1, 1}
        };
        int N2 = 2, M2 = 2;
        System.out.println("Output for Arr2: " + rowWithMaxOnes(Arr2, N2, M2));
    }
}

