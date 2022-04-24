package slidingWindow;

import java.util.HashMap;
import java.util.Scanner;

class CountDistinctElementsInWindow {
 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while (t > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt();
         int a[] = new int[n];
         for (int i = 0; i < n; i++) a[i] = sc.nextInt();
         // int k = sc.nextInt();

         GfG g = new GfG();
         g.countDistinct(a, k, n);
         System.out.println();

         t--;
     }
 }
}// } Driver Code Ends
/*You are required to complete below method */
class GfG {
 void countDistinct(int arr[], int k, int len) {
     // 1 2 1 3 4 2 3
	 //using arrayList
    /* ArrayList<Integer> al = new ArrayList<>();
     int key = 0,anchor = 0;
     StringBuffer sb = new StringBuffer();
     int dups = 0;
     for (int i = 0 ; i < len ; i++) {
         
         if (al.contains(arr[i])) 
        	 dups++;
         
         key++;
         al.add(arr[i]);
         anchor++;
         
         if (anchor == k) {
             sb.append(key-dups).append(" ");
             anchor--;
             key--;
             if (al.size() > 0) {
            	 int temp = al.get(0);
                 al.remove(0);
                 if (al.contains(temp))
                	 dups--;
             }
         }
         
         
     }
     System.out.print(sb);*/
	 
//	 Using hashmap

     // 1 2 1 3 4 2 3
     HashMap<Integer,Integer> al = new HashMap<>();
     int key = 0,anchor = 0;
     StringBuffer sb = new StringBuffer();
     int dups = 0;
     for (int i = 0 ; i < len ; i++) {
         
         if (al.containsKey(arr[i])) {
        	 dups++;
        	 int mcount = al.get(arr[i])+1;
        	 al.put(arr[i],mcount);
         } else 
        	 al.put(arr[i],1);
         key++;
         
         anchor++;
         
         if (anchor == k) {
             sb.append(key-dups).append(" ");
             anchor--;
             key--;
             if (al.size() > 0 && al.get(arr[1+i-k]) != null ) {
            	 int temp = al.get(arr[1+i-k]);
            	 if (temp == 1)
                 al.remove(arr[1+i-k]);
                 else {
                	 dups--;
                	 al.put(arr[1+i-k],temp-1);
                 }
             }
         }
         
         
     }
     System.out.print(sb);
 
 }
}
