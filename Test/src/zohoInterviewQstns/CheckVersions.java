package zohoInterviewQstns;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class CheckVersions {
	
	 public static int compareVersion(String A, String B) {
	        A = A.replaceFirst("^0*","");
	        B = B.replaceFirst("^0*","");
	        
	        String[] arrA = A.split("\\.");
	        String[] arrB = B.split("\\.");
	        
	        int length = Math.max(arrA.length, arrB.length);
	        for (int i=0;i<length;i++) {
	            if (i < arrA.length && i < arrB.length) {
	                if (arrA[i].length() > arrB[i].length()) {
	                	return 1;
	                }
	                else if (arrA[i].length() < arrB[i].length()) {
	                	return -1;
	                }
	            }
	            
	            Long n1 = i<arrA.length ? Long.parseLong(arrA[i]) : 0;
	            Long n2 = i<arrB.length ? Long.parseLong(arrB[i]) : 0;
	            
	            int comp = n1.compareTo(n2);
	            if (comp != 0) 
	            	return comp;
	        }
	        
	        return 0;
	    }
	/*public static int compareVersion(String S1, String S2)
    {
        StringTokenizer v1St = new StringTokenizer(S1, ".");
        StringTokenizer v2St = new StringTokenizer(S2, ".");
        int v1Count = v1St.countTokens();
        int v2Count = v2St.countTokens();
        if(v1Count < v2Count)
        {
            for(int i = 0; i < v1Count; i ++)
            {
                BigInteger v1 = new BigInteger(v1St.nextToken());
                BigInteger v2 = new BigInteger(v2St.nextToken());
                if(!v1.equals(v2))
                {
                    return v1.compareTo(v2);
                }
            }
            while(v2St.hasMoreTokens())
            {
                if(! new BigInteger(v2St.nextToken()).equals(BigInteger.ZERO)) return -1;
            }
        }
        else if(v2Count < v1Count)
        {
            for(int i = 0; i < v2Count; i ++)
            {
                BigInteger v1 = new BigInteger(v1St.nextToken());
                BigInteger v2 = new BigInteger(v2St.nextToken());
                if(!v1.equals(v2))
                {
                    return v1.compareTo(v2);
                }
            }
            while(v1St.hasMoreTokens())
            {
                if(! new BigInteger(v1St.nextToken()).equals(BigInteger.ZERO)) return 1;
            }
        }
        else
        {
            for(int i = 0; i < v1Count; i ++)
            {
                BigInteger v1 = new BigInteger(v1St.nextToken());
                BigInteger v2 = new BigInteger(v2St.nextToken());
                if(! v1.equals(v2))
                    return v1.compareTo(v2);
            }
        }
        return 0;
}*/
	
	public static void main(String[] args) {
		
		String A = "9.0001";
		String B = "1.01";
		
//		System.out.println(compareVersion(A,B));
		
		String[] str1 = A.split("\\.");
		String[] str2 = B.split("\\.");
		
		int max = Math.max(str1.length, str2.length);
		boolean flag = true;
		for (int i = 0 ; i < max ; i++) {
			
			if (i < str1.length && i < str2.length) {
				if (str2[i].length() > str1[i].length()) {
					System.out.println("Upgraded");
					flag = false;
					break;
				} else if (str1[i].length() > str2[i].length()) {
					System.out.println("DownGraded");
					flag = false;
					break;
				}
			}
			
			Long x = i < str1.length ? Long.parseLong(str1[i]):0;
			Long y = i < str2.length ? Long.parseLong(str2[i]):0;
			
			int comp = y.compareTo(x); 
			if (comp == 1) {
				System.out.println("Upgraded");
				flag = false;
			} else if (comp == -1 ) {
				System.out.println("DownGraded");
				flag = false;
			}
		}
		
		if (flag) 
			System.out.println("Equal");
		
	}
}
