package ch04;

public class ex4_7 {

	public static void main(String[] args) {
		// 임의의 정수 만들기 Math.random()

		// 1~3 사이의 정수 구하기
		int num = 0;

		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 6) + 1; // 내가 구하고자 하는 값의 차수만큼 곱함
			System.out.println(num);
		}

		// -5 ~ 5 사이의 정수 구하기
		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 11) - 5;
			System.out.println(num);
		}

	}

}
