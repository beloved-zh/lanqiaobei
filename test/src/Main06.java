import java.util.Arrays;
import java.util.Scanner;


public class Main06 {

	/**
	 * 
		��������
		��������һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200
		�����ʽ
		������һ��Ϊһ������n��
		�����ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
		�����ʽ
		�������һ�У�����С�����˳��������������С�
		��������
		5
		8 3 6 4 9
		�������
		3 4 6 8 9

	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
