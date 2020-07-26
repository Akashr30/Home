package leetcode;

import java.util.HashSet;

public class PathCrossing {
	
public static boolean isPathCrossing(String path) {
        

        if (path.length() < 2)
            return false;
        
        boolean[][] arr = new boolean[path.length()][path.length()];
        int n = 0 , s = 0 , e = 0 , w = 0;
        HashSet<String> hs = new HashSet<>();
        hs.add("00");
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < path.length() ; i++) {
            
            if (path.charAt(i) == 'N') {
                n++;
                sb.append(n).append(e);    
            }
            
            else if (path.charAt(i) == 'E') {
                e++;
                sb.append(n).append(e);
            }          
            else if (path.charAt(i) == 'S') {
                n--;                
                sb.append(n).append(e);
            }
            
            else if (path.charAt(i) == 'W') {
                e--;
                sb.append(n).append(e);
            }
            if (hs.contains(sb.toString())) {
                return true;
            }
            hs.add(sb.toString());
            sb.setLength(0);
            
        }
        return false;
    }
	
	public static void main(String[] ar) {
		
		String s = "NES";
		System.out.println(isPathCrossing(s));
	}
}
