package testOne;

import java.util.HashSet;
import java.util.Scanner;

public class SwappingPairsMakeSumEqual {

	public static void main (String[] args)
	 {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    int a1[]=new int[n1];
		    int a2[]=new int[n2];
		    int sum1=0,sum2=0;
		    HashSet<Integer> hs=new HashSet<>();
		    for(int i=0;i<n1;i++){
		        a1[i]=sc.nextInt();
		        sum1=sum1+a1[i];
		        hs.add(a1[i]);
		    }
		    for(int i=0;i<n2;i++){
		        a2[i]=sc.nextInt();
		        sum2=sum2+a2[i];
		    }
		   
		    int c=0;
		    boolean flag = true;
		    int diff = Math.abs(sum1-sum2);
		    for(int i=0;i<n2;i++){
		        if(hs.contains(diff-a2[i])){
		           flag = false;
		            System.out.println(1);
		            break;
		        }
		    }
		    if (flag) {
		        System.out.println(-1);
		    }
		}
	}

	
}
