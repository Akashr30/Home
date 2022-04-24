package leetcode;

public class CompareVersion {
	
	public static int compareVersions(String version1, String version2) {
        
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        
        // System.out.println(str1.length+".."+str1.length);
        
        int max = Math.max(str1.length,str2.length);
        
        for (int i = 0 ; i < max ; i++) {
            
            int temp1 = i < str1.length ? Integer.parseInt(str1[i]) : 0;
            int temp2 = i < str2.length ? Integer.parseInt(str2[i]) : 0;
            
            if (temp2 > temp1)
                return -1;
            else if (temp1 > temp2)
                return 1;
            
        }
        return 0;
    }

	public static void main(String[] args) {
		
		String str1 = "7.5.2.4";
		String str2 = "7.5.3";
		compareVersions(str1,str2);
	}

}
