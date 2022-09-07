
@FunctionalInterface
interface Demo {
	public void m1(int a, int b);

}
/*no need of this extra class if we use lambda expression*/

//class Implementation implements Demo {
//	public void m1(int a, int b) {
//		System.out.println("a and b");
//	}
//
//	public void m2(int a) {
//		System.out.println("only a");
//	}
//}

public class Main {
	public static void main(String[] args) {
		Demo d1 = (a, b) -> {
			System.out.println("a and b");
		};

		d1.m1(10, 20);
	}
}
