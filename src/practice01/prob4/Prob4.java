package practice01.prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력해주세요");
		String word = sc.nextLine();

		String[] array_word = new String[word.length()]; // 스트링을 담을 배열
		String result = ""; 

		for(int i=0;i<array_word.length;i++){ //스트링을 한글자씩 끊어 배열에 저장
			array_word[i]=Character.toString(word.charAt(i));
		}
				
		for(int i=0;i<array_word.length;i++) {
			result=array_word[i]; //
		}
						
		System.out.println(result); //글자  출력
	}
}
