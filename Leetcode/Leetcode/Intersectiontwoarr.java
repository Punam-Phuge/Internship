public class Intersectiontwoarr {
   public static void main(String args[]) {
      int arr1[] = {1,2,2,1};
      int arr2[] = {2,2};
      int m = arr1.length;
      int n = arr2.length;
      int i = 0, j = 0;
      System.out.print("Array 1: ");
      for(int k = 0; k < m; k++) {
         System.out.print(arr1[k] + " "); 
      }
      System.out.print("");
      System.out.print("Array 2: ");
      for(int k = 0; k < n; k++) {
         System.out.print(arr2[k] + " ");
      }
      System.out.print("");
      System.out.print("Intersection of two arrays is: ");
      while (i < m && j < n) {
        if (arr1[i] < arr2[j]) {
            i += 1;
        } else if (arr2[j] < arr1[i]) {
            j += 1;
        } else {
            System.out.println(arr2[j]);
            j += 1;
            i += 1;
        }
      }
   }
}