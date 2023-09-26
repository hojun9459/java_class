package hello;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("금액을 입력하세요: ");
		int price = stdin.nextInt(); // 금액 입력
		
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		for (int billunit : unit) { // for 구문 배열에 적용
			int count = price / billunit; // 각 금액권에 대한 갯수
			price = price % billunit; // 이 전의 금액권 갯수 계산 후 남은 돈 저장
			if (count > 0) // 금액권 갯수가 0 이상일 경우
				System.out.println(billunit+": "+count);
			else // 금액권 갯수가 0개일 경우 (조건에 따르면 안 써도 괜찮지만 편의상 추가했음)
				System.out.println(billunit+": 0");
		}
			
	}

}
