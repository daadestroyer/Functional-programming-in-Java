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

		long count = aList3.stream().filter(name -> name.length() > 5).count();
		System.out.println(count);

		System.out.println();

		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(0);
		alist.add(10);
		alist.add(20);
		alist.add(5);
		alist.add(15);
		alist.add(25);
		System.out.println(alist); // [0,10,20,25,5,15];

		List<Integer> resList = alist.stream().sorted().collect(Collectors.toList());
		System.out.println(resList); // [0,5,10,15,20,25];

		System.out.println();

		List<Integer> resList2 = alist.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(resList2); // [25,20,15,10,5,0]; (descending order)<br>

		System.out.println();

		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(0);
		lst.add(10);
		lst.add(20);
		lst.add(5);
		lst.add(15);
		lst.add(25);

		Integer minVal = lst.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("minVal = " + minVal);

		Integer maxVal = lst.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("maxVal = " + maxVal);

		System.out.println();

		ArrayList<String> lst2 = new ArrayList<String>();
		lst2.add("Shubham");
		lst2.add("Shubhanshu");
		lst2.add("Ansh");
		
		lst2.forEach(System.out::println);

	}
}
