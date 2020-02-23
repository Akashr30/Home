package testOne;

public class LeaderInArray {
	

	public static void main (String[] args)
	 {
//        Scanner sc = new Scanner(System.in);
       /* int test = sc.nextInt();
        sc.nextLine();*/
        
//        while (test > 0) {
            
//            int len = sc.nextInt();
//            int[] a = {16 ,17, 4 ,3 ,5 ,2};
//            int[] a = {1,2,3,4,0};
            int[] a =  {7, 4, 5, 7, 3};
            int len = a.length;
            int max = 0;
            StringBuffer sb = new StringBuffer();
            for (int i = len-1 ; i >= 0 ; i--) {
                if (a[i] >= max) {
                    max = a[i];
                    sb.append(max+" ");
                }
            }
            
            System.out.println(sb.toString());
            
//        }
	 }


}
