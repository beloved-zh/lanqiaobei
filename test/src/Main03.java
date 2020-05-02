import java.util.Scanner;


public class Main03 {

	public static void main(String[] args) {
		demo01();
	}
	
	static Scanner sc = new Scanner(System.in);
	
	
	/**
	 * 4. ��ĸͼ��
			��������
				������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�
				ABCDEFG
				BABCDEF
				CBABCDE
				DCBABCD
				EDCBABC
				����һ�� 5 �� 7 �е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ�� n �� m�е�ͼ�Ρ�
			�����ʽ
				����һ�У������������� n �� m���ֱ��ʾ��Ҫ�����ͼ�ε�������������
			�����ʽ
				��� n �У�ÿ�� m���ַ���Ϊ���ͼ�Ρ�
			��������
				5 7
			�������
				ABCDEFG
				BABCDEF
				CBABCDE
				DCBABCD
				EDCBABC
			���ݹ�ģ��Լ��
			1 <= n, m <= 26
	 */
	public static void demo04(){
		int m,n;
		n = sc.nextInt();
		m = sc.nextInt();
		//A 65
		for (int i = 0; i < n; i++) {
			int num = 0;
			for (int j = 65+i; j >= 65 && num < m; j--) {
				System.out.print((char)j);
				num++;
			}
			for (int j = 66; j < 65+m && num < m; j++) {
				System.out.print((char)j);
				num++;
			}
			System.out.println();
		}
	}
	
	/**
	 * 3. 01 �ִ�
			��������
				���ڳ���Ϊ 5 λ��һ�� 01 ����ÿһλ�������� 0 �� 1��һ���� 32 �ֿ��ܡ� ���ǵ�ǰ��
			���ǣ�
			    00000
			    00001
			    00010
			    00011
			    00100
				�밴��С�����˳������� 32 �� 01 ����
			�����ʽ
				������û�����롣
			�����ʽ
				��� 32 �У�����С�����˳��ÿ��һ������Ϊ 5 �� 01 ����
			�������
			    00000	0
			    00001	1
			    00010	2
			    00011	3
	 */
	public static void demo03(){
		
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++) {
				for (int c = 0; c < 2; c++) {
					for (int d = 0; d < 2; d++) {
						for (int e = 0; e < 2; e++) {
							System.out.println(a+""+b+""+c+""+d+""+e);
						}
					}
				}
			}
		}
		
	}
	
	public static void demo03_02(){
		for (int i = 0; i < 32; i++) {
			String s = Integer.toBinaryString(i);
			if (s.length() != 5) {
				for (int j = 0; j < 5-s.length(); j++) {
					System.out.print("0");
				}
			}
			System.out.println(s);
			
		}
	}
	
	
	
	/**
	 * 
		2. ʵ�����
			��������
			����Բ�İ뾶 r ����Բ�������
			�����ʽ
			  �������һ������ r ����ʾԲ�İ뾶��
			�����ʽ
			  ���һ�У�����һ��ʵ�����������뱣��С����� 7 λ����ʾԲ�������
			˵�����ڱ����У�������һ�����������������һ��ʵ����
			     ����ʵ����������⣬ ��һ�������ʵ�������Ҫ�� ���籾����Ҫ����С����� 7
			     λ������ĳ������ �ϸ�� ��� 7 λС���� ���������߹��ٵ�С��λ�����ǲ��еģ� ����
		             ����Ϊ����
		             ʵ��������������û���ر�˵�������붼�ǰ�����������С�
			��������
			  4	
			�������
			  50.2654825
			���ݹ�ģ��Լ��
			1 <= r <= 10000 ��
			��ʾ
			    ����Ծ���Ҫ��ϸߣ���ע�� �е�ֵӦ��ȡ�Ͼ�ȷ��ֵ�������ʹ�ó�������ʾ �У�
			    ���� PI=3.14159265358979323 ��Ҳ����ʹ����ѧ��ʽ���� �У����� PI=atan(1.0)*4
			    
	 */
	public static void demo02(){
		int r = sc.nextInt();
		
		//�ַ�����ʽ�����				  7����С�����7λ	f��ʾ�Ǹ�������
		String area = String.format("%.7f", (Math.PI * r * r));
		
		System.out.println(area);
		
	}
	
	public static void demo02_02(){
		int r = sc.nextInt();
		
		double d = (Math.PI * r * r);
		//�ȳ�10000000 ���� ����������ڳ�10000000.0
		d = Math.round(d * 10000000) / 10000000.0;
		
		System.out.println(d);
	}
	
	
	/**
	 * 1. Fibonacci ����
			��������
			Fibonacci ���еĵ��ƹ�ʽΪ�� Fn=Fn-1+Fn-2������ F1=F2=1��
			�� n �Ƚϴ�ʱ�� FnҲ�ǳ�������������֪���� Fn ���� 10007 �������Ƕ��١�
			�����ʽ
			  �������һ������ n��
			�����ʽ
			  ���һ�У�����һ����������ʾ Fn���� 10007 ��������
			˵�����ڱ����У�����Ҫ�� Fn ���� 10007 ���������������ֻҪ��������������
			     �ɣ�������Ҫ�ȼ���� Fn��׼ȷֵ���ٽ�����Ľ������ 10007 ȡ������ֱ�Ӽ���������
			     ���������ԭ����ȡ��򵥡�
			��������
			  10
			�������
			  55
			��������
			  22
			�������
			  7704
			���ݹ�ģ��Լ��
			  1 <= n <= 1,000,000 
	 */
	public static void demo01(){
		int n = sc.nextInt();
		int f1 = 1;
		int f2 = 1;
		int fn = 0;
		if (n == 1 || n== 2) {
			System.out.println(1%10007);
		} else {
			for (int i = 3; i <= n; i++) {
				if (f1 > 10007) {
					f1 %=  10007;
				}
				if (f2 > 10007) {
					f2 %=  10007;
				}
				fn = f1 + f2;
				f1 = f2;
				f2 = fn;
			}
			System.out.println(fn%10007);
		}
	}
}
