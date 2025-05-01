package Week06;

import java.util.Arrays;

public class ArrayEx3 {
	public static void main(ReferenceString[] args) {
		//
		//
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[7];
		
		// for 문 이용
		for (int i = 0; i < arr1.length; i++)
		{
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");			
		}
		System.out.println();
		// Array 클래스 이용
		arr2 = Arrays.copyOf(arr1, 3);
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}

	}
}

