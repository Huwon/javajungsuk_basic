package ch03;

public class ex3_2 {
	
	public static void main(String[] args) {
		
		//����������
		
		int i = 5, j= 0;
		
		j=i++; //������
		System.out.println("j=i++; ���� �� i=" + i + ", j=" + j);
		
		
		i=5;
		j=0;
		
		
		j= ++i;//������
		System.out.println("j=++i ������, i=" +i  + ", j=" + j );
		
		
		int k =5, f=5;
		System.out.println(k++);  //k�� ���� ��� ��, 1 ����
		System.out.println(++f);  //j�� ���� 1 ���� ��, ���
		System.out.println("k="+k+", f=" +f);
		
		
		
		//��ȣ������
		
		int a = -10;
		a = +a;
		System.out.println(a);
		
		
		
		a = -10;
		a = -a;  // a = -(-10);
		System.out.println(a);
	}

}
