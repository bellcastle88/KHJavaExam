package test.controller;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test3();
	}

	public void test3() {
		int i = 1;
		double total = 0;
		while (i <= 100) {
			total = total + i;
			System.out.println(total);
			System.out.println(i);
			i++;
		}
		System.out.println("합계 : " + total);
		System.out.println("평균  : " + (total / 100));
	}

}
