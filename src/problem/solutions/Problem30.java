package problem.solutions;

public class Problem30 {
	public static void main(String[] args)
	{
		double finalTotal = 0;
		for(double i = 2; i < 2000000;i++)
		{
			double temp = i;
			double tempTotal =0;
			while(temp > 0)
			{
				tempTotal+=Math.pow(temp%10, 5);
				temp=(int)temp/10;
			}
			if(tempTotal==i)
			finalTotal+=i;
		}
		System.out.println(finalTotal);
	}
}
