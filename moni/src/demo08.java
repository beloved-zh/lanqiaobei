import java.util.Scanner;


public class demo08 {

	public static void main(String[] args) {
		/*
		 * ��������
			��������һ�����ʣ����������������ж��ٸ�Ԫ����ĸ�����ٸ�������ĸ��
			����Ԫ����ĸ���� a, e, i, o, u���������������Ϊ������ĸ��
			�����ʽ
			��������һ�У�����һ�����ʣ�������ֻ����СдӢ����ĸ��
			�����ʽ
			����������У���һ�а���һ����������ʾԪ����ĸ��������
			�����ڶ��а���һ����������ʾ������ĸ��������
			��������
			lanqiao
			�������
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

