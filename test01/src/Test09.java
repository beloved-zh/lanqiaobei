import java.util.List;
import java.util.Scanner;


public class Test09 {

	/**
	 * 
		��������
		
		����һ������n�����������У�������a�������еĵ�һ�γ����ǵڼ�����
		�����ʽ
		
		��һ�а���һ������n��
		
		�ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��
		
		����������һ������a��Ϊ�����ҵ�����
		�����ʽ
		���a�������г����ˣ��������һ�γ��ֵ�λ��(λ�ô�1��ʼ���)���������-1��
		��������
		6
		1 9 4 8 3 9
		9
		�������
		2
		���ݹ�ģ��Լ��
		1 <= n <= 1000��

	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int a = sc.nextInt();
		
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				m = i+1;
				break;
			}
		}
		if (m == 0) {
			System.out.println(-1);
		} else {
			System.out.println(m);
		}
	}
	
}
