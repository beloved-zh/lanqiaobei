public class demo03 {

	////������19000���������У���19000���ʵ����ĸ����Ƕ��٣�
	public static void main(String[] args) {
		int count=0;
        for (int i=1;i<=19000;i++){
            if(i%2!=0&&i%5!=0&&i%19!=0){
                count++;
            }
        }
        System.out.println(count);
	}
}
