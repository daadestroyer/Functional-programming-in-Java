

interface Inter{
	default void m1() {
		System.out.println("this is default m1 method");
	}
}

class Implementation implements Inter{
	
	// we can override default method of interface
	public void m1() {
		System.out.println("m1 is override now");
	}
	

}
public class App_default {
	public static void main(String[] args) {
		
	}
}
