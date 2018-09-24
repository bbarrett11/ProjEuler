package problem.solutions;

import java.math.BigDecimal;

public class Problem12 {
	public static void main(String[] args)
	{
		double num = 0;
		int count=0;
		for(int i = 0; i < 1000000; i++)
		{
			count =0;
			num = i*(i+1)/2;
			for(int h = 2; h <=Math.sqrt(num); h++)
			{
				if(num%h==0) count+=1;
			}
			if(count >250)System.out.println(new BigDecimal(num).toPlainString());
			
			if(i%1000 == 0) System.out.println(i);
		}
	}
}
