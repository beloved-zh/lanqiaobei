import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
		
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for (String str : arr) {
//			System.out.println(str.length());
			str = str.replaceAll("0", "0000");
			str = str.replaceAll("1", "0001");
			str = str.replaceAll("2", "0010");
			str = str.replaceAll("3", "0011");
			str = str.replaceAll("4", "0100");
			str = str.replaceAll("5", "0101");
			str = str.replaceAll("6", "0110");
			str = str.replaceAll("7", "0111");
			str = str.replaceAll("8", "1000");
			str = str.replaceAll("9", "1001");
			str = str.replaceAll("A", "1010");
			str = str.replaceAll("B", "1011");
			str = str.replaceAll("C", "1100");
			str = str.replaceAll("D", "1101");
			str = str.replaceAll("E", "1110");
			str = str.replaceAll("F", "1111");
//			System.out.println(str.length());
//			System.out.println(str);
			if (str.length()%3 != 0) {
				int m = 3-(str.length()%3);
				for (int i = 0; i < m; i++) {
					str = "0"+str;
				}
			}
			
			int begin = 0;
			int end = 3;
			StringBuffer s = new StringBuffer();
			StringBuffer str1 = new StringBuffer(str);
			while (end <= str1.length()) {
				String s1 = str1.substring(begin, end);
//				int k = Integer.parseInt(s1, 2);
//				String s2 = Integer.toOctalString(k);
//				s += s2;
				if ("000".equals(s1)) {
//					s += "0";
					s.append("0");
				}else if ("001".equals(s1)) {
//					s += "1";
					s.append("1");
				}else if ("010".equals(s1)) {
//					s += "2";
					s.append("2");
				}else if ("011".equals(s1)) {
//					s += "3";
					s.append("3");
				}else if ("100".equals(s1)) {
//					s += "4";
					s.append("4");
				}else if ("101".equals(s1)) {
//					s += "5";
					s.append("5");
				}else if ("110".equals(s1)) {
//					s += "6";
					s.append("6");
				}else if ("111".equals(s1)) {
//					s += "7";
					s.append("7");
				}
				
				begin += 3;
				end += 3;
			}
//			System.out.println(s.length());
			if (s.charAt(0) == '0') {
				s.deleteCharAt(0);
			}
			System.out.println(s);
		}
		
    }
}
