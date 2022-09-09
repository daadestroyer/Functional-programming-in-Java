import java.util.function.Supplier;

public class App01_ProgramToGetRandomName {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> {
			String[] arr = { "shubham", "ansh", "shubhanshu", "pulkit", "anshul" };
			
			int val = (int)(Math.random() * 4);
			return arr[val];
		};
		
		
		System.out.println(s1.get());
	}
}
