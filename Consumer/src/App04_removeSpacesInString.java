import java.util.function.Function;

public class App04_removeSpacesInString {
	public static void main(String[] args) {
		String str = "shubham nigam java certified";
		
		Function<String, String> f1 = S->S.replaceAll(" ","");
		
		System.out.println(f1.apply(str));
	}
}
