package testOne;

/*public class FindThreeNumbers {

}*/

import java.util.*;
class FindThreeNumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){int i=0;
			int n=sc.nextInt();
			int[] a=new int[1000];
			while(i<n){
				a[i]=sc.nextInt();
				i++;
			}
			GfGsd g=new GfGsd();
			ArrayList aa = g.find3Numbers(a,n);
			if(aa.size()==3)
			{int x=(int)aa.get(0);
			int y=(int)aa.get(1);
			int z=(int)aa.get(2);
			if(x<y && y<z)
				System.out.println("1");
			else
			System.out.println("0");
			}
			else{
				System.out.println("0");
			}
		}
	}
}// } Driver Code Ends
/*Complete the function below*/
class GfGsd {
	public static ArrayList find3Numbers(int[] a,int n){
        
       int[] b1 = new int[3];
       int max = 0;
       int count = 0;
       ArrayList<Integer> al = new ArrayList<Integer>();
       for (int i = 0 ; (i < n && count != 3 ); i++ ) {
           
           if (a[i] > max) {
               max = a[i];
               b1[count] = max;
               count++;
           } else {
               b1[0] = 0;
               b1[1] = 0;
               b1[2] = 0;
               count = 0;
               max = a[i];
               b1[count] = max;
               count++;
           }
       }
       
       for (int j = 0 ; j < 3 ; j++) {
           al.add(b1[j]);
       }
       
       return al;
    }
}
