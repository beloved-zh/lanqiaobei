import java.util.Scanner;


public class Main {

	/**
	 	A	B	C
	 	1
	 	2
	 	3
	 	4
	 	
	 	2		
	 	3
	 	4		1
	 	
	 	3
	 	4	2	1
	 	
 		3	1
 		4	2
 		
 			1
		4	2	3
		
		

 		
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		f(n,'A','B','C');
	}
	
	public static void f(int n,char a,char b,char c){
		
		if (n == 1) {
			System.out.println(n+" "+a+" --> "+c);
		}else {
			f(n-1, a, c, b);
			System.out.println(n+" "+a+" --> "+c);
			f(n-1, b, a, c);
		}
	}
	
}
