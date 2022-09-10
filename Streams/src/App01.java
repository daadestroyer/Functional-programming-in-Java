import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App01 {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(0);
		aList.add(10);
		aList.add(20);
		aList.add(5);
		aList.add(15);
		aList.add(25);

		System.out.println(aList);

		System.out.println();
		
		// filter all even no from above collection into new list
		List<Integer> evenList = aList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		
		System.out.println();
		
		// filter all odd no from above collection into new list
		List<Integer> oddList = aList.stream().filter(num->num%2!=0).collect(Collectors.toList());
		System.out.println(oddList);
		
		System.out.println();
		
		// double all the values in the present collections
		List<Integer> aList2 = aList.stream().map(num->num*2).collect(Collectors.toList());
		System.out.println(aList2);
	}
}
