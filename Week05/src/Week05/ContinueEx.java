package Week05;

public class ContinueEx {
	public static void main(String[] args) {
		int sum1 = 0;
		
		for (int i = 1; i <= 100; i++) 
		{
			// 짝수만 출력
			// 홀수는 생략
			if (i%2 != 0)			// 홀수인 경우
				continue;
		}
		
		for(int i = 1; i < 10; i ++)
		{
			if(i%3 == 0)
			{
				continue;
			}
			sum1 += i;
		}
		System.out.println("3의 배수를 제외한 합 = " + sum1);

		// 3의 배수의 합 구하기
		int sum2 = 0;
		
		for(int i = 1; i < 10; i ++)
		{
			if(i%3 == 0)
			{
				sum2 += i;
			}
		}
		
		System.out.println("3의 배수의 합 = " + sum2);
		System.out.println("sum1 + sum2 = " + (sum1 + sum2));
	}
}

