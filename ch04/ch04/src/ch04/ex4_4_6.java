package ch04;

public class ex4_4_6 {

	public static void main(String[] args) {
		//�ΰ��� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����Ͻÿ�
		
		int i=0;
		int j=0;
		
		for(i=0; i <= 6; i ++) {
			for(j=0; j <=6; j++) {
				if(i+j==6) {
					System.out.println(i+"+"+j+"="+(i+j));
				}
			}
		}

	}

}
