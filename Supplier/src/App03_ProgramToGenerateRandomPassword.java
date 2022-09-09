import java.util.function.Supplier;

public class App03_ProgramToGenerateRandomPassword {
	public static void main(String[] args) {
		String pwd = "";

		// supplier to generate random nunmber
		Supplier<Integer> s1 = () -> (int) (Math.random() * 10);

		// supplier to generate random character
		String symbol = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
		Supplier<Character> s2 = () -> symbol.charAt((int) Math.random() * 29);

		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				pwd += s1.get();
			} else {
				pwd += s2.get();
			}
		}

		System.out.println(pwd);

	}
}
