import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main02 {
//	����: https://pan.baidu.com/s/1AFvzPyrcRHhHyA0IP3cmxg ��ȡ��: uhdd ����������ݺ�򿪰ٶ������ֻ�App������������Ŷ
	
	public static void main(String[] args) {
		test02();
		
	}
	
	/**
	 * ����ȡ�������ؾ���ı�ȡ��������ǰ������������ȡ���Ѿ�ȡ����
	 * ����ת90�ȡ�һ��ʼλ�ھ������Ͻǣ��������¡�
	 * 
	 *	����
	 *	�����һ��������������200��������m,  n����ʾ������к��С�������m��ÿ��n����������ʾ�������
	 *	���
	 *	���ֻ��һ�У���mn������Ϊ����������ȡ���õ��Ľ������֮����һ���ո�ָ�����ĩ��Ҫ�ж���Ŀո�
	 *	��������
	 *	
	 *	3  3 
	 *	
	 *	1  2  3 
	 *	
	 *	4  5  6 
	 *	
	 *	7  8  9 
	 *	
	 *	�������
	 *	
	 *	1 4 7 8 9 6 3 2 5
	 *  0 0
	 *  1 0
	 *  2 0
	 *  2 1
	 *  2 2
	 *  1 2
	 *  0 2
	 *  0 1
	 *  1 1
	 */
	public static void test02(){
		
		Scanner sc = new Scanner(System.in);
		
		int m,n;
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] arr = new int[m][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int x = 0,y = 0,num = 0;
		while (num < m*n) {
			while (x < m && arr[x][y]!=-1) {
				System.out.println(arr[x][y]);
				arr[x][y] = -1;
				x++;
				num++;
			}
			System.out.println(arr[x][y]);
//			System.out.println(x+" "+y);
//			while (y < n && arr[x][y]!=-1) {
//			}
		}
		
	}
	
	/**
	 * ��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ������1-3����
	 * ���Ǳ���3�����Ƴ�Ȧ�ӣ������������������ԭ���ĵڼ���λ
	 * @param args
	 */
	public static void test01(){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		int num = 1;
		while (list.size() > 1) {
			for (int i = 0; i < list.size(); i++) {
				if (num==3) {
					list.remove(i);
					num = 0;
					i--;
				}
				num++;
			}
		}
		
		System.out.println(list);
	}
}
