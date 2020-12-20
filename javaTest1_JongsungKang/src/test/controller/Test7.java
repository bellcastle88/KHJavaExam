package test.controller;

public class Test7 {

	public static void main(String[] args) {
		Test7 t7 = new Test7();
		t7.test7();
	}

	public void test7() {
		int n = 0;
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double sum = 0;

		for (int i = 0; i <= array.length; i++) {
			if (i % 2 == 1) {
				sum += array[i];
				System.out.println(i);
			}
		}
		System.out.println("합계 : " + sum);
	}

}
