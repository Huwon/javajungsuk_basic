package ch03;

import java.util.Scanner;

public class ex3_4 {

	public static void main(String[] args) {
		//논리 연산자
		
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("문자를 하나 입력하세요>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <='9') {
			System.out.println("입력하신 문자는 숫자입니다.\n");
		}
		
		if(('a'<= ch && ch <='z') || ('A'<= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다. \n");
		}
	}

}
