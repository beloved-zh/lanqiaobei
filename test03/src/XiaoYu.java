
public class XiaoYu {

	public static void main(String[] args) {
		System.out.println("�ŵ��ұ�����");
		xiaoYu(3);
	}
	
	public static void xiaoYu(int n){
		System.out.print("����");
		if (n == 1) {
			System.out.print("�ҵ�С����");
		} else {
			xiaoYu(--n);
		}
		System.out.print("����");
	}
}
