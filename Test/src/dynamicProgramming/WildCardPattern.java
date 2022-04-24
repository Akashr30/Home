package dynamicProgramming;

import java.util.*;

class WildCardPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String pat = "b*aeb";
			String text = "baefghzxcabab";
			GfG g = new GfG();
			System.out.println(g.wildCard(pat,text));
			t--;
		}
	}
}// } Driver Code Ends
class GfG
{
 int wildCard(String pattern, String str)
 {
     
     char[] sstr = str.toCharArray();
     char[] ptr =  pattern.toCharArray();
     int n = sstr.length;
     int m = ptr.length;
     int i = 0,j = 0,index_txt = -1, 
             index_pat = -1;
     while (i < n) {
    	 
         if (j < m && (sstr[i] == ptr[j] || ptr[j] == '?' )) {
             i++;
             j++;
         } 
         /*else if (j < m && ptr[j]=='*') {
             j++;
         } else if (j !=0) {
             i++;
         }*/
         
         else if (j < m && ptr[j] == '*')  
         { 
             index_txt = i; 
             index_pat = j; 
             j++; 
         } 
   
         // For step - (5) 
         else if (index_pat != -1)  
         { 
             j = index_pat + 1; 
             i = index_txt + 1; 
             index_txt++; 
         } else 
         { 
             return 0; 
         } 
         
     }
     while (j < m && ptr[j] == '*') 
     { 
         j++; 
     } 
   
     // Final Check 
     if (j == m)  
     { 
         return 1; 
     } 
   
     return 0;
 }
}
