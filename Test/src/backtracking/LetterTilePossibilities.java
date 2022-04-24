package backtracking;

import java.util.HashSet;

public class LetterTilePossibilities {
	
    public int numTilePossibilities(String tiles) {
        HashSet<String> res = new HashSet<>();
        boolean[] arr = new boolean[tiles.length()];
        find(tiles,arr,"",res);
        return res.size();
    }
    
    private void find(String str, boolean[] arr ,String value,HashSet<String> set) {
        
        
        for (int i = 0 ; i < str.length() ; i++) {
            
            if (arr[i])
                continue;
            arr[i] = true;
            value += str.charAt(i);
            set.add(value);
            find(str,arr,value,set);
            arr[i] = false;
            value = value.substring(0,value.length()-1);
        }
        
    }

	public static void main(String[] args) {
		
		String str = "AAB";
		new LetterTilePossibilities().numTilePossibilities(str);
	}

}
