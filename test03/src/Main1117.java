import java.util.Scanner;


public class Main1117 {

	/**
	 * 
	 * ���ǰ���Nλ���ֵ�K-������. ����һ������Ч, �����K-���Ʊ�ʾ��������������0.
		
		���ǰ���Nλ���ֵ�K-������. ����һ������Ч, �����K-���Ʊ�ʾ��������������0.
		
		��:
		1010230 ����Ч��7λ��
		1000198 ��Ч
		0001235 ����7λ��, ����4λ��.
		
		����������N��K, Ҫ��������Nλ���ֵ���ЧK-������������.
		
		����2 <= K <= 10; 2 <= N; 4 <= N+K <= 18.
		����
		
		����ʮ��������N��K
		���

		ʮ���Ʊ�ʾ�Ľ��
		��������
		
		2
		10
		
		�������
		
		90
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(f(n,k));
	}
	
	public static int f(int n,int k){
		if (n == 1) {
			return k-1;
		} else if(n == 2){
			return (k-1)*k;
		} else {
			return (f(n-1,k)+f(n-2,k))*(k-1);
		}
	}
	
}
