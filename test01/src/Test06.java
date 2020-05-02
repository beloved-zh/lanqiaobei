import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test06 {

	/**
	 * 
		问题描述
		　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
		输出格式
		　　按从小到大的顺序输出满足条件的四位十进制数。

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
