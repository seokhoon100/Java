package Week04;

import java.util.Scanner;

public class Switch4 {
	public static void main(String[] args) {
		String mobile = "iPhone";
		
		switch(mobile) {
		case "iPhone" -> System.out.println();
		case "uPhone" -> System.out.println();
		}
		System.out.println();
		
		//점수에 따른 등급 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 >> ");
		int score = sc.nextInt();
		
		char grade = switch(score/10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
		
		System.out.println(grade);
		sc.close();
	}
}

