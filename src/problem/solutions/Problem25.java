package problem.solutions;

import java.math.BigDecimal;

public class Problem25 {
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal(1);
		BigDecimal b = new BigDecimal(1);
		BigDecimal c = new BigDecimal(2);
		int count = 3;
		while(a.toString().length() < 1000 &&b.toString().length() < 1000 &&c.toString().length() < 1000)
		{
			a=b.add(c);
			count++;
			if(a.toString().length() == 1000)
			{
				System.out.println(count);
				break;
			}
			count++;
			b=a.add(c);
			if(b.toString().length() == 1000)
			{
				System.out.println(count);
				break;
			}
			count++;
			c=a.add(b);
			if(c.toString().length() == 1000)
			{
				System.out.println(count);
				break;
			}
		}
	}
}
