package ch04;

public class ex4_4_7 {

	public static void main(String[] args) {
		/* 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
		 * 만일 문자열이 "12345"라면 '1+2+3+4+5'의 결과인 15가 출력되어야 한다.
		 * hint : string클래스의charAt(int i)를 사용
		 * */
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0';
			
			/*int타입보다 작은 타입은 피연산자(byte, short, char)는 int로 변환한다
			 * 문자 -> 숫자는 -'0(문자코드 48)'*/
			
		}
		
		System.out.println("sum="+sum);

	}

}
