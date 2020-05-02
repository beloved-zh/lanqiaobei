public class demo03 {

	////不超过19000的正整数中，与19000互质的数的个数是多少？
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
