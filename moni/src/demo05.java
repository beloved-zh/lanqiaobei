import java.util.Scanner;


public class demo05 {
	public static void main(String[] args) {
		
		/*
		 * ��������
			���������� a[1], a[2], ..., a[n] �У���� a[i] < a[i+1] < a[i+2] < ... < a[j]����� a[i] �� a[j] Ϊһ�ε������У�����Ϊ j-i+1��
			��������һ�����У�������������ĵ��������ж೤��
			�����ʽ
			��������ĵ�һ�а���һ������ n��
			�����ڶ��а��� n ������ a[1], a[2], ..., a[n]�����ڵ��������ÿո�ָ�����ʾ���������С�
			�����ʽ
			�������һ�а���һ����������ʾ�𰸡�
			��������
			7
			5 2 4 1 3 7 2
			�������
			3
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int m = f1(i,arr);
			if (m > max) {
				max = m;
			}
		}
		System.out.println(max);
	}

	public static int f1(int i,int[] arr){
		int n = 1;
		for (int j = i; j < arr.length-1; j++) {
			if (arr[j] < arr[j+1]) {
				n++;
			}else {
				break;
			}
		}
		
		return n;
	}
}