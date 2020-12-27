package ch04;

public class ex4_4_6 {

	public static void main(String[] args) {
		//두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하시오
		
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
