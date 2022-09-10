
interface Interf {

	public void m1();

}

public class App01 {
	
	public static void m2() {
		System.out.println("m2 method");
	}
	
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) {
		// lambda expression implementation of Functional Interface
		Interf interf = ()->System.out.println("hello");
		interf.m1();
	
	
		Interf interf2 = App01::m2;
		interf2.m1();
		
		App01 app01 = new App01();
		Interf interf3 = app01::m3;
		interf3.m1();
	}
}
