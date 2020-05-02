import java.util.Scanner;


/**
 *回形取数 
 */
public class BASIC_25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] arr = new int[m][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int t = 0,x = -1,y = 0;
		while (t < m * n) {
			while (x + 1 < m && arr[x + 1][y] != -1) {
				System.out.print(arr[++x][y]+" ");
				arr[x][y] = -1;
				++t;
			}
			while (y + 1 < n && arr[x][y + 1] != -1) {
				System.out.print(arr[x][++y]+" ");
				arr[x][y] = -1;
				++t;
			}
			while (x - 1 >= 0 && arr[x - 1][y] != -1) {
				System.out.print(arr[--x][y]+" ");
				arr[x][y] = -1;
				++t;
			}
 
			while (y - 1 >= 0 && arr[x][y - 1] != -1) {
				System.out.print(arr[x][--y]+" ");
				arr[x][y] = -1;
				++t;
			}
		}
		
	}
	
}
