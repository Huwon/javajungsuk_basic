package ch04;

public class ex4_4_7 {

	public static void main(String[] args) {
		/* ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�
		 * ���� ���ڿ��� "12345"��� '1+2+3+4+5'�� ����� 15�� ��µǾ�� �Ѵ�.
		 * hint : stringŬ������charAt(int i)�� ���
		 * */
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0';
			
			/*intŸ�Ժ��� ���� Ÿ���� �ǿ�����(byte, short, char)�� int�� ��ȯ�Ѵ�
			 * ���� -> ���ڴ� -'0(�����ڵ� 48)'*/
			
		}
		
		System.out.println("sum="+sum);

	}

}
