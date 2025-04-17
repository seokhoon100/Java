package week2;

public class Casting2 {
	public static void main(String[] args) {
		
		String Fment = "과자";
		int amount 	= 7;
		double totalP = 5700;

		//단가 = 총 금액 / 개수
		// int/in => 결과도 int
		double aPrice = (double)totalP / amount;
		
		System.out.printf("구매 수량 : %d개\n", Fment);
		System.out.printf("총 구매 금액 : %d원\n", totalP);		
		System.out.printf("상품 단가 : %.1 f원\n", aPrice);				
	}
}










