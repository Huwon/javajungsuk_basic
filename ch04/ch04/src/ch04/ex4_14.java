package ch04;

import java.util.Scanner;

public class ex4_14 {

	public static void main(String[] args) {
		// while문

		int num = 0, sum = 0;
		System.out.println("숫자를 입력하세요>");

		// 입력받은 내용을 tmp에 저장
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp); // 해서 입력받은 문자열 tmp를 숫자로 변환

		while (num != 0) {
			// 10으로 나너지 연산을 하면 마지막 자리를 얻는다
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num % 10;
			System.out.printf("sum=%3d num=%d%n", sum, num);

			num /= 10; // num = num /10;
		}
		System.out.println("각 자리수의 합: " + sum);

	}

}
