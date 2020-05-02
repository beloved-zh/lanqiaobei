
public class Fibnaci {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(f(i)+" ");
		}
	}
	
	public static int f(int n){
		if (n == 1 || n == 2) {
			return 1;
		}else {
			return f(n-1)+f(n-2);
		}
	}
}
