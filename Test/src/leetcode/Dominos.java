package leetcode;

public class Dominos {
	
    public int minDominoRotations(int[] A, int[] B) {
        
        int x = 0;
        int y = 0;
        for (int i = 0 ; i < A.length-1 ; i++) {
            
            if (A[i] == B[i+1] && A[i] != A[i+1]) {
                int temp = A[i+1];
                A[i+1] = B[i+1];
                B[i+1] = temp;
                x++;
            } else if (B[i] == A[i+1] && B[i] != B[i+1]) {
                int temp = B[i+1];
                B[i+1] = A[i+1];
                A[i+1] = temp;
                y++;
            }
            
//            if (A[i] != B[i+1] && A[i] != A[i+1])
//                return -1;
//            else if (B[i] != B[i+1] && B[i] != A[i+1])
//                return -1;
        }
        
        boolean aFlag = true;
        boolean bFlag = true;
        for (int i = 0 ; i < A.length-1 ; i++) {
            if (A[i] != A[i+1]) {
                aFlag = false;
                break;
            }
        }
        
        for (int i = 0 ; i < B.length -1 ; i++) {
            if (B[i] != B[i+1]) {
                bFlag = false;
                break;
            }
        }
        
        if (!aFlag && !bFlag)
            return -1;
        else if (aFlag && bFlag)
            return Math.min(x,y);
        
        return aFlag ? x : y;
    }

	public static void main(String[] args) {
		
		 int[] A = {2,1,2,4,2,2};
		 int[] B = {5,2,6,2,3,2};
		 Dominos a = new Dominos();
		 System.out.println(a.minDominoRotations(A,B));
	}

}
