import java.util.Scanner;


public class Main09 {

	/**
	 * 
		��Ŀ����
		
		����һ�������¶ȣ�Ҫ����������¶ȡ���ʽΪ c=5(F-32)/9��ȡλ2С����
		����
		
		һ�������¶ȣ�������
		���
		
		�����¶ȣ�������λС��
		��������
		
		-40
		
		�������
		
		c=-40.00


	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double f = sc.nextDouble();
		
		double c = 5*(f-32)/9;
		
		System.out.println("c="+String.format("%.2f", c));
		
	}
	
}
