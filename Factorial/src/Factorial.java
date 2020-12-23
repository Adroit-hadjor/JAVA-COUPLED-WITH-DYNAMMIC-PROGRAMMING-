
public class Factorial {
	static int fact(int n) {
		if(n>=1) {
		int x = n*fact(n-1);
		System.out.println(x);
		return x;
		}
		else {return 1 ;}
		
	}
public static void main(String[] Args) {
	
	fact(4);
}


}



