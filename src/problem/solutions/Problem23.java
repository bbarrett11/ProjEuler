package problem.solutions;

import java.util.ArrayList;

public class Problem23 {
	public static void main(String[] args)
	{
		int[] abundant = new int[28124];
		for(int i = 0; i < 28124;i++)
		{
			int count=0;
			for(int h = 1; h < i; h++)
			{
				if(i%h==0)
					count+=h;
			}
			if(count > i)
				abundant[i]=1;
		}
		long totalCount=0;
		for(int i = 1; i < 28124; i++)
		{
			boolean canBeWritten = false;
			for(int h = 0; h< abundant.length;h++)
			{
				if(abundant[h] > 0)
					if(i-h > 0 && abundant[i-h] > 0)
					{
						canBeWritten = true;
						break;
					}	
			}
			if(!canBeWritten)
			{
				totalCount+=i;
				System.out.println(totalCount);
			}
			
		}
	}
}
