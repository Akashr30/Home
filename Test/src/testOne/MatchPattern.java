package testOne;

import java.util.*;

public class MatchPattern
{	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-- != 0)
		{
			int n=sc.nextInt();
			ArrayList<String> s = new ArrayList<String>(n);
			for (int i=0;i<n;i++)
			{
			s.add(sc.next());
			}

			String tt;
			tt=sc.next();
			GfGMatchPattern g=new GfGMatchPattern();
			ArrayList<String> res =g.findMatchedWords(s, tt);
					Collections.sort(res);
			for (int i = 0;i < res.size();i++)
			{
			System.out.print(res.get(i)+" ");
			}
			System.out.println();

		}
	}
}// } Driver Code Ends
/*Complete the provided function*/
class GfGMatchPattern{
public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    
	    char[] ch = pattern.toLowerCase().toCharArray();
	    int[] arr = new int[26];
	    ArrayList<String> ar = new ArrayList<>();
	    
	    for (int i = 0 ; i < ch.length ; i++ ) {
//	        arr[i] = ch[i]-'a';
	        arr[ch[i]-'a']++;
	    }
	    
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0 ; i < arr.length ; i++) {
	        if (arr[i] != 0 ) {
	            sb.append(arr[i]);
	        }
	    }
	    
	    if(sb.toString().length() < 1) {
	        sb.append("0");
	    }
     
     StringBuffer arsb = new StringBuffer();
     for (int i = 0 ; i < dict.size();i++) {
         
         char[] tempCh = dict.get(i).toLowerCase().toCharArray();
         int[] arr1 = new int[26];
         
         for (int j = 0 ; j < tempCh.length ; j++ ) {
//	            arr1[j] = ch[j]-'a';
	            arr1[tempCh[j]-'a']++;
	        }
	        
	        for (int k = 0 ; k < arr1.length ; k++) {
	 	        if (arr1[k] != 0 ) {
	 	            arsb.append(arr1[k]);
	 	        }
	        }
	        
	        if (arsb.toString().length() < 1) {
	            arsb.append("0");
	        }
	        
	        if (sb.toString().equalsIgnoreCase(arsb.toString())) {
	            ar.add(dict.get(i));
	            arsb.setLength(0);
	        } else {
	        	arsb.setLength(0);
	        }
         
     }
 
     return ar;
 	    
	}
}