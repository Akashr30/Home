package testOne;

public class MinimumDistance {

	/*public static void main(String[] args) {
		int[] arr = {3,8,1,2,3,4,5,6,7,8,9,3,3};
		int x = 3;
		int y = 3;
		int diff = -1;
		int xPos = Integer.MIN_VALUE, yPos = Integer.MIN_VALUE ;
		for (int i = 0 ; i < arr.length;i++) {
			if (x == arr[i]&& xPos <0) {
				xPos =  i;
			} if (y == arr[i]&& yPos <0) {
				yPos = i;
			}
			if (xPos >=0&& yPos >=0) {
			diff = yPos - xPos;
			System.out.println(Math.abs(diff));
			break;
			}
		}
		if (diff == -1)
		System.out.println((diff));
	}*/
	
	//Aliter method
	
		int minDist(int arr[], int n, int x, int y) 
		{ 
			int i = 0; 
			int min_dist = Integer.MAX_VALUE; 
			int prev=0; 

			// Find the first occurence of any of the two numbers (x or y) 
			// and store the index of this occurence in prev 
			for (i = 0; i < n; i++) 
			{ 
				if (arr[i] == x || arr[i] == y) 
				{ 
					prev = i; 
					break; 
				} 
			} 

			// Traverse after the first occurence 
			for (; i < n; i++) 
			{ 
				if (arr[i] == x || arr[i] == y) 
				{ 
					// If the current element matches with any of the two then 
					// check if current element and prev element are different 
					// Also check if this value is smaller than minimum distance 
					// so far 
					if (arr[prev] != arr[i] && (i - prev) < min_dist) 
					{ 
						min_dist = i - prev; 
						prev = i; 
					} 
					else
						prev = i; 
				} 
			} 

			return min_dist; 
		} 

		/* Driver program to test above functions */
		public static void main(String[] args) { 
			MinimumDistance min = new MinimumDistance(); 
			int arr[] = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3}; 
			int n = arr.length; 
			int x = 28; 
			int y = 66; 

			System.out.println("Minimum distance between " + x + " and " + y 
					+ " is " + min.minDist(arr, n, x, y)); 
		} 
	 



}
