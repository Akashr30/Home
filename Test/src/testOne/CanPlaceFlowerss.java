package testOne;

public class CanPlaceFlowerss {
	
    public static boolean canPlaceFlowers(int[] arr, int n) {
        
        if (n > arr.length)
            return false;
        
        if (arr.length == 1) {
            if (arr[0] == 0 && n == 1)
                return true;
            else if (arr[0] == 1 && n == 0)
                return true;
            else 
                return false;
        }
        
        int count1 = n;
        int count2 = n;
        
        for (int i = 0 ; i < arr.length ; i=i+2) {
            
            if (i!=0 && i != arr.length-1) {
                 if (arr[i] == 0 && arr[i-1] == 0 && arr[i+1] == 0)
                     count2--;
            } else if (i == 0) {
                if (arr[i] == 0 && arr[i+1] == 0)
                    count2--;
            } else if (i == arr.length-1) {
                if (arr[i] == 0 && arr[i-1] == 0)
                    count2--;
            }
            
        }
        
        if (count2-- <= 0)
        	return true;
        
        
        for (int i = 1 ; i < arr.length ; i=i+2) {
        	if (i == arr.length-1) {
        		if (arr[i] == 0 && arr[i-1]==0)
        			count1--;
        	} else if (arr[i] == 0 && arr[i-1] == 0 && arr[i+1] == 0)
                count1--;
        }
        
        return count1 <= 0;
    }

	public static void main(String[] args) {
		
		int[] arr = {0,1,0,1,0,1,0,0};
		int n = 1;
		canPlaceFlowers(arr,n);

	}

}
