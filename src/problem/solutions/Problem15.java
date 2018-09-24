package problem.solutions;

import java.util.Arrays;

public class Problem15 {
	public static void main(String[] args)
	{
		long[][] a = new long[21][21];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i][0] =1;
			a[0][i] =1;
		}
		for(int i = 1; i < a.length;i++)
			for(int h = 1; h < a[0].length;h++)
			{
				a[i][h] = a[i-1][h]+a[i][h-1];
			}
		for(long[] row: a)
			System.out.println(Arrays.toString(row));
		System.out.println(a[20][20]);
	}
}
