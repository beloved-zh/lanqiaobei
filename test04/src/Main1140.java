
public class Main1140 {

	public static void main(String[] args) {
		
		int n = 95859;
		String s2 = "";
		while (true) {
			s2 = "";
			n++;
			String s1 = n+"";
			for (int i = s1.length()-1; i >= 0; i--) {
				s2 += s1.charAt(i);
			}
			if (s1.equals(s2)) {
				break;
			}
		}
		
		System.out.println(s2);
	}
	
}
