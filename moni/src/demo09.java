import java.util.Scanner;


public class demo09 {

	public static void main(String[] args) {
		/*
		 * ��������
		����С��ÿ�춼Ҫ�����������е���Ҫһ����÷��׮��
		����С��������÷��׮���г� n �� m �У��������еľ���Ϊ 1���������еľ���ҲΪ 1��
		����С��վ�ڵ� 1 �е� 1 ���ϣ���Ҫ�ߵ��� n �е� m ���ϡ�С���Ѿ�����һ��ʱ�䣬�����ڿ���һ���ƶ������� d �ľ��루ֱ�߾��룩��
		����С����֪�����ڲ�����÷��׮������£��Լ�����Ҫ���ٲ������ƶ���Ŀ�ꡣ
			�����ʽ
			��������ĵ�һ�а����������� n, m���ֱ��ʾ÷��׮��������������
			�����ڶ��а���һ��ʵ�� d��������һλС��������ʾС��һ�������ƶ��ľ��롣
			�����ʽ
			�������һ����������ʾС�����ٶ��ٲ����Ե���Ŀ�ꡣ
			��������
			3 4
			1.5
			�������
			3
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		double d;
		n = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextDouble();
		
		int s = (int)(d/Math.sqrt(2));
		
		int min = Math.min(n, m);
		
		int a = (min-1)/s;
		
		int num = 0;
		for (int i = ((a*s)+1); i < n; i+=(int)d) {
			num++;
		}
		 
		for (int i = ((a*s)+1); i < m; i+=(int)d) {
			num++;
		}
		
		System.out.println(num+a);
	}
}