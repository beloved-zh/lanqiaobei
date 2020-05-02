import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * ±® ±÷˙ ÷
 */
public class BASIC_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
	
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "fifteen");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "nineteen");
		map.put(20, "twenty");
		map.put(30, "thirty");
		map.put(40, "forty");
		map.put(50, "fifty");
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		String s = "";
		
		if (h <= 20) {
			s += map.get(h)+" ";
		}else {
			int h1 = (h / 10) * 10;
			s += map.get(h1)+" ";
			int h2 = h - h1;
			s += map.get(h2)+" ";
		}
		
		if (m == 0) {
			s += "o'clock";
		}else if (m <= 20) {
			s += map.get(m);
		}else {
			int m1 = (m / 10) * 10;
			s += map.get(m1)+" ";
			int m2 = m - m1;
			s += map.get(m2);
		}
		
		
		System.out.println(s);
	}
	
}
