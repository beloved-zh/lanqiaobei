import java.util.Scanner;


public class Test10 {

	/**
	 * 
		��������
		
		����n�������ҳ���n���������ֵ����Сֵ���͡�
		�����ʽ
		
		��һ��Ϊ����n����ʾ���ĸ�����
		
		�ڶ�����n������Ϊ������n������ÿ�����ľ���ֵ��С��10000��
		�����ʽ
		������У�ÿ��һ����������һ�б�ʾ��Щ���е����ֵ���ڶ��б�ʾ��Щ���е���Сֵ�������б�ʾ��Щ���ĺ͡�
		��������
		5
		1 3 -2 4 5
		�������
		5
		-2
		11
		���ݹ�ģ��Լ��
		1 <= n <= 10000��

	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = 0;
		int max = 0;
		int sum = 0;
		
		for (int i : arr) {
			sum += i;
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}
