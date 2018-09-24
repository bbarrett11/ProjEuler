package problem.solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem29 {

	public static void main(String[] args) {
		ArrayList<Double> totals = new ArrayList<Double>();
		
		for(int a = 2; a <= 100; a++)
		{
			for(int b = 2; b <= 100; b++)
			{
				double pow = Math.pow(a, b);
				if(!totals.contains(pow))
				{
					totals.add(pow);
				}
			}
		}
		Object[] d = totals.toArray();
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		System.out.println(totals.size());

	}

}
