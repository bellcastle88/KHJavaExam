package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Test6 t6 = new Test6();
		t6.test6();
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("** 입력이 정상적으로 되었습니다! **");
			break;
		case 2:
			System.out.println("** 조회가 시작되었습니다! **");
			break;
		case 3:
			System.out.println("** 수정이 정상적으로 되었습니다! **");
			break;
		case 4:
			System.out.println("** 삭제가 정상적으로 되었습니다! **");
			break;
		default:
			System.out.println("** 정상적으로 종료 되었습니다! **");
			break;
		}
	}

}
