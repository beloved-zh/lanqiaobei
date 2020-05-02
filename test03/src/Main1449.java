import java.util.Scanner;


public class Main1449 {

	/**
	 * �۲�������У�
		1  3  0  2  -1  1  -2  ...
		
		��������к�һ�����Ǳ�ǰһ������2���߼���3��
		
		�������������кܺ��棬����֪������Ϊ  n  ��Ϊ  s  ���Һ�һ�����Ǳ�ǰһ������a���߼���b���������п����ж������أ�
		
		����˵��
		���������зֱ���2  4  1  3��7  4  1  -2��
		���ݹ�ģ��Լ��
		����100%�����ݣ�1< =n< =1000��-1,000,000,000< =s< =1,000,000,000��1< =a,  b< =1,000,000��
		
		����
		����ĵ�һ�а����ĸ�����  n  s  a  b��������ǰ��˵���� 
		���
		���һ�У�����һ����������ʾ���������ķ�����������������ܴ����������������100000007�������� 
		��������
		
		4  10  2  3 
		
		�������
		
		2
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int s = sc.nextInt(); 
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		
		int num = 0;
		for (int i = 0; i < 10; i++) {
			int sum = f(--n, a, b, i,1);
			if (sum == s) {
				num++;
			}
		}
		System.out.println(num);
	}
	
	public static int f(int n,int a,int b,int i,int m){
		int sum = i;
		if (n==0) {
			return sum;
		}
		if (m % 2 == 0) {
			i -=  b;
		} else {
			i +=  a;
		}
		sum += i;
		return f(--n, a, b, i,++m);
	}
}
