import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test06 {

	/**
	 * 
		��������
		����1221��һ���ǳ����������������߶��ʹ��ұ߶���һ���ģ������������������λʮ��������
		�����ʽ
		��������С�����˳�����������������λʮ��������

	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1000; i < 10000; i++) {
			String s = i+"";
			String s1 = "";
			for (int j = s.length()-1; j >= 0; j--) {
				s1 += s.charAt(j);
			}
			if (s.equals(s1)) {
				list.add(i);
			}
		}
		
		Collections.sort(list);
		
		for (Integer i : list) {
			System.out.println(i);
		}
	}
	
	
}
