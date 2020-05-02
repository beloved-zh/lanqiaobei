import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class Main04 {

	/**
	 * 
		问题描述
		　　输出大等于n的最小的完全平方数。
		　　若一个数能表示成某个自然数的平方的形式，则称这个数为完全平方数
		　　Tips：注意数据范围
		输入格式
		　　一个整数n
		输出格式
		　　大等于n的最小的完全平方数
		样例输入
		71711
		样例输出
		71824
		数据规模和约定
		　　n是32位有符号整数

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
        int mlen = s.length();    //被开方数的长度
        int len;    //开方后的长度
        BigInteger beSqrtNum = new BigInteger(s);//被开方数
        BigInteger sqrtOfNum;    //存储开方后的数
        BigInteger sqrtOfNumMul;    //开方数的平方
        String sString;//存储sArray转化后的字符串
        if (mlen % 2 == 0) len = mlen / 2;
        else len = mlen / 2 + 1;
        char[] sArray = new char[len];
        Arrays.fill(sArray, '0');//开方数初始化为0
        for (int pos = 0; pos < len; pos++) {
            //从最高开始遍历数组，
            //每一位都转化为开方数平方后刚好不大于被开方数的程度
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
