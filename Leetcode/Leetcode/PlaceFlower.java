public class PlaceFlower {
        public static boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
    
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0) {
                    // Check if the current plot and its adjacent plots are empty
                    boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                    boolean nextEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
    
                    if (prevEmpty && nextEmpty) {
                        // Plant a flower, and update the count
                        flowerbed[i] = 1;
                        count++;
    
                        // Skip the next plot, as it cannot have a flower
                        i++;
                    }
                }
            }
    
            return count >= n;
        }
    
        public static void main(String[] args) {
            // case: 1
            int[] flowerbed1 = {1, 0, 0, 0, 1};
            int n1 = 1;
            System.out.println(canPlaceFlowers(flowerbed1, n1)); 
    
            // Case: 2
            int[] flowerbed2 = {1, 0, 0, 0, 1};
            int n2 = 2;
            System.out.println(canPlaceFlowers(flowerbed2, n2)); 
        }
    }
    
    

