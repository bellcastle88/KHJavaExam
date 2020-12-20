package test.controller;

public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test2();
	}

	public void test2() {

		int dan = 2;
		for (int y = 2; dan <= 5; dan++) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(dan + " * " + (i * 2 - 1) + " = " + (dan * i));
			}
			System.out.println("........");
		}
	}
}
