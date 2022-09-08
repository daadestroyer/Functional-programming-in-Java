
interface Interf {
	// just to define general utility method and no way related to object state then
	// we can use interface static method in any class without implemented interface also can use this method
	/* overriding static method of interface is not applicable , but you can declare same static method in implementation class just like 
	   interface static method but that's not called as a overriding of static method */

	public static void m1() {
		System.out.println("interface m1 static method");
	}
}

public class App3_static implements Interf {
	public static void main(String[] args) {
		App3_static app3_static = new App3_static();
		// app3_static.m1();
		// App3_static.m1();
		
		// interface static method by default not available to child class means inheritance is not there
		// hence using implementation class object or using implementation class name you can not call interface static method
		
		Interf.m1();
		// interface static method you can call by using interface name only
		
		
	}
}
