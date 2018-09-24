package problem.solutions;

public class Problem27 {
	public static void main(String[] args)
	{
		int max = 0;
		double total = 0;
		for(int i = -999,h=-1000; i < 1000 && h<=1000;i++)
		{
			int numPrimes = 0;
			for(int j = 0; ;j++)
			{
				if(i==-79 && h==1601)
					System.out.println("hi");
				if(isPrime(j*(double)j +i*j+h))
					numPrimes++;
				else
				{
					break;
				}
			}
			if(numPrimes > max)
			{
				System.out.println(numPrimes);
				System.out.println("i: "+i+"h:"+h);

				max = numPrimes;
				total = i*h;
			}
			if(i==999)
			{
				i=-999;
				h++;

			}
		}
		System.out.println(total);
		System.out.println(max);

	}
	
	public static boolean isPrime(double i)
	{
		i=Math.abs(i);
		for(int h = 2; h <=Math.sqrt(i);h++)
			if(i%h==0) return false;
		return true;
	}
}
