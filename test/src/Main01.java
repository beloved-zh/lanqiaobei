import java.util.Arrays;
import java.util.Scanner;


public class Main01 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		demo17();
		
	}
	
	/**
	 * ������18����Ŀ������ƹ����ӽ��б������������ˡ�
	 * �׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ����
	 * �����������������Ա����������������a˵������x�ȣ�
	 * c˵������x,z�ȣ��������ҳ��������ֵ�������
	 */
	public static void demo18(){
		
	}
	
	/**
	 * ������17����Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ�
	 * ��������һ�룬����񫣬�ֶ����һ���ڶ��������ֽ�ʣ�µ���
	 * �ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�
	 * һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ�
	 * ���һ�칲ժ�˶��١�
	 */
	public static void demo17(){
		int num = 1;
		for (int i = 0; i < 9; i++) {
			num += (num+1)*2;
		}
		System.out.println(num);
	}
	
	
	/**
	 * ������16����Ŀ�����9*9�ھ�
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
	 * ������15����Ŀ��������������x,y,z��
	 * �������������С���������
	 */
	public static void demo15(){
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//�����������������
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	/**
	 * ������13����Ŀ��һ��������������100����һ����ȫƽ������
	 * �ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
	 */
	public static void demo13() {
		for (int i = 1; i < 10000; i++) {
			if ((Math.sqrt(i+100)%1==0)&&(Math.sqrt(i+168)%1==0)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * ������12����Ŀ����ҵ���ŵĽ������������ɡ�
	 * ����(I)���ڻ����10��Ԫʱ���������10%��
	 * �������10��Ԫ������20��Ԫʱ������10��Ԫ
	 * �Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ���
	 * ��7.5%��20��40��֮��ʱ������20��Ԫ��
	 * ���֣������5%��40��60��֮��ʱ����40��
	 * Ԫ�Ĳ��֣������3%��60��100��֮��ʱ����
	 * ��60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ��
	 * ����100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������
	 * ��Ӧ���Ž���������
	 */
	public static void demo12() {
		double i = 15;//��λ��Ԫ
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
	 * ������11����Ŀ����1��2��3��4�ĸ����֣�
	 * ����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
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
	 * ������10����Ŀ��һ���100�׸߶��������£�
	 * ÿ����غ�����ԭ�߶ȵ�һ�룻�����£�
	 * �����ڵ�10�����ʱ�������������ף�
	 * ��10�η�����ߣ�
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
	 * ������1����Ŀ���ŵ����⣺��һ�����ӣ�
	 * �ӳ������3������ÿ���¶���һ�����ӣ�
	 * С���ӳ����������º�ÿ��������һ�����ӣ�
	 * �������Ӷ���������ÿ���µ���������Ϊ���٣�
	 * ����һ���Ʋ�������������
	 * �·�	1	2	3	4	5	6	7
	 * ����	1	1	2	3	5	8	13
	 * �ӵ������¿�ʼ��ÿ������ǰ�����µ�֮��
	 */
	public static void demo01(){
		
		int y1 = 1;
		int y2 = 1;
		int y3;
		//1 - 12 ��
		for (int i = 1; i <= 12; i++) {
			if (i == 1 || i == 2) {
				System.out.println("��"+i+"������1������");
			} else {
				y3 = y1 + y2;
				y1 = y2;
				y2 = y3;
				System.out.println("��"+i+"������"+y3+"������");
			}
		}
		
	}
	
	
	/**
	 * ������2����Ŀ���ж�101-200֮���ж��ٸ�������
	 * �������������������������ж������ķ�����
	 * ��һ�����ֱ�ȥ��2��sqrt(�����)������ܱ�������
	 * ���������������������֮��������
	 */
	public static void demo02(){
		int sum = 0;
		for (int i = 101; i <= 200; i++) {
			int n = 0;//ê��
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {//�����������n++ ����n!=0 ��֮ n=0
					n++;
					break;
				}
			}
			if (n == 0) {
				System.out.println(i);
				sum++;
			}
		}
		System.out.println("�����ܸ�����"+sum);
	}

	/**
	 * ������3����Ŀ����ӡ�����е�"ˮ�ɻ���"��
	 * ��ν"ˮ�ɻ���"��ָһ����λ�������λ��
	 * �������͵��ڸ����������磺153��һ��
	 * "ˮ�ɻ���"����Ϊ153=1�����η���5����
	 * �η���3�����η���
	 * 
	 * �������������λ��3�η�֮����������Ƚ�
	 * 
	 * ���ص�һ�������ĵڶ����������ݵ�ֵ
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
	 * ������4����Ŀ����һ���������ֽ���������
	 * ���磺����90,��ӡ��90=2*3*3*5��
	 * �����������n���зֽ���������
	 * Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�
	 * (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
	 * (2)���n<>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,
	 * 	     ��Ϊ�µ���������n,�ظ�ִ�е�һ����
	 * (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
	 */
	public static void demo04(){
		
		int n = 16;
		//��С������2
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
	 * ������5����Ŀ�����������������Ƕ������ɴ��⣺
	 * ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��
	 * 60-89��֮�����B��ʾ��60�����µ���C��ʾ��
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
	 * ������6����Ŀ����������������m��n���������Լ������С��������
	 * ��ѭ���У�ֻҪ����������0���ýϴ������Խ�С��������С��һ��
	 * ����Ϊ��һ��ѭ���Ĵ�����ȡ�õ�������Ϊ��һ��ѭ���Ľ�С������
	 * ���ѭ��ֱ����С������ֵΪ0�����ؽϴ������������Ϊ���Լ����
	 * ��С������Ϊ����֮���������Լ����
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
		System.out.println("���Լ����"+max);
		System.out.println("��С��������"+min);
	}

	/**
	 * ������7����Ŀ������һ���ַ���
	 * �ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո�
	 * ���ֺ������ַ��ĸ���
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
		System.out.println("Ӣ����ĸ����:"+num1);
		System.out.println("�ո����:"+num2);
		System.out.println("���ָ���:"+num3);
		System.out.println("�����ַ�����:"+num4);
	}

	/**
	 * ������8����Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ��
	 * ����a��һ�����֡�����2+22+222+2222+22222
	 * (��ʱ����5�������)������������м��̿���
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
	 * ������9����Ŀ��һ�������ǡ�õ�����������֮�ͣ�
	 * ������ͳ�Ϊ"����"������6=1��2��3.
	 * ����ҳ�1000���ڵ�����������
	 * 
	 * �ҳ�ÿһ����������
	 * ������ָ����a��������b(b��0) ����������������û�����������Ǿ�˵b��a��������
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
