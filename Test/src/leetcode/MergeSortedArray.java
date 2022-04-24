package leetcode;

public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = 0;
		int k = 0;
		int c = m;
		while (i < nums1.length) {

			if (nums2[k] >= nums1[i]) {
				i++;
			} else {
				nums1[c] = nums1[i];
				c++;
				if (k < nums2.length)
					nums1[i] = nums2[k++];
				i++;
			}
		}

		while (c < nums1.length) {
			nums1[c++] = nums2[k++];
		}

	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		merge(nums1,m,nums2,n);
	}

}
