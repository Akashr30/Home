package leetcode;

import java.util.Arrays;

public class DecodingStringAtIndex {
	
    public String[] splited(String s) {
        String[] arr = new String[s.length()+1];
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < s.length() ; i++) {
            
            if (Character.isDigit(s.charAt(i))) {
                arr[c++] = sb.toString();
                sb.setLength(0);
                for (int j = i ; j < s.length() ; j++) {
                	if (!Character.isDigit(s.charAt(j))){
                		i = j-1;
                		break;
                	}
                	sb.append(s.charAt(j));
                }
            } else {
                
                if (sb.toString().length() > 0 && Character.isDigit(sb.toString().charAt(0))) {
                    arr[c++] = sb.toString();
                    sb.setLength(0);
                }
                sb.append(s.charAt(i));
            }
        }
        
            arr[c++] = sb.toString();
        
        return Arrays.copyOfRange(arr, 0, c);
    }
    
    
    public String decodeAtIndex(String S, int K) {
        
        /*if (k == 1)
            return s.charAt(0)+"";
        
        String[] arr = splited(s);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < arr.length ; i++) {
            String str = sb.toString();
            
            if (Character.isDigit(arr[i].charAt(0))) {
                long temp = Long.parseLong(arr[i]);
                for (int j = 1 ; j < temp ; j++) {
                    sb.append(str);
                }
                
            } else {
                sb.append(arr[i]);
            }
            if(sb.toString().length() >= k)  {
                // System.out.println(sb.toString());
                return sb.toString().charAt(k-1)+"";
            }
        }
        
        return "";*/
    	
    	int N = S.length(); 
        long size = 0; 
  
        // finding size = length of new string S'  
        for (int i = 0; i < N; ++i) 
        { 
            if (Character.isDigit(S.charAt(i))) 
            { 
                size = size * (S.charAt(i) - '0'); 
            }  
            else
            { 
                size += 1; 
            } 
        } 
  
        // get the K-th letter  
        for (int i = N - 1; i >= 0; --i)  
        { 
            K %= size; 
            if (K == 0 && Character.isAlphabetic(S.charAt(i))) 
            { 
                return (String) "" + S.charAt(i); 
            } 
  
            if (Character.isDigit(S.charAt(i)))  
            { 
                size = size / (S.charAt(i) - '0'); 
            }  
            else 
            { 
                size -= 1; 
            } 
        } 
        return ""; 
    }

	public static void main(String[] args) {
		
//		String s = "leet2code3";
		String s = "y959q969u3hb22odq595";
		int n = 222280369;
		System.out.println(new DecodingStringAtIndex().decodeAtIndex(s, n));

	}

}
