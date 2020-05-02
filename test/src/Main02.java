import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main02 {
//	链接: https://pan.baidu.com/s/1AFvzPyrcRHhHyA0IP3cmxg 提取码: uhdd 复制这段内容后打开百度网盘手机App，操作更方便哦
	
	public static void main(String[] args) {
		test02();
		
	}
	
	/**
	 * 回形取数就是沿矩阵的边取数，若当前方向上无数可取或已经取过，
	 * 则左转90度。一开始位于矩阵左上角，方向向下。
	 * 
	 *	输入
	 *	输入第一行是两个不超过200的正整数m,  n，表示矩阵的行和列。接下来m行每行n个整数，表示这个矩阵。
	 *	输出
	 *	输出只有一行，共mn个数，为输入矩阵回形取数得到的结果。数之间用一个空格分隔，行末不要有多余的空格。
	 *	样例输入
	 *	
	 *	3  3 
	 *	
	 *	1  2  3 
	 *	
	 *	4  5  6 
	 *	
	 *	7  8  9 
	 *	
	 *	样例输出
	 *	
	 *	1 4 7 8 9 6 3 2 5
	 *  0 0
	 *  1 0
	 *  2 0
	 *  2 1
	 *  2 2
	 *  1 2
	 *  0 2
	 *  0 1
	 *  1 1
	 */
	public static void test02(){
		
		Scanner sc = new Scanner(System.in);
		
		int m,n;
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] arr = new int[m][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int x = 0,y = 0,num = 0;
		while (num < m*n) {
			while (x < m && arr[x][y]!=-1) {
				System.out.println(arr[x][y]);
				arr[x][y] = -1;
				x++;
				num++;
			}
			System.out.println(arr[x][y]);
//			System.out.println(x+" "+y);
//			while (y < n && arr[x][y]!=-1) {
//			}
		}
		
	}
	
	/**
	 * 有n个人围成一圈，顺序排号。从第一个人开始报数（1-3），
	 * 凡是报到3的人推出圈子，问最后留下来的人是原来的第几号位
	 * @param args
	 */
	public static void test01(){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		int num = 1;
		while (list.size() > 1) {
			for (int i = 0; i < list.size(); i++) {
				if (num==3) {
					list.remove(i);
					num = 0;
					i--;
				}
				num++;
			}
		}
		
		System.out.println(list);
	}
}
