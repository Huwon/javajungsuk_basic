package ch04;

public class ex4_4_2 {

	public static void main(String[] args) {
		// 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.

		int i = 0;
		int sum = 0; // sum�� ������ ������ ����
		for (i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) { // 2 �Ǵ� 3�� ����� �ƴ� �� ���ϱ�
				sum += i;
			}
			System.out.println(sum);
		}

	}

}
