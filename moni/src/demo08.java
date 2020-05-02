import java.util.Scanner;


public class demo08 {

	public static void main(String[] args) {
		/*
		 * 问题描述
			　　给定一个单词，请计算这个单词中有多少个元音字母，多少个辅音字母。
			　　元音字母包括 a, e, i, o, u，共五个，其他均为辅音字母。
			输入格式
			　　输入一行，包含一个单词，单词中只包含小写英文字母。
			输出格式
			　　输出两行，第一行包含一个整数，表示元音字母的数量。
			　　第二行包含一个整数，表示辅音字母的数量。
			样例输入
			lanqiao
			样例输出
			4
			3
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] arr = {'a','e','i','o','u'};
		
		int num = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (arr[i] == str.charAt(j)) {
					num++;
				}
			}
		}
		
		System.out.println(num);
		System.out.println(str.length()-num);
	}
}


