package ch04;

public class ex4_4_10 {

	public static void main(String[] args) {
		/*1�� 100������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ������ ������ ������.
		 * ����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�.*/
		//1~100������ ������ ���� �� anwser�� �����Ѵ�.
		int answer = (int)(Math.random()*100)+1;
		int input = 0; //����� �Է��� ������ ����
		int count = 0; //�õ�Ƚ���� �������� ����
		
		//ȭ�����κ��� ����� �Է��� �ޱ� ���ؼ� ScannerŬ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� :");
			input = s.nextInt(); //�Է¹��� ���� ���� input�� ����
			
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���");
			}else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else{
				System.out.println("�������ϴ�.");
				System.out.println("�õ�Ƚ����" + count +"���Դϴ�.");
				break;
			}
			
		}while(true); //���� �ݺ���
	}

}
