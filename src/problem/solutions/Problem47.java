package problem.solutions;

public class Problem47 {
	public static void main(String[] args)
	{
		int numFour = 0;
		for(long i = 2; i< 10000000l;i++)
		{
			int numU =0;
			long t = i;
			for(long j = 2; j <= t; j++)
			{
				if(t%j==0)
					numU++;
				while(t%j == 0 && t > 1)
				{
					t/=j;
				}
			}
			if(numU==4)
			{
				numFour++;
				if(numFour==4)
					System.out.println(i-3);
			}
			else
				numFour = 0;
		}
	}
}
