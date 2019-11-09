package testOne;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BoxingConcepts {
	
	public int x = 5;
	
//	public static void m1(Object o) {
//		System.out.println("Object");
//	}
	
//	public static void m1(long o) {
//		System.out.println("Long");
//	}
	
	/*public  String toString () {
		
		return "method 1 executed";
	}
	
public  String toString2 () {
		
		return "method 2 executed";
	}*/
/*	static int factorialMethod (int n) {	// 5 //4 // 3 //2
		if (n == 1 ) {						//false// fa//fa //fals
			return 1;						//
		}								//
		else {
			return (n*factorialMethod(n-1));		
			// (5 * fa(4) * 4 * fa(3) * 3 *  2  * 1   ) = 120
		}
	}
*/
	static int justCheck() {
		return 5 ;
	}
	public static void main(String[] args) {
		// 
//		long l = 2147483647;
//		int x =10;
//		m1(x);
		/*
		BoxingConcepts bc = new BoxingConcepts();
		System.out.println((new String("jkdxvnjxlkd")));*/
		/*String s1 = new String("abc");
		System.out.println(s1);
		String s2 = s1;
		System.out.println("s2 = "+s2);*/
		/*int[] a = {1,2,3,4};
		int k = 1;
		int data[] = new int[a.length];
		
		 for ( int i = 0 ; i < a.length ; i++ ){
//	          for ( int j = a.length-k ; j < a.length ; j++ ) {
	            data[i] = a[a.length-k];
//	        }
	          k++;
	          System.out.println("array is " +data[i]);
	        }
		 */
		/*
		char[] ch = {'q','a','s','d'};
		char ch2[] = {'q','z','q','z'};
		
		String s = new String(ch);
		String s1 = new String(ch2);
		
		System.out.println(s+"\n"+s1);*/
		/*final StringBuffer sb = new StringBuffer("solutions");
		sb.append("I'm");
		sb.append("Iron ");
		sb.append("man");
		
//		sb = new StringBuffer("yes yes yes"); reassignment not possible after using the final keyword
		
		System.out.println("sb : "+sb);
		
		String s = new String (sb);
		System.out.println("string : "+s);
		
		String foo = "foo"; foo += "bar";
		System.out.println(foo);*/
		
		/*int x = 10;
		int y = x;
		
		x++;
		
		System.out.println(x);
		System.out.println(y);*/
		
		// Interning with string
		
		/*String s1 = "hello";
		String s2 = s1.intern();
		System.out.println("String 1 : "+s1+"\n"+"String 2 : "+s2);
		*/
		
		/*int[][] arr = { 
				{1,2,3,5,6,7},
				{7,8,9,4,5,6}
		};
		
		System.out.println("lenght : "+ arr[0][0]);
//		double a = 10.25;
//		int b = (int)a;
		int a = 3,b=2;*/
		/*for ( int i = 0 ; i < 10 ; i++) {
			
		}
		int[] k = new int[20];
		System.out.println();
		*/
/*		int[][]  arr = {
				{1 ,1 ,1 ,0 ,0 ,0},
				{0 ,1 ,0 ,0 ,0 ,0},
				{1 ,1 ,1 ,0 ,0 ,0},
				{0 ,0 ,2 ,4 ,4 ,0},
				{0 ,0 ,0 ,2 ,0 ,0},
				{0 ,0 ,1 ,2 ,4 ,0}
		};
		
	       int jC = 0;
	       int iC = 0;
	       int counts = 0;
	       int[] k = new int[20];
	       int sum = 0;
	       int ind = 0;
	       int j = 0;
	        for ( int i= 0 ; i < (((arr[0].length)/2)+iC) ; i++) {
	            if (!(i+2 <= 6)){
	                break;
	            }
	            if (!(i%2==0) && i != 0){
	                sum += arr[i][j+1];
	                continue;
	            }
	                for ( j = i ; j < (((arr[1].length)/2)+jC); j++ ){
	                    sum = sum+(arr[i][j]);
	                    counts = counts+1;
	                    if (counts == 5){
	                        k[ind] = sum;
	                        sum = 0;
	                        iC = iC+1;
	                        ind++;

	                    }
	                   
	                    
	                }
	                if (!(j+2 <= 6)){
                        break;
                    }
	                jC++;
	        }

	        Arrays.sort(k);
	       System.out.println(k[k.length-1]);
*/
		/*int[] a = {41,73, 89, 7, 10, 1, 59 ,58, 84, 77, 77, 97, 58, 1 ,86, 58, 26 ,10, 86, 51};
		int d = 10;
		
		for ( int j = 0 ; j < d ; j++){
            int first = a[j];
            int last = a[a.length-1];
            a[j] = last;
            a[a.length-1] = first;
            a[a.length-1] = first;
            
			
        }
        for ( int k = 0 ; k < a.length ; k++){
        System.out.print(a[k]+" ");
        }
		*//*
		int[] a = {1,2,3,4,5};
		int d = 4;*/
		/*int first = a[0];
        for ( int j = 0 ; j < d; j++){
//             first = a[j];
//            int last = a[a.length-1];
            // a[j] = last;
            // a[a.length-1] = first;
            a[j+0]= a[j+1];
        }
        a[a.length-1] = first;
        for ( int k = 0 ; k < a.length ; k++){
        System.out.print(a[k]+" ");
        }*/
		/*int last = 0;
		int first = 0;
		for (int i = 0 ; i < d ; i++) {
			last = a[0];
			for(int j =1; j < a.length ; j++) {
				
				a[j-1] = a[j];
			}
			a[a.length-1] = last;
			
		}
		for(int f : a) {
			System.out.print(f+" ");
		}*/
	/*	int[] a = { -5,-6,-48,-6,-2,-36,-1};
		Arrays.sort(a);
//		System.out.print(a[a.length-1]);
		System.out.print(Integer.MIN_VALUE);
		
		/*int[][] add = new int[arr[0].length][arr[1].length]; 
        int min = Integer.MIN_VALUE;
        int i=0,j=0,k=0;
        for( i = 0 ; i < arr[0].length; i++){
            if ( i < 4 && j < 4 ){
            for ( j = 0 ; j < arr[1].length ; j++) {
                add[k] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j]+arr[i][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            }
            k++;
        }
        }
        Arrays.sort(add);	
        if ((add.length-1) > min){
            return (add.length-1);
        } else 
        return min;*/
		/*Object obj = new String("GeeksForGeeks"); 
        Class c = obj.getClass(); 
        System.out.println(obj); 
        
        Collection abc = new ArrayList<String>();*/
		
		
//		System.out.println("factorial is : "+factorialMethod(5));
		Integer i = 5;
		int j=0;
		j=i;
		System.out.println(j);
	}
	
		

}
