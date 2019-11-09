package testOne;

import java.util.Scanner;

public class SmallestMissingPositive {
	
	private String abc = "ab";
	
	

	public String getAbc() {
		return abc;
	}



	private void setAbc(String abc) {
		this.abc = abc;
	}



	/*public static void main(String[]  rgs){
//		int[]arr={-47,1,4,49,-18,10,26,18,-11,-38,-24,36,44,-11,45,20,-16,28,17,-49,47,-48,-33,42,2,6,-49,30,36,-9,15,39,-6,-31,-10,-21,-19,-33,47,21,31,25,-41,-23,17,6,47,3,36,15,-44,33,-31,-26,-22,21,-18,-21,-47,-31,20,18,-42,-35,-10,-1,46,-27,-32,-5,-4,1,-29,5,29,38,14,-22,-9,0,43,-50,-16,14,-26,95};
		int[]arr={37, 6, -7 ,41, -23, 15, 9, -14, -18, 1,2, -13, -22, 25, -43 ,24 };
		int min=1;
		for(int x=1;x<arr.length;x++){
			int val = arr[x];
			if (arr[x]>0&&min==arr[x]){
				min++;
			}
		}
		System.out.println(min);
		int max = 0;
		for (int x = 0 ; x < arr.length ; x++){
//            int val = in.nextInt();
            if (arr[x] > max){
                max = arr[x];
            }
        }
		System.out.println(max);
		
        int[] arr2 = new int[max+1];
        for (int x = 0 ; x < arr.length-1 ; x++) {
            if (arr[x] > 0)
            arr2[arr[x]]++;
        }
        
        for (int j = 1 ; j < arr2.length;j++){
            if (arr2[j]==0){
                min = j;
                break;
            }
        }
          
         System.out.println(min);
	}*/
	public static void main (String[] args)
	 {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        
        for (int i = 0 ; i < tc ; i++) {
            
            int len = in.nextInt();
            int[] arr = new int[len];
            int max = 0;
            int min = 1;
            for (int x = 0 ; x < len ; x++){
                int val = in.nextInt();
                if (val > max){
                    max = val;
                }
                arr[x] = val;
            }
            
           int[] arr2 = new int[max+2];
           for (int x = 0 ; x < arr.length ; x++) {
               if (arr[x] > 0){
                   arr2[arr[x]]++;
               }
           }
           
           for (int j = 1 ; j < arr2.length;j++){
               if (arr2[j]==0){
                   min = j;
                   break;
               }
           }   
             
            System.out.println(min);
        }
        
        
	 }
	
	/*
	 * public static void main (String[] args)
	 {
         Scanner in = new Scanner(System.in);
         int tc = in.nextInt();
         
         for (int i = 0 ; i < tc ; i++) {
             
             int len = in.nextInt();
             int[] arr = new int[len];
             int max = 0;
             int min = 1;
             for (int x = 0 ; x < len ; x++){
                 int val = in.nextInt();
                 if (val > max){
                     max = val;
                 }
                 arr[x] = val;
             }
             
            int[] arr2 = new int[max+2];
            for (int x = 0 ; x < arr.length ; x++) {
                if (arr[x] > 0){
                    arr2[arr[x]]++;
                }
            }
            
            for (int j = 1 ; j < arr2.length;j++){
                if (arr2[j]==0){
                    min = j;
                    break;
                }
            }   
              
             System.out.println(min);
         }
         
         
	 }*/
}
