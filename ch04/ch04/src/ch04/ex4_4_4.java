package ch04;

public class ex4_4_4 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+..�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�
		
		
		int sw = 1; //����ġ ���� : i�� -i�� i�� �ٲٰ� ��
		int num = 0;
		int sum = 0;
		
		for(int i=1; true; i++, sw = -sw) {
			
			num = sw * i;
			sum += num;
			
			if(sum >= 100) {
				break;
			}
			
		}
		
		System.out.println(num);
		System.out.println(sum);
		

	}

}
