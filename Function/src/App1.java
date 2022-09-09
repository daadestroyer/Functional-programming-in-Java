import java.util.function.Function;


public class App1 {
	public static void main(String[] args) {
		Function<String, Integer> f1 = (s1) -> s1.length();
		// function is a functional interface and hence it can refer lambda expression
		// function can return any type of value depend on our requirement
		System.out.println(f1.apply("shubham"));
		System.out.println(f1.apply("shubham nigam"));
		
		System.out.println("");
		// write a function to return square of that number
		
		Function<Integer, Integer> f2 = (num1)->num1*num1;
		System.out.println(f2.apply(2));
		
	}
}
