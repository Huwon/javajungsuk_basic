package ch04;

public class ex4_7 {

	public static void main(String[] args) {
		// ������ ���� ����� Math.random()

		// 1~3 ������ ���� ���ϱ�
		int num = 0;

		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 6) + 1; // ���� ���ϰ��� �ϴ� ���� ������ŭ ����
			System.out.println(num);
		}

		// -5 ~ 5 ������ ���� ���ϱ�
		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 11) - 5;
			System.out.println(num);
		}

	}

}
