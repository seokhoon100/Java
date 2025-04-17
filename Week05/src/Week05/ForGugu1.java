package Week05;

import java.util.Scanner;

public class ForGugu1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 몇단? : ");
		int num = sc.nextInt();
		
		System.out.printf("< 구구단 %d단 >\n ", num);
		for(int i = 1; i < 10; i++)
		{
			System.out.printf("%d X %d = %d\n ", num, i, num * i);
		}
		sc.close();
	}
}
