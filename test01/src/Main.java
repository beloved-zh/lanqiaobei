import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		if (y < 1990 || y > 2050) {
			System.out.println("no");
			return;
		}
		
		if(y%4==0&&y%100!=0||y%400==0){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}
}