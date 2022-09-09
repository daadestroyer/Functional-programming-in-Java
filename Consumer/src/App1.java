import java.util.function.Consumer;

public class App1 {
	public static void main(String[] args) {
		Consumer<String> c1 = name->System.out.println(name);
		c1.accept("Shubham Nigam");
	}
}
