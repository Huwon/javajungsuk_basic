package ch03;

public class ex3_3 {

	public static void main(String[] args) {
		
		//����ȯ 
		double d = 85.4;
		int score = (int) d;
		System.out.println("score=" + score);
		System.out.println("d=" + d);
		
		
		//�����ȯ
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);
		System.out.println(c);
		
		/*�ǿ������� Ÿ���� int���� ������ int�� ��ȯ
		300�� byte���� ������ �ѱ� ������ byte������ ��ȯ�ϸ� ������ �ս��� �߻�,
		int 300 -> byte 44�� ��*/
		
		int e = 1000000; 
		int f = 2000000;
		
		long g = e*f;
		
		System.out.println(g);
		
		/*e*f�� ����� �̹� intŸ���� ���̹Ƿ� long���� �ڵ� ����ȯ�Ǿ ���� ������ �ʴ´�.
		 �ùٸ� ����� �������� ���� e �Ǵ� fŸ���� long���� ����ȯ �ؾ��Ѵ�.
		 */

	}

}
