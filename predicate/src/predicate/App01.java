package predicate;

import java.util.function.Predicate;

@FunctionalInterface
interface eligibleForVote {
	public boolean eligibleForVote(int age);
}

@FunctionalInterface
interface findLength{
	public boolean findLength(String name);
}

public class App01 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = (age)->age>17;
		System.out.println(p1.test(20));
		
		Predicate<String> nm1 = (name)->name.length()>5;
		System.out.println(nm1.test("shubham"));

	}
}
