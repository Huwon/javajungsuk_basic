package ch03;

public class ex3_2 {
	
	public static void main(String[] args) {
		
		//증감연산자
		
		int i = 5, j= 0;
		
		j=i++; //후위형
		System.out.println("j=i++; 실행 후 i=" + i + ", j=" + j);
		
		
		i=5;
		j=0;
		
		
		j= ++i;//전위형
		System.out.println("j=++i 실행후, i=" +i  + ", j=" + j );
		
		
		int k =5, f=5;
		System.out.println(k++);  //k의 값을 출력 후, 1 증가
		System.out.println(++f);  //j의 값을 1 증가 후, 출력
		System.out.println("k="+k+", f=" +f);
		
		
		
		//부호연산자
		
		int a = -10;
		a = +a;
		System.out.println(a);
		
		
		
		a = -10;
		a = -a;  // a = -(-10);
		System.out.println(a);
	}

}
