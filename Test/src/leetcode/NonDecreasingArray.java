package leetcode;

public class NonDecreasingArray {

	public static boolean checkPossibility(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length - 1;) {
			//[-1,4,2,3]
			if (i == 0) {
				if (arr[i + 1] < arr[i])
					ans++;
			} else if (i > 0 && arr[i + 1] < arr[i] && arr[i-1] != arr[i]) {
				arr[i] = arr[i-1];
				ans++;

				if (ans > 1)
					return false;

				continue;
			} else if (i > 0 && arr[i + 1] < arr[i] && arr[i-1] == arr[i]) {
				arr[i+1] = arr[i];
				ans++;

				if (ans > 1)
					return false;

				continue;
			}
			i++;
		}
		return ans == 1;
	}

	public static void main(String[] ar) {

		// int[] arr = {4,2,3};
		// int[] arr = {3,4,2,3};
		int[] arr = { 2, 3, 3, 2, 4 };
		System.out.print(checkPossibility(arr));
	}
}
