package predicate;

import java.util.function.Predicate;

public class App02_ProgramToDisplayNameStartWithK {
	public static void main(String[] args) {
		String[] names = { "Kajal", "karishma", "sunny", "bunny", "kareena", "katrina" };

		Predicate<String> p1 = name -> name.charAt(0) == 'k';

		for (String str : names) {
			if(p1.test(str)) {
				System.out.println(str);
			}
		}

	}
}
