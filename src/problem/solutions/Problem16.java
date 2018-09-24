package problem.solutions;

import java.math.BigDecimal;

public class Problem16 {
	public static void main(String[] args)
	{
		long sum = 0;
		int temp = 10;
		int count= 0;
		
		System.out.println(sumOfDigits(new BigDecimal(Math.pow(2,1000))));
		
		BigDecimal ten = new BigDecimal(10);
		BigDecimal nine = new BigDecimal(9);
		System.out.println(nine.compareTo(ten));
	}
	
	public static BigDecimal sumOfDigits(BigDecimal num)
	{
		BigDecimal ten = new BigDecimal(10);
		return num.compareTo(ten) < 0 ? num: num.remainder(ten).add(sumOfDigits(num.divide(ten).setScale(0, BigDecimal.ROUND_DOWN)));
	}
}
