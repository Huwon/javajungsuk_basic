package ch04;

public class ex4_4_3 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+...+(1+2+3+..+10)�� ����� ���Ͻÿ�

		int sum = 0; // �� i�� ���� ����
		int total = 0; // sum�� ����
		int i;

		for (i = 1; i <= 10; i++) {
			sum += i;
			total += sum;
		}
		System.out.println(total);
	}

}
