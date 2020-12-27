package ch04;

public class ex4_4_3 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+...+(1+2+3+..+10)의 결과를 구하시오

		int sum = 0; // 각 i의 합을 저장
		int total = 0; // sum을 저장
		int i;

		for (i = 1; i <= 10; i++) {
			sum += i;
			total += sum;
		}
		System.out.println(total);
	}

}
