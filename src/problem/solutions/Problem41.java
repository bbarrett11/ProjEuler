package problem.solutions;

public class Problem41 {
	public static void main(String[] args)
	{
		long max = 0;
		for(long i = 1; i < 999999999l;i++)
		{
			int[] check = new int[10];
			for(char c : (i+"").toCharArray())
				check[c-48]++;
			boolean isPand=check[0]==0;
			for(int index = 0; index < 10; index++)
			{
				if(check[index]>1 || (index > (i+"").length() && check[index]>0))
					isPand = false;
			}
			if(isPand && isPrime(i))
			{	max = i;
				System.out.printf("%d \n",max);
			}
			
		}
		System.out.println(max);
	}
	
	public static boolean isPrime(long n)
	{
		for(int i = 2; i < (int)Math.sqrt(n);i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
