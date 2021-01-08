package ch05;

import java.util.Scanner;

public class ex5_6 {

	public static void main(String[] args) {
		//단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 프로그램을 완성하시오.
		//각 단어안에서의 위치를 섞는 것
		
		String [] words = {"teltevision", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); //String을 char[]로 변환
			
			//char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
			
			for(int j =0; j < question.length; j++) {
				
				//한 단어의 길이만큼 랜덤을 해서 suf로 저장
				int suf = (int)(Math.random()* question.length);
				
				//i를 tmp에 임시로 저장하고 랜덤을 i에 저장, tmp에 저장한걸 다시 랜덤에 저장
				char tmp = question[i];
				question[i] = question[suf];
				question[suf] =  tmp;
			}
			
			
			//words에 저장된 글자(i)만 큼 문제가 나옴.
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question)); 
			
			String answer = scanner.nextLine();
			
			//trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			
			if(words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			
			else
				System.out.printf("틀렸습니다.%n%n");
		}
	}

}
