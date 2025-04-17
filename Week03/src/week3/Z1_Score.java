package week3;

public class Z1_Score {
	public static void main(String[] args) {
		
		int Score = 50;
		
		System.out.println("초기 점수 :  " + Score );
		
	    Score += 10;
		System.out.println("정답 보너스 (+10) :  " + Score );
		
		Score -= 5;
		System.out.println("오답 감점 (-5) :  " + Score );
		
		Score *= 2;
		System.out.println("보너스 문제 정답(x2) :  " + Score );
		
		Score++;
		System.out.println("추가 점수 (+1) :  " + Score );
		
		Score--;
		System.out.println("감점 (-1) :  " + Score );
	    
		System.out.println("최종 점수 :  " + Score );
	}
}





