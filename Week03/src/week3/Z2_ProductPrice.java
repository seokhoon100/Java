package week3;

public class Z2_ProductPrice {
	public static void main(String[] args) {
		int Price = 0;
		double DPrice = 0;
		double TPrice = 0;
		
		int Milk = 4500;
		int Milk_m = 1;
		
		int Carrot = 1000;
		int Carrot_m = 3;
		
		int Frestment = 1500;
		int Frestment_m = 2;
		
		Price = Milk * Milk_m + Carrot * Carrot_m + Frestment * Frestment_m;
		
		DPrice= Price * 0.1;
		TPrice = Price - DPrice;
		
		System.out.println("할인 전 상품 가격 : " + Price + "원");
		System.out.println("할인 가격 : " + DPrice + "원");
		System.out.println("최종 결제 금액 : " + TPrice + "원");
	}
}





