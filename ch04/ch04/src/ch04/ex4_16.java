package ch04;

public class ex4_16 {
	public static void main(String[] args) {
		// break문

		int sum = 0;
		int i = 0;

		while (true) { // 무한반복문 : (true)생략불가 - for문은 생략가능
			if (sum > 100)
				break; // 자신이 속한 반복문 벗어남 = while문 벗어남
			++i;
			sum += i;
		}
		System.out.println("i=" + i);
		System.out.println("sum" + sum);
	}
}
