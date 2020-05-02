
public class demo04 {
public static void main(String[] args) {
	//70044与113148的最大公约数是多少？
	for (int i = 1; i < 70044; i++) {
		if (70044%i==0&&113148%i==0) {
			System.out.println(i);
		}
	}
}
}
