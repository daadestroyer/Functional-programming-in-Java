import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
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
		List<Integer> oddList = aList.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println(oddList);

		System.out.println();

		// double all the values in the present collections
		List<Integer> aList2 = aList.stream().map(num -> num * 2).collect(Collectors.toList());
		System.out.println(aList2);

		System.out.println();

		ArrayList<String> aList3 = new ArrayList<String>();
		aList3.add("shubham");
		aList3.add("ansh");
		aList3.add("vatsal");
		aList3.add("raj");
		aList3.add("kavi");
		aList3.add("malaika");

		List<String> collectList = aList3.stream().filter(name -> name.length() > 3).collect(Collectors.toList());
		System.out.println(collectList);

		System.out.println();

		List<String> collectList2 = aList3.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(collectList2);
		
		System.out.println();
		
		long count = aList3.stream().filter(name->name.length()>5).count();
		System.out.println(count);
	}
}
