package ch04;

public class ex4_2 {

	public static void main(String[] args) {
		// ���ǽ��� �پ��� ��

		int x = 0;

		// printf : �����ڸ� ���� ������ ���� ���� ���� �������� ��ȯ�Ͽ� ����ϴ� ���
		// ������ ���� 10�� ������ ����� �� ���� ������ : %d

		System.out.printf("x=%d �� ��, ���� ���� %n", x);

		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)");

		x = 1;
		System.out.printf("x=%d�ϋ�, ���� ���� %n", x);

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
