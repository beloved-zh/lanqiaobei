import java.util.Scanner;


public class Main1551 {

	/**
	 * 　A城市有一个巨大的圆形广场，为了绿化环境和净化空气，市政府决定沿圆形广场外圈种一圈树。园林部门  得到指令后，初步规划出n个种树的位置，顺时针编号1到n。并且每个位置都有一个美观度Ai，如果在这里种树就可以得到这Ai的美观度。但由于A城市土壤  肥力欠佳，两棵树决不能种在相邻的位置（i号位置和i+1号位置叫相邻位置。值得注意的是1号和n号也算相邻位置！）。
		
		最终市政府给园林部门提供了m棵树苗并要求全部种上，请你帮忙设计种树方案使得美观度总和最大。如果无法将m棵树苗全部种上，给出无解信息。
		
		数据规模和约定
		对于全部数据，满足1< =m< =n< =30；
		其中90%的数据满足m< =n< =20
		-1000< =Ai< =1000
		
		输入
		输入的第一行包含两个正整数n、m。 
		第二行n个整数Ai。 
		输出
		输出一个整数，表示最佳植树方案可以得到的美观度。如果无解输出“Error!”，不包含引号。 
		样例输入
		
		7  3 
		1  2  3  4  5  6  7 
		
		样例输出
		
		15
		
		n个位置最多种 n/2个树
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if ((n+1)/2 > m) {
			System.out.println("Error!");
			return;
		}
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
	}
	
	public static int f(int[] arr,int m){
		
		return 0;
	}
	
}
