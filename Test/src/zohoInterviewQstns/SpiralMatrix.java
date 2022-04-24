package zohoInterviewQstns;

public class SpiralMatrix {

	private static void print(int[][] arr, int n) {

		int len = n - 1;
		int h = n - 1;
		StringBuilder result = new StringBuilder();
		int c = 0;
		while (true) {
			int i = 0;
			int j = h;
			StringBuilder sb = new StringBuilder();

			while (i < n && j < n) {
				sb.append(arr[i][j]).append(",");
				j++;
				i++;
			}

			if (c % 2 == 0) {
				String[] temp = sb.toString().split(",");
				int size = temp.length;
				for (int z = size-1 ; z >= 0 ; z--) {
					result.append(temp[z]).append(",");
				}
			} else {
				result.append(sb.toString());
			}
			c++;
			h--;
			if (h < 0)
				break;
		}
		int i = 1;
		while (n > 1 && true) {
			int idx = i;
			int x = 0;
			StringBuilder sb = new StringBuilder();
			while (idx < n) {
				sb.append(arr[idx][x]).append(",");
				idx++;
				x++;
			}
			if (i % 2 == 1) {
				String[] temp = sb.toString().split(",");
				int size = temp.length;
				for (int z = size-1 ; z >= 0 ; z--) {
					result.append(temp[z]).append(",");
				}
			} else {
				result.append(sb.toString());
			}
			i++;
			if (i >= n)
				break;
		}
		String s = result.toString();
		s= s.substring(0,s.length()-1);
		System.out.println(s);
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//		int n = 4;
//		int[][] arr = {{1,2},{3,4}};
//		int n = 2;
//		int[][] arr = {{1}};
//		int n = 1;
//		int[][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}, {31,32,33,34,35,36}};
		int n = 4;
		print(arr, n);

	}

}
