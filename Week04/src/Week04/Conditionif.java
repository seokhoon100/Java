package Week04;

import java.util.Scanner;

public class Conditionif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 연도 입력 : ");
		
		int year = sc.nextInt();
		double age = (2025 - year);
		
		System.out.println(year);
		
		if (age >= 20 && 26 >= age) {
			System.out.println("대학생");
		}
		else if (age >= 18 && 20 > age) {
			System.out.println("고등학생");
		}
		else if (age >= 16 && 18 > age) {
			System.out.println("중학생");
		}
		else if (age >= 12 && 16 > age) {
			System.out.println("초등학생");
		} else {
			System.out.println("학생이 아닙니다");
		}
		
		sc.close();
	}
}
