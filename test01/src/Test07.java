
public class Test07 {

	/**
	 * 
		��������
		����153��һ���ǳ��������������������ÿλ���ֵ������ͣ���153=1*1*1+5*5*5+3*3*3���������������������������λʮ��������
		�����ʽ
		��������С�����˳�����������������λʮ��������ÿ����ռһ�С�

	 */
	public static void main(String[] args) {
		
		for (int i = 100; i < 1000; i++) {
			int n = i;
			int sum = 0;
			while (n > 0) {
				int m = n % 10;
				n /= 10;
				sum += (int)Math.pow(m, 3);
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
		
	}
}
