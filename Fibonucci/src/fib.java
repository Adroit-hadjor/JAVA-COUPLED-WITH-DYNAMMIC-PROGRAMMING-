
public class fib {
int first ;
int second;
public static void main(String[] args) {
	//forFib();
	int x = effiecientfibs(100);
	System.out.print(x);
	
}
static int ineffiecientfibs(int n) {
	int result = 0;
	if (n>1) {
		result = ineffiecientfibs(n-1)+ ineffiecientfibs(n-2);	
	}
	else if( n == 1) {
		result=1;
	}

	return result;
}

static void forFib(){
	   int n, a = 0, b = 0, c = 1;
    System.out.print("Fibonacci Series:");
    for(int i = 1; i <= 100; i++)
    {
        a = b;
        b = c;
        c = a + b;
        System.out.print(a+" ");
    }
    }

static int effiecientfibs(int n) {
	
	Integer memo[] = new Integer[n+1];
	int result;
	if (memo[n] != null) {
		return memo[n];
	}
	else if (n==1 || n==2) {
		result=1;
	}
	else {
		 result = effiecientfibs(n-1)+ effiecientfibs(n-2);
		
	}
	memo[n] = result;
	return result;
}


//

}
