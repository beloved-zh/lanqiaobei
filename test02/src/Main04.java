import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class Main04 {

	/**
	 * 
		��������
		������������n����С����ȫƽ������
		������һ�����ܱ�ʾ��ĳ����Ȼ����ƽ������ʽ����������Ϊ��ȫƽ����
		����Tips��ע�����ݷ�Χ
		�����ʽ
		����һ������n
		�����ʽ
		���������n����С����ȫƽ����
		��������
		71711
		�������
		71824
		���ݹ�ģ��Լ��
		����n��32λ�з�������

	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		BigInteger n = new BigInteger(s);
		
		n = getSqrt(n);
		
		n = n.add(new BigInteger("1"));
		
		n = n.multiply(n);
		
		System.out.println(n);
		
		
	}
	
	public static BigInteger getSqrt(BigInteger num) {
        String s = num.toString();
        int mlen = s.length();    //���������ĳ���
        int len;    //������ĳ���
        BigInteger beSqrtNum = new BigInteger(s);//��������
        BigInteger sqrtOfNum;    //�洢���������
        BigInteger sqrtOfNumMul;    //��������ƽ��
        String sString;//�洢sArrayת������ַ���
        if (mlen % 2 == 0) len = mlen / 2;
        else len = mlen / 2 + 1;
        char[] sArray = new char[len];
        Arrays.fill(sArray, '0');//��������ʼ��Ϊ0
        for (int pos = 0; pos < len; pos++) {
            //����߿�ʼ�������飬
            //ÿһλ��ת��Ϊ������ƽ����պò����ڱ��������ĳ̶�
            for (char ch = '1'; ch <= '9'; ch++) {
                sArray[pos] = ch;
                sString = String.valueOf(sArray);
                sqrtOfNum = new BigInteger(sString);
                sqrtOfNumMul = sqrtOfNum.multiply(sqrtOfNum);
                if (sqrtOfNumMul.compareTo(beSqrtNum) == 1) {
                    sArray[pos] -= 1;
                    break;
                }
            }
        }
        return new BigInteger(String.valueOf(sArray));
    }
}
