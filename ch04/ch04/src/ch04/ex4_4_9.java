package ch04;

public class ex4_4_9 {

	public static void main(String[] args) {
		/*int타입의 변수 num이 있을 떄, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
		  만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라
		  주의) 문자열로 변환하지 말고 숫자로만 처리해야 한다
		*/
		
		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		
		/*10으로 나머지 연산을 하면 마지막 자리를 얻는다. 그리고 10으로 나누면 마지막 한자리가 제거된다*/
		
		System.out.println("sum=" + sum);

	}

}
