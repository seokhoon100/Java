package Week04;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("상품 구매 가격 입력 >> ");
			int price = sc.nextInt();
			int discount = 0;
			int Tprice = 0;
			
			if (price >= 10000) {
				discount = 10;
			}
			else if (price >= 50000) {
				discount = 5;
			} 

			Tprice = price - (price * discount /100);
					
			System.out.println("원래 가격 : " + price + "원");
			System.out.printf("할인율 :" + discount + "%");
			System.out.println("최종 가격 : " + Tprice + "원");
		}
		
	}
}

