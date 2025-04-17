package Week05;

import java.util.Scanner;

public class UD_Game {
	public static void main(String[] args) {
		
		// Up & Down 게임
		
		Scanner sc = new Scanner(System.in);
		
		int answer;
		int number = (int)(Math.random()  * 100 + 1);
			
		
		while (true) {
			System.out.println("숫자 입력 >> ");
			answer = sc.nextInt();
			
			if(answer == number)
			{
				break;
			}
			
			if (answer > number) {
				System.out.println("숫자가 너무 큽니다.");
			}
			else if (number > answer) {
				System.out.println("숫자가 너무 작습니다.");
			}
			
			else {
				System.out.println("TRY AGAIN");
			}
		}	
		
		System.out.printf("\n정답입니다. 랜덤 숫자는 %d입니다.", answer);
			
		sc.close();
	}
}

