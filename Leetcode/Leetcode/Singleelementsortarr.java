
public class Singleelementsortarr {
	// A Linear Search based function to find
	// the element that appears only once
	static void search(int arr[], int n)
	{
		int ans = -1;
		for (int i = 0; i < n-1; i += 2) {
			if (arr[i] != arr[i + 1]) {
				ans = arr[i];
				break;
			}
		}
	
		if (arr[n - 2] != arr[n - 1])
			ans = arr[n-1];
	
		// ans = -1 if no such element is present.
		System.out.println("The required element is "+ ans);
	}
	public static void main(String[] args)
	{   //case1:
		int arr[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int len = arr.length;

		search(arr, len);
        //case2:
        int arr2[] = { 3, 3, 7, 7, 10, 11,11};
		int len2 = arr2.length;

		search(arr2, len2);
	}
}

    
