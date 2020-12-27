package ch04;

import java.util.Scanner;

public class ex4_4 {

	public static void main(String[] args) {
		// if - else if문

		int score = 0;
		char grade = ' '; // 학점저장, 공백으로 초기화

		System.out.print("점수를 입력하세요>");
		Scanner scanner = new Scanner(System.in); // 스캐너를 통해서 입력받은 숫자를 score에 저장
		score = scanner.nextInt(); // 입력받은 숫자는 int로

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			// else if(80 <= score && score < 90)도 가능하지만 else if라 이미 앞에서 90보다 크지 않다는게 확인되기
			// 떄문
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
	}

}
