
public class XiaoYu {

	public static void main(String[] args) {
		System.out.println("吓得我抱起了");
		xiaoYu(3);
	}
	
	public static void xiaoYu(int n){
		System.out.print("抱着");
		if (n == 1) {
			System.out.print("我的小鲤鱼");
		} else {
			xiaoYu(--n);
		}
		System.out.print("的我");
	}
}
