package chap04.book.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		String a;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액확인 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");

			int menu = scanner.nextInt();
			int money = 0;

			switch (menu) {
			case 1:
				System.out.print("예금액을 입력하세요 >");
				money = scanner.nextInt();
				balance += money;
				System.out.println(balance);
				break;
			case 2:
				System.out.print("출금액을 입력하세요 >");
				money = scanner.nextInt();
				balance -= money;
				System.out.println(balance);
				break;
			case 3:
				System.out.println("현재 잔액은 " + balance + "원 입니다.");
				break;
			case 4:
				run = false;
				break;

			}

		}

		System.out.println("프로그램 종료");
		scanner.close();
	}
}
