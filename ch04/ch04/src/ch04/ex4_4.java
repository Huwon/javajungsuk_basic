package ch04;

import java.util.Scanner;

public class ex4_4 {

	public static void main(String[] args) {
		// if - else if��

		int score = 0;
		char grade = ' '; // ��������, �������� �ʱ�ȭ

		System.out.print("������ �Է��ϼ���>");
		Scanner scanner = new Scanner(System.in); // ��ĳ�ʸ� ���ؼ� �Է¹��� ���ڸ� score�� ����
		score = scanner.nextInt(); // �Է¹��� ���ڴ� int��

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			// else if(80 <= score && score < 90)�� ���������� else if�� �̹� �տ��� 90���� ũ�� �ʴٴ°� Ȯ�εǱ�
			// ����
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("����� ������" + grade + "�Դϴ�.");
	}

}
