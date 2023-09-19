package hello;

import java.util.Scanner;
public class simple369 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("3,6,9 3,6,9! 3,6,9 3,6,9!");
		System.out.print("1 - 99 사이의 숫자를 입력하시오: ");
		int a = stdin.nextInt();
		
		int b = a/10;  // 10의 자리
		int c = a%10; // 1의 자리 설정
		
		if ((b == 3 || b == 6 || b == 9) && (c == 3 || c == 6 || c == 9)){ // 두 숫자 모두 3,6,9 일 때
			System.out.println("박수 짝짝");
		}
		
		else if ((b == 3 || b == 6 || b == 9) || (c == 3 || c == 6 || c == 9)){ // 두 숫자 중 한개라도 3,6,9 일 때
			System.out.println("박수 짝");
		}
		
		else{ // 두 경우가 아닌 경우
			System.out.println("No 3,6,9");
		}
	}
}
