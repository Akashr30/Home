package leetcode;

import java.util.Arrays;

public class FindAndReplace {
	
	public static String findReplaceString(String S, int[] indexes, String[] sources,
											String[] targets) {
        
/*        for (int i = 0 ; i < indexes.length;i++) {
            int idx = indexes[i];
            String str = sources[i];
            int len = str.length();
            String extract = S.substring(idx,idx+len);
            if (str.equals(extract)) {
                StringBuffer sb = new StringBuffer();
                sb.append(S.substring(0,idx)).append(targets[i])
                .append(S.substring(idx+len,S.length()));
                S = sb.toString();

            }
            if(S.contains(str)) {
            	S = S.replace(str,targets[i]);
            }
        }
        return S;*/
		/*  String temp = "";
		  boolean flag = true;
	        for (int i = 0 ; i < indexes.length;i++) {
	            int idx = indexes[i];
	            String str = sources[i];
	            int len = str.length();
	            String extract = S.substring(idx,idx+len);
	            if (str.equals(extract)) {
	                StringBuffer sb = new StringBuffer();
	                sb.append(S.substring(0,idx)).append(targets[i])
	                .append(S.substring(idx+len,S.length()));
	                S = sb.toString();

	            }
	            if(S.contains(str)) {
	                if (flag) {
	            	    temp = S.replace(str,targets[i]);
	                    flag = false;
	                } else 
	                    temp = temp.replace(str,targets[i]);
	            }
	        }
	        return temp;*/
		/*List<int[]> sorted = new ArrayList<>();
        for (int i = 0 ; i < indexes.length; i++) sorted.add(new int[]{indexes[i], i});
        Collections.sort(sorted, Comparator.comparing(i -> -i[0]));
        for (int[] ind: sorted) {
            int i = ind[0], j = ind[1];
            String s = sources[j], t = targets[j];
            if (S.substring(i, i + s.length()).equals(s)) S = S.substring(0, i) + t + S.substring(i + s.length());
        }
        return S;*/
		/* Map<Integer, Integer> table = new HashMap<>();
	        for (int i=0; i<indexes.length; i++) {
	            // if a match is found in the original string, record it
	            if (S.startsWith(sources[i], indexes[i])) {
	                table.put(indexes[i], i);
	            }
	        }
	        StringBuilder sb = new StringBuilder();
	        for (int i=0; i<S.length(); ) {
	            if (table.containsKey(i)) {
	                // if a replacement was recorded before
	                sb.append(targets[table.get(i)]);
	                i+=sources[table.get(i)].length();
	            } else {
	                // if no replacement happened at this index
	                sb.append(S.charAt(i));
	                i++;
	            }
	        }
	        return sb.toString();*/
		 StringBuilder sb = new StringBuilder(S);
	        int len = S.length();
	        int[] indexValInvert = new int[len];
	        Arrays.fill(indexValInvert, -1);
	        for (int i = 0; i < indexes.length; ++i) { indexValInvert[indexes[i]] = i; }
	        for (int i = len - 1; i >= 0; --i) {
	            int j = indexValInvert[i];
	            if (j < 0) { continue; }
	            if (S.substring(indexes[j]).startsWith(sources[j])) {
	                sb.replace(indexes[j], indexes[j] + sources[j].length(), targets[j]);
	            }
	        } 
	        return sb.toString();
    }
	
	public static void main(String[] ar) {
		
		/*String s = "jjievdtjfb";
		int[] idx = {4,6,1};
		String[] src = {"md","tjgb","jf"};
		String[] tgt = {"foe","oov","e"};*/
		String s = "abcd";
		int[] idx = {0, 2};
		String[] src = {"a", "cd"};
		String[] tgt = {"eee", "ffff"};
		findReplaceString(s,idx,src,tgt);
	}
}
