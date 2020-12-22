package ch03;

public class ex3_3 {

	public static void main(String[] args) {
		
		//형변환 
		double d = 85.4;
		int score = (int) d;
		System.out.println("score=" + score);
		System.out.println("d=" + d);
		
		
		//산술변환
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);
		System.out.println(c);
		
		/*피연산자의 타입이 int보다 작으면 int로 변환
		300은 byte형의 범위를 넘기 때문에 byte형으로 변환하면 데이터 손실이 발생,
		int 300 -> byte 44가 됨*/
		
		int e = 1000000; 
		int f = 2000000;
		
		long g = e*f;
		
		System.out.println(g);
		
		/*e*f의 결과가 이미 int타입의 값이므로 long으로 자동 형변환되어도 값은 변하지 않는다.
		 올바른 결과를 얻으려면 변수 e 또는 f타입을 long으로 형변환 해야한다.
		 */

	}

}
