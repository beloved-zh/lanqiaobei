import java.util.Scanner;


/**
 * FJ���ַ���
 */
public class BASIC_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(f(n));
	}
	
	public static String f(int n){
		if (n == 1) {
			return "A";
		} else {
			return f(n-1)+(char)('A'+n-1)+f(n-1);
		}
	}
	
	
}
