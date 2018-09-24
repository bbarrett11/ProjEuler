package problem.solutions;

public class Problem14 {
	public static void main(String[] args)
	{
		long maxChain = 1;
		long chainLength = 1;
		for(int i = 2; i< 1000001;i++)
		{
			long temp = i;
			long count = 0;
			while(temp !=1)
			{
				if(temp%2==0)
				{
					temp = temp/2;
				}
				else
				{
					temp = 3*temp+1;
				}
				count++;
			}
			if(count >chainLength)
			{
				maxChain=i;
				chainLength = count;
			}
				//System.out.println(i);
		}
		System.out.println(maxChain);
	}
}
