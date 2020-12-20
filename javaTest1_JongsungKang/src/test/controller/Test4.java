package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.test4();
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int plus = num1 + num2;
		int minus = num1 - num2;
		int mult = num1 * num2;
		int division = num1 / num2;

		System.out.println("합 : " + plus);
		System.out.println("차 : " + minus);
		System.out.println("곱: " + mult);
		System.out.println("나누기 : " + division);

	}

}
