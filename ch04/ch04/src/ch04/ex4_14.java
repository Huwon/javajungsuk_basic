package ch04;

import java.util.Scanner;

public class ex4_14 {

	public static void main(String[] args) {
		// while��

		int num = 0, sum = 0;
		System.out.println("���ڸ� �Է��ϼ���>");

		// �Է¹��� ������ tmp�� ����
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp); // �ؼ� �Է¹��� ���ڿ� tmp�� ���ڷ� ��ȯ

		while (num != 0) {
			// 10���� ������ ������ �ϸ� ������ �ڸ��� ��´�
			// num�� 10���� ���� �������� sum�� ����
			sum += num % 10;
			System.out.printf("sum=%3d num=%d%n", sum, num);

			num /= 10; // num = num /10;
		}
		System.out.println("�� �ڸ����� ��: " + sum);

	}

}
