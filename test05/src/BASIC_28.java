import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * HuffumanÊ÷
 */
public class BASIC_28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		ArrayList<Integer> listS = new ArrayList<Integer>();
		
		while (list.size() != 1) {
			int s = 0;
			int index = min(list);
			s += list.get(index);
			list.remove(index);
			index = min(list);
			s += list.get(index);
			list.remove(index);
			list.add(s);
			listS.add(s);
		}
		
		int sum = 0;
		for (Integer i : listS) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static int min(ArrayList<Integer> list) {
		int min = list.get(0);
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
				index = i;
			}
		}
		return index;
	}
	
	
}
