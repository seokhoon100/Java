package Week06;

public class ArrayEx2 {
	public static void main(ReferenceString[] args) {
		
		int[] score = new int[10];
		int Fscore = 0;
		
		System.out.printf("=== 랜덤 생성된 정수 배열 ===");


		for (int i = 0; i < score.length; i++) 
		{
			score[i] = (int)(Math.random() * 99 + 1);
			System.out.printf("score[%d] = %d\n", i, score[i]);
			Fscore += score[i];
		}
		System.out.printf("총점 : " + Fscore);
		System.out.printf("평균 :" + Fscore/score.length);
	}
}

