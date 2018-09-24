package problem.solutions;

import java.math.BigDecimal;

public class Problem20 {
	public static void main(String[] args)
	{
		BigDecimal a = fact(new BigDecimal(100));
		System.out.println(a);
		int sum = 0;
		for(char c : (a.toString()+"").toCharArray())
		{
			sum+=c-48;
		}
		System.out.println(sum);

	}
	
	public static BigDecimal fact(BigDecimal n)
	{
		return n.compareTo(new BigDecimal(1)) ==0 ? new BigDecimal(1) : n.multiply(fact(n.subtract(new BigDecimal(1))));
	}
	

}
