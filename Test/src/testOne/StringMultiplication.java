package testOne;

import java.util.Scanner;

/*
public class StringMultiplication {
	
	 public static String multiply(String a,String b){
         
         double d1=Double.parseDouble(a);  
        double d2=Double.parseDouble(b);  
         
         double l3 = d1*d2;
         
         String s=String.valueOf(l3);
         s = s.substring(0,s.length()-2);
         System.out.println(s);
         System.out.println(Double.parseDouble(s));
         return "s";
     }

	public static void main(String[] args) {
        String a = "946515891658918998198616894894986489";
        String b = "6464";
//		multiply (a,b);
        String x = "abc";
        String y = "abcdefghi";
        char[] xx = x.toCharArray();
        int[] a1 = new int[a.length()];
        System.out.println(y.indexOf(x.charAt(1)));
        
	}

}*/


class StringMultiplication
{
	public static void main(String args[])
	{
		/*Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{*/
//			String line = sc.nextLine();
			/*String a = "lrnkbldxguzgcseccinlizyogwqzlifxcthdgmanjztlt  "; 
			String b = "htacioho";*/
		String a = "lrnkbldxguzgcseccinlizyogwqzlifxcthdgmanjztlt ";
			String b = "an";
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
		/*	t--;
		}*/
	}
}

/*This is a function problem.You only need to complete the function given below*/
/*
the function returns the 
position where the target string 
matches the string str
Your are required to complete this method */
class GfG
{
    int strstr(String str, String target)
    {
        //  int firstOccurence = -1;
     int[] pos1 = new int[target.length()];
     int pos2 = 0;
    boolean isTrue = true;
     
     for (int i = 0 ; i < target.length() ; i++){
         pos1[i] = str.indexOf(target.charAt(i));
         if (pos1[i]==-1){
            //  System.out.println(-1);
            isTrue = false;
             break;
         }
         	if (i!=0 && (pos1[i]-pos1[i-1])==1) {
         		isTrue = true;
         	} else if (i!=0 &&(pos1[i]-pos1[i-1])!=1){
         		isTrue = false;
         		break;
         	}
         }
         
          if (isTrue){
         pos2 = pos1[0]; 
         } else 
         pos2 = -1;
         
         return pos2;
     }
     
    
    //  boolean isTrue = false;
     /*for (int y = 0 ; y < pos1.length-1 ; y++){
         if ((pos1[y+1]-pos1[y]) == 1){
             continue;
            //  isTrue = true;
         } else {
             System.out.println(-1);
             break;
         }
     }*/
    //  if (isTrue)
     
    
}

