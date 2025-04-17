package Week05;

public class ForGugu2 {
	public static void main(String[] args) 
	{
		// 2~9단 출력
		// 밖 for 문 : 단의 반복
		// 안 for 문 : 1~9까지의 반복
		for(int i = 2; i <= 9; i++)
		{
			System.out.println("===========");
			System.out.println("구구단" + i + "단이다 ");
			System.out.println("===========\n");

			for(int j = 1; j <= 9; j++) 
			{
				System.out.printf("%d X %d = %d\n", i, j, j * i);
			}
		}
	}
}
