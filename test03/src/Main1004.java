import java.util.Scanner;


public class Main1004 {

	/**
	 * 
		��Ŀ����
		
		��һͷĸţ����ÿ�������һͷСĸţ��ÿͷСĸţ�ӵ��ĸ���ͷ��ʼ��ÿ�����Ҳ��һͷСĸţ������ʵ���ڵ�n���ʱ�򣬹��ж���ͷĸţ��
		����
		
		���������ɶ������ʵ����ɣ�ÿ������ʵ��ռһ�У�����һ������n(0<n<55)��n�ĺ�������Ŀ��������
		n=0��ʾ�������ݵĽ�������������
		���
		
		����ÿ������ʵ��������ڵ�n���ʱ��ĸţ��������
		ÿ�����ռһ�С�
		��������
		1	2	3	4	6	9
		2	
		4
		5
		0
		
		�������
		
		2
		4
		6


	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n == 0) {
			return;
		}
		
		System.out.println(f(n));
	}
	
	public static int f(int n){
		
		if (n == 1 || n == 2 || n == 3) {
			return n;
		} else {
			return f(n-1)+f(n-3);
		}
	}
}
