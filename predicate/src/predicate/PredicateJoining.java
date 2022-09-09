package predicate;

import java.util.function.Predicate;

public class PredicateJoining {
	
	static void m1(Predicate<Integer> p , int[]	x) {
		for (int i : x) {
			if(p.test(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = { 0, 5, 10, 15, 20, 25, 30 };
		
		Predicate<Integer> p1 = (num)->num>10;
		Predicate<Integer> p2 = (num) -> num % 2 == 0;
		
		
		System.out.println("num greater than 10 are");
		m1(p1, arr);
		
		System.out.println("\n");
		
		System.out.println("num not greater than 10 are");
		m1(p1.negate(), arr);
		
		System.out.println("\n");
		
		System.out.println("num divided by 2 are");
		m1(p2, arr);
		
		System.out.println("\n");
		
		System.out.println("num not divided by 2 are");
		m1(p2.negate(), arr);
		
		System.out.println("\n");
		
		System.out.println("num greater than 10 and divided by 2");
		m1(p1.and(p2), arr);
	}
}
