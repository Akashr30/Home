package testOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SlidingWindow { public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        // int k = sc.nextInt();

        GfGCountElements g = new GfGCountElements();
        g.countDistinct(a, k, n);
        System.out.println();

        t--;
    }
}
}
class GfGCountElements {
void countDistinct(int A[], int k, int n) {
    
    if (k > n) {
        
        System.out.println(-1);
        return;
    }
    
    // Queue<Integer> queue =  new LinkedList<>(); 
    ArrayList<Integer> queue = new ArrayList<>();
    StringBuffer sb = new StringBuffer();
    Set<Integer> set = new HashSet<>();
    for (int i = 0 ; i < k ; i++) {
        queue.add(A[i]);
        set.add(A[i]);
    }
    sb.append(set.size()+" ");
    for (int i = k ; i < n ; i++) {
        
        int temp = queue.remove(0);
        if (!queue.contains(temp)) {
            set.remove(temp);
        }
        queue.add(A[i]);
        if (!set.contains(A[i])) {
            set.add(A[i]);
        }
        
        sb.append(set.size()+" ");
    }
    
    System.out.print(sb);

}
}
 