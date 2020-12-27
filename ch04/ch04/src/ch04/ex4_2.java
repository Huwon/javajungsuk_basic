package ch04;

public class ex4_2 {

	public static void main(String[] args) {
		// 조건식의 다양한 예

		int x = 0;

		// printf : 지시자를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력하는 기능
		// 정수형 값을 10진 정수로 출력할 떄 쓰는 지시자 : %d

		System.out.printf("x=%d 일 떄, 참인 것은 %n", x);

		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)");

		x = 1;
		System.out.printf("x=%d일떄, 참인 것은 %n", x);

		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)");
	}

}
