import java.util.Scanner;


public class Main08 {

	/**
	 * 
		��Ŀ����
		
		Ҫ��"China"������룬��������ǣ���ԭ����ĸ����ĵ�4����ĸ����ԭ������ĸ��
		
		���磬��ĸ"A"�����4����ĸ��"E"��"E"����"A"����ˣ�"China"Ӧ��Ϊ"Glmre"��
		
		���һ�����ø���ֵ�ķ���ʹcl��c2��c3��c4��c5���������ֵ�ֱ�Ϊ����C������h������i������n������a�����������㣬ʹc1��c2��c3��c4��c5�ֱ��Ϊ��G������l������m������r������e�����������
		����
		
		China
		���
		
		���ܺ��China
		��������
		
		China
		
		�������
		
		Glmre


	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print((char)((str.charAt(i))+4));
		}
		
	}
	
}
