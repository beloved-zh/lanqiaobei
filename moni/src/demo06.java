import java.util.Scanner;


public class demo06 {

	public static void main(String[] args) {
		/*
		 * ��������
			���������� a_1, a_2, ..., a_n�У���������Ԫ�� a_i �� a_j �ľ���Ϊ |i-j|+|a_i-a_j|����Ԫ���±�ľ������Ԫ��ֵ�Ĳ�ľ���ֵ������ |x| ��ʾ x �ľ���ֵ��
			��������һ�����У������ҳ�Ԫ��֮������Ԫ�ؾ��롣
			�����ʽ
			��������ĵ�һ�а���һ������ n��
			�����ڶ��а��� n ������ a_1, a_2, ..., a_n�����ڵ��������ÿո�ָ�����ʾ���������С�
			�����ʽ
			�������һ�а���һ����������ʾ�𰸡�
			��������
			5
			9 4 2 4 7
			�������
			9
			����˵��
			����a_1 �� a_3 �ľ���Ϊ |1-3|+|9-2|=9
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = 0;
		if (n % 2 == 0) {
			m = n/2;
		}else {
			m = (n/2) + 1;
		}
		int max = 0;
		for (int i = 0; i < m; i++) {
			int s = f1(i,arr);
			if (s > max) {
				max = s;
			}
		}
		System.out.println(max);
	}
	
	public static int f1(int i,int[] arr) {
		int max = 0;
		for (int j = i; j < arr.length; j++) {
			int s = Math.abs(i-j)+Math.abs((arr[i]- arr[j]));
			if (s > max) {
				max = s;
			}
		}
		return max;
	}
}
