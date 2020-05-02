import java.util.Arrays;
import java.util.Scanner;


public class Main01 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		demo17();
		
	}
	
	/**
	 * 【程序18】题目：两个乒乓球队进行比赛，各出三人。
	 * 甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定
	 * 比赛名单。有人向队员打听比赛的名单。a说他不和x比，
	 * c说他不和x,z比，请编程序找出三队赛手的名单。
	 */
	public static void demo18(){
		
	}
	
	/**
	 * 【程序17】题目：猴子吃桃问题：猴子第一天摘下若干个桃子，
	 * 当即吃了一半，还不瘾，又多吃了一个第二天早上又将剩下的桃
	 * 子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的
	 * 一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。
	 * 求第一天共摘了多少。
	 */
	public static void demo17(){
		int num = 1;
		for (int i = 0; i < 9; i++) {
			num += (num+1)*2;
		}
		System.out.println(num);
	}
	
	
	/**
	 * 【程序16】题目：输出9*9口诀
	 */
	public static void demo16(){
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * 【程序15】题目：输入三个整数x,y,z，
	 * 请把这三个数由小到大输出。
	 */
	public static void demo15(){
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//将数组进行升序排序
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	/**
	 * 【程序13】题目：一个整数，它加上100后是一个完全平方数，
	 * 再加上168又是一个完全平方数，请问该数是多少？
	 */
	public static void demo13() {
		for (int i = 1; i < 10000; i++) {
			if ((Math.sqrt(i+100)%1==0)&&(Math.sqrt(i+168)%1==0)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * 【程序12】题目：企业发放的奖金根据利润提成。
	 * 利润(I)低于或等于10万元时，奖金可提10%；
	 * 利润高于10万元，低于20万元时，低于10万元
	 * 的部分按10%提成，高于10万元的部分，可可提
	 * 成7.5%；20万到40万之间时，高于20万元的
	 * 部分，可提成5%；40万到60万之间时高于40万
	 * 元的部分，可提成3%；60万到100万之间时，高
	 * 于60万元的部分，可提成1.5%，高于100万元时，
	 * 超过100万元的部分按1%提成，从键盘输入当月利润，
	 * 求应发放奖金总数？
	 */
	public static void demo12() {
		double i = 15;//单位万元
		double j = 0;
		if (i >0 && i <= 10) {
			j = i * 0.1;
		} else if(i > 10 && i <= 20){
			j = (10 * 0.1) + (j-10)* 0.075;
		} else if(i > 20 && i <= 40){
			j = 10*0.1+10*0.075+(i-20)*0.05;
		} else if(i>40&&i<=60){
			j=10*0.1+10*0.075+20*0.05+(i-40)*0.03;
		} else if(i>60&&i<=100){
			j=20*0.175+20*0.05+20*0.03+(i-60)*0.015;
		} else if(i>100){
			j=20*0.175+40*0.08+40*0.015+(i-100)*0.01;
		}
		System.out.println(j);
	}


	/**
	 * 【程序11】题目：有1、2、3、4四个数字，
	 * 能组成多少个互不相同且无重复数字的三位数？都是多少？
	 */
	public static void demo11() {
		int num = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int k = 1; k < 5; k++) {
					if (i!=j&&j!=k&&k!=i) {
						System.out.println(i+""+j+""+k);
						num++;
					}
				}
			}
		}
		System.out.println(num);
	}



	/**
	 * 【程序10】题目：一球从100米高度自由落下，
	 * 每次落地后反跳回原高度的一半；再落下，
	 * 求它在第10次落地时，共经过多少米？
	 * 第10次反弹多高？
	 */
	public static void demo10() {
		double h = 100;
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += h;
			h /= 2;
			sum += h;
		}
		System.out.println(sum);
		System.out.println(h);
	}

	/**
	 * 【程序1】题目：古典问题：有一对兔子，
	 * 从出生后第3个月起每个月都生一对兔子，
	 * 小兔子长到第三个月后每个月又生一对兔子，
	 * 假如兔子都不死，问每个月的兔子总数为多少？
	 * 这是一个菲波拉契数列问题
	 * 月份	1	2	3	4	5	6	7
	 * 对数	1	1	2	3	5	8	13
	 * 从第三个月开始，每个月是前两个月的之和
	 */
	public static void demo01(){
		
		int y1 = 1;
		int y2 = 1;
		int y3;
		//1 - 12 月
		for (int i = 1; i <= 12; i++) {
			if (i == 1 || i == 2) {
				System.out.println("第"+i+"个月有1对兔子");
			} else {
				y3 = y1 + y2;
				y1 = y2;
				y2 = y3;
				System.out.println("第"+i+"个月有"+y3+"对兔子");
			}
		}
		
	}
	
	
	/**
	 * 【程序2】题目：判断101-200之间有多少个素数，
	 * 并输出所有素数。程序分析：判断素数的方法：
	 * 用一个数分别去除2到sqrt(这个数)，如果能被整除，
	 * 则表明此数不是素数，反之是素数。
	 */
	public static void demo02(){
		int sum = 0;
		for (int i = 101; i <= 200; i++) {
			int n = 0;//锚点
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {//如果不是素数n++ 最终n!=0 反之 n=0
					n++;
					break;
				}
			}
			if (n == 0) {
				System.out.println(i);
				sum++;
			}
		}
		System.out.println("素数总个数："+sum);
	}

	/**
	 * 【程序3】题目：打印出所有的"水仙花数"，
	 * 所谓"水仙花数"是指一个三位数，其各位数
	 * 字立方和等于该数本身。例如：153是一个
	 * "水仙花数"，因为153=1的三次方＋5的三
	 * 次方＋3的三次方。
	 * 
	 * 分析：计算各个位数3次方之和与这个作比较
	 * 
	 * 返回第一个参数的第二个参数次幂的值
	 * public static double pow(double a,double b);
	 */
	public static void demo03(){
		
		for (int i = 100; i < 1000; i++) {
			int sum = 0;
			int m = i;
			while (m>0) {
				int n = m%10;
				sum += (int)Math.pow(n, 3);
				m /= 10;
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
		
	}
	
	/**
	 * 【程序4】题目：将一个正整数分解质因数。
	 * 例如：输入90,打印出90=2*3*3*5。
	 * 程序分析：对n进行分解质因数，
	 * 应先找到一个最小的质数k，然后按下述步骤完成：
	 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
	 * (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,
	 * 	     作为新的正整数你n,重复执行第一步。
	 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
	 */
	public static void demo04(){
		
		int n = 16;
		//最小的质数2
		int k = 2;
		System.out.print(n+"=");
		while (k <= n) {
			if(n == k){
				System.out.println(n);
				break;
			}else{
				if(n%k==0){
					System.out.print(k+"*");
					n = n/k;
				}else {
					k++;
				}
			}
		}
	}

	/**
	 * 【程序5】题目：利用条件运算符的嵌套来完成此题：
	 * 学习成绩>=90分的同学用A表示，
	 * 60-89分之间的用B表示，60分以下的用C表示。
	 */
	public static void demo05(){
		int score = 90;
		if (score >= 90) {
			System.out.println("A");
		} else if(score >= 60 && score < 90){
			System.out.println("B");
		}else {
			System.out.println("C");
		}
	}

	/**
	 * 【程序6】题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
	 * 在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个
	 * 数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，
	 * 如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，
	 * 最小公倍数为两数之积除以最大公约数。
	 * 
	 */
	public static void demo06(){
		int a = 12;
		int b = 18;
		int max;
		int min;
		int tmp;
		if (a > b) {
			max = a;
			min = b;
		}else{
			max = b;
			min = a;
		}
		
		while (min != 0) {
			tmp = max%min;
			max = min;
			min = tmp;
		}
		
		
		min = (a*b)/max;
		System.out.println("最大公约数："+max);
		System.out.println("最小倍数数："+min);
	}

	/**
	 * 【程序7】题目：输入一行字符，
	 * 分别统计出其中英文字母、空格、
	 * 数字和其它字符的个数
	 */
	public static void demo07(){
		String str = "dasd SAF123^^";
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')) {
				num1++;
			}else if(c == ' '){
				num2++;
			}else if (c >= '0' && c <= '9') {
				num3++;
			} else {
				num4++;
			}
		}
		System.out.println("英文字母个数:"+num1);
		System.out.println("空格个数:"+num2);
		System.out.println("数字个数:"+num3);
		System.out.println("其他字符个数:"+num4);
	}

	/**
	 * 【程序8】题目：求s=a+aa+aaa+aaaa+aa...a的值，
	 * 其中a是一个数字。例如2+22+222+2222+22222
	 * (此时共有5个数相加)，几个数相加有键盘控制
	 */
	public static void demo08(){
		int s = 0;
		int a = 5;
		int n = 3;
		int num = 0;
		for (int i = 0; i < n; i++) {
			num += a;
			s += num;
			a *= 10;
		}
		System.out.println(s);
	}
	
	/**
	 * 【程序9】题目：一个数如果恰好等于它的因子之和，
	 * 这个数就称为"完数"。例如6=1＋2＋3.
	 * 编程找出1000以内的所有完数。
	 * 
	 * 找出每一个数的因数
	 * 因数是指整数a除以整数b(b≠0) 的商正好是整数而没有余数，我们就说b是a的因数。
	 */
	public static void demo09(){
		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i%j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}
}
