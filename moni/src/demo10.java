import java.util.Scanner;


public class demo10 {

	public static void main(String[] args) {
		/*
		 * 问题描述
		　　小明用积木搭了一个城堡。
		　　为了方便，小明在搭的时候用的是一样大小的正方体积本，搭在了一个 n 行 m 列的方格图上，每个积木正好占据方格图的一个小方格。
		　　当然，小明的城堡并不是平面的，而是立体的。小明可以将积木垒在别的积木上面。当一个方格上的积木垒得比较高时，就是一个高塔，当一个方格上没有积木时，就是一块平地。
		　　小明的城堡可以用每个方格上垒的积木层数来表示。例如，下面就表示一个城堡。
		　　9 3 3 1
		　　3 3 3 0
		　　0 0 0 0
		　　这个城堡南面和东面都有空地，西北面有一个大房子，在西北角还有一个高塔，东北角有一个车库。
		　　现在，格格巫要来破坏小明的城堡，他施了魔法水淹小明的城堡。
		　　如果水的高度为1，则紧贴地面的那些积木要被水淹，在上面的例子中，有7块积木要被水淹。
		　　如果水的高度为2，则更多积木要被水淹，在上面的例子中，有13块积木要被水淹。
		　　给定小明的城堡图，请问，水的高度依次为1, 2, 3, ...., H 时，有多少块积木要被水淹。
		输入格式
		　　输入的第一行包含两个整数 n, m。
		　　接下来 n 行，每行 m 个整数，表示小明的城堡中每个位置积木的层数。
		　　接下来包含一个整数 H，表示水高度的上限。
		输出格式
		　　输出 H 行，每行一个整数。第 i 的整数表示水的高度为 i 时被水淹的积木数量。
		样例输入
		3 4
		9 3 3 1
		3 3 3 0
		0 0 0 0
		10
		样例输出
		7
		13
		19
		20
		21
		22
		23
		24
		25
		25
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int h = sc.nextInt();
		int sum = 0;
		for (int k = 1; k <= h; k++) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					int s = arr[i][j];
					if (s >= k) {
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}
}
