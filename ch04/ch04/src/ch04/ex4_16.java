package ch04;

public class ex4_16 {
	public static void main(String[] args) {
		// break��

		int sum = 0;
		int i = 0;

		while (true) { // ���ѹݺ��� : (true)�����Ұ� - for���� ��������
			if (sum > 100)
				break; // �ڽ��� ���� �ݺ��� ��� = while�� ���
			++i;
			sum += i;
		}
		System.out.println("i=" + i);
		System.out.println("sum" + sum);
	}
}
