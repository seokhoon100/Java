package Week06;

public class TwoDimention {
	public static void main(ReferenceString[] args) {
		// int[행][열]
		int[][] math = new int[2][3];
		// 2차원 배열 => 중첩 for문
		for (int i = 0; i < math.length; i++)
		// 밖 for : 행의 반복
		{
			for (int j = 0; j < math.length; i++)
			// 안 for : 열의 반복
			{
				System.out.printf("math[%d][%d] = %d\n", i, j, math[i][j]);
			}
		}
		System.out.println();
		
		int[][] eng = new int [2][];
		eng[0] = new int[2];
		eng[1] = new int[3];

		for (int i = 0; i < eng.length; i++)
			// 밖 for : 행의 반복
			{
				for (int j = 0; j < eng.length; i++)
				// 안 for : 열의 반복
				{
					System.out.printf("eng[%d][%d] = %d\n", i, j, eng[i][j]);
				}
			}
			System.out.println();

	}
}

