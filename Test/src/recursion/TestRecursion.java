package recursion;

public class TestRecursion {
	
	static int fib(int n)
    {
    if (n <= 1)
       return n;
    
    int temp1 = fib(n-1);
    int temp2 = fib(n-2);
    
    return temp1 + temp2;
    }
      
	public static void main(String... a) {
		
		int n = 5;
		System.out.println(fib(n));
		
	}

}

static int fib(int n) // n = 5
{
if (n <= 1)
   return n;

int temp1 = fib(n-1); // 3
int temp2 = fib(n-2); // 

return temp1 + temp2; 
}

static int fib(int n) // n = 3
{
if (n <= 1)
   return n;

int temp1 = fib(n-1);  // 2
int temp2 = fib(n-2); // 1

return temp1 + temp2; // 3
}

static int fib(int n) // n = 3
{
if (n <= 1)
   return n;

int temp1 = fib(n-1);  // 2
int temp2 = fib(n-2); // 1

return temp1 + temp2; // 3
}


