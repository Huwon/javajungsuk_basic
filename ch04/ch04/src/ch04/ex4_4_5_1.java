package ch04;

public class ex4_4_5_1 {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
			int j = 0;

			while (j <= i) {
				System.out.println("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
