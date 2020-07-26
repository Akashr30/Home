package testOne;

public class CheckIfStraightLine {

	public static void main(String[] args) {
		

        int[][] coordinates = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        boolean flag = true;
        int prev1 = -1;
        int prev2 = -1;
        for (int i = 0 ; i < coordinates.length -1 ; i++) {
            
            int x1 = coordinates[i][0];
            int y1 = coordinates[i][1];
            
            int x2 = coordinates[i+1][0];
            int y2 = coordinates[i+1][1];
            
            int ans1 = Math.abs(x1-x2);
            int ans2 = Math.abs(y1-y2); 
            
            
            
            // if (ans1 != ans2 ) {
            //     flag = false;
            //     break;
            // }
            
            if (prev1 == -1) {
                prev1 = ans1;
                prev2 = ans2;
            }
            
            if (prev1 != ans1 || prev2 != ans2) {
                flag = false;
                break;
            }
            
            
        }
        
//        return flag;
        System.out.println(flag);

	}

}
