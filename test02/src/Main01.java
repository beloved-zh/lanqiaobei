import java.util.Scanner;


public class Main01 {

	/**
	 * 
		问题描述
		　　一位著名的微处理器公司邀请您帮忙在他们的电脑芯片上安排一些组件，每个芯片被设计成拥有N × N个插槽的正方形。一个插槽可以存放一个组件，你要尽可能多地在芯片上安装组件。
		　　现代的处理器设计是相当复杂的。不幸地，你需要满足以下的限制。
		　　* 一些插槽是不可用的
		　　* 一些插槽已经被其他的组件所占据，无法用于固定额外的组件。
		　　* 芯片水平和垂直边界上连接着着一些内存总线,他们的带宽负载需要匹配。也就是说，第一行和第一列的组件数目必须一样多，第二行和第二列的组件数目必须一样多，依此类推。这里的组件数要包括之前已经存在于芯片之上和后来加上去的。
		　　* 类似地，每行每列都有能量供应系统。为了避免局部过热，对于给定的一组A，B，任何一行/一列的组件数都不能超过总组件数的A / B。
		　　你希望计算出最多可以在芯片上再安装多少个组件。
		输入格式
		　　输入数据第一行包括三个正整数N，A，B。
		　　接下来包含 N 行,每行包含 N 个字符，表示了描述芯片的矩阵。其中 '.' 表示可用插槽，'/' 表示不可用插槽，'C' 表示插槽已被一个部件占据。
		输出格式
		　　如果有解，输出一行包括一个正整数，表示最多能再安装多少个组件。
		　　否则，输出"impossible"（不包含引号）。
		样例输入
		5 3 10
		CC/..
		././/
		..C.C
		/.C..
		/./C/
		样例输出
		7
		样例说明
		数据规模和约定
		　　1 ≤ N ≤ 40，1 ≤ B ≤ 1000， 0 ≤ A ≤ B。
		
		//要求1.  A（行）/B（列）   组件需要小于等于A/B
		//要求2.  1行1列  2行2列 。。。。 组件数需要相同
		//符合输出最大数
		//不符合输出“impossioble”
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,a,b;
		
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		String[] arr = new String[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		char[][] arr1 = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr1[i][j] = arr[i].charAt(j);
			}
		}
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
