package ch04;

public class ex4_4_4 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+..와 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
		
		
		int sw = 1; //스위치 변수 : i를 -i와 i로 바꾸게 함
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
