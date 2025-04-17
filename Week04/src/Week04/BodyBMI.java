package Week04;

import java.util.Scanner;

public class BodyBMI {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.println("키(cm)를 입력하세요 : ");
			int hight = sc.nextInt();
			System.out.println("몸무게(kg)를 입력하세요 : ");
			int weight = sc.nextInt();
			
			double mhight = hight/100;
			
			double bmi = weight / mhight * mhight;
			
			String result = "";
			
			if (bmi >= 18.5 && bmi < 23) {
				result = "정상";
			}
			else if (bmi >= 23 && bmi < 25) {
				result = "과체중";
			}
			else if (bmi >= 25 && bmi < 30) {
				result = "비만";
			} else {
				result = "고도비만";
			}
			
			System.out.println(name + "님의 키는 " + hight + "cm이고 몸무게는 " + weight + "kg 입니다.");
			System.out.printf("BMI 지수 = %.2f, %s", bmi, result);
		}
		
	}
}

