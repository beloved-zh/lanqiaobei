import java.util.Scanner;


public class Test13 {

	/**
	 * 
		��������
		
		����һ����ݣ��ж���һ���ǲ������ꡣ
		
		���������֮һ����ʱ����һ�������꣺
		
		1. �����4�ı���������100�ı�����
		
		2. �����400�ı�����
		
		��������ݶ��������ꡣ
		�����ʽ
		�������һ������y����ʾ��ǰ����ݡ�
		�����ʽ
		���һ�У������������������꣬�����yes���������no��
		
		˵����������ָ�������һ���ַ�����Ϊ��������籾���yes����no������Ҫ�ϸ��������и����Ĵ�Сд��д���Сд�����÷֡�
		��������
		2013
		�������
		no
		��������
		2016
		�������
		yes
		���ݹ�ģ��Լ��
		1990 <= y <= 2050��

	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		if (y < 1990 || y > 2050) {
			System.out.println("no");
			return;
		}
		
		if(y%4==0&&y%100!=0||y%400==0){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}
	
}
