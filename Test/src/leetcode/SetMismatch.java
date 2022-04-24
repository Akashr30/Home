package leetcode;

public class SetMismatch {

	public static int[] findErrorNums(int[] nums) {

		int[] arr = new int[nums.length];
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i] - 1]++;
			if (arr[nums[i] - 1] > 1) {
				num1 = i -1;
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				num2 = i + 1;
				break;
			}
		}
		return new int[] { num1, num2 };
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 4 };
		findErrorNums(arr);
	}

}
