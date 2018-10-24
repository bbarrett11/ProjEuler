package problem.solutions;

import java.util.ArrayList;

public class Problem46 {
	static ArrayList<Long> primes= new ArrayList<>();
	static ArrayList<Long> squares= new ArrayList<>();

	public static void main(String[] args)
	{
		squares.add(2l);
		for(long i = 2; i < 100000;i++)
		{
			if(isPrime(i))
				primes.add(i);
			squares.add(2*i*i);
		}
		for(long i = 3; i < 1000000; i+=2)
		{
			if(!primes.contains(i))
			{
				boolean noSolution = true;
				for(int j = 0; j < primes.size();j++)
				{
					if(primes.get(j)<i)
					{
						for(int h = 0; h < squares.size();h++)
						{
							if(primes.get(j)+squares.get(h) == i)
							{
								noSolution = false;
								break;
							}
							else if(primes.get(j)+squares.get(h) > i)
								break;
						}
					}
					if(!noSolution)
						break;
				}
				if(noSolution)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
	
	private static boolean isPrime(long p)
	{
		for(int i = 2; i < Math.sqrt(p);i++)
		{
			if(p%i==0)
				return false;
		}
		return true;
	}
}
