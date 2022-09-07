interface Left {

	default void m1() {
		System.out.println("m1 of left");
	}
}

interface Right {

	default void m2() {
		System.out.println("m2 of left");
	}
}

class Impl implements Left,Right{
	public void m1() {
		Left.super.m1();
	}
}
public class App2_default {
	public static void main(String[] args) {

	}
}
