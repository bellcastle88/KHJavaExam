package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test5();
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int mult = num1 * num2;

		if (mult <= 10) {
			System.out.println("한자리 수 입니다.");
		} else
			System.out.println("두자리 수 입니다.");
	}

}
