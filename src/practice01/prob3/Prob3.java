package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int val = 0;
		  System.out.print("숫자를 입력하세요");
		  
		int number = scanner.nextInt();

		  System.out.println(number);
		  
		  if(number%2==0) {
			  for(int i=0; i<=number; i++) {
				val=(2+number)*((number)/2)/2; //짝수의 합 공식
			  }
		  } else {
			  val=((number+1)/2)*((number+1)/2); //홀수의 합 공식
				  }
		  System.out.print("결과값 : "+val);
			  
		  }
	}
	

		