package problem.solutions;

public class Problem43 {
	public static void main(String[] args)
	{
		/*long sum = 0;
		for(long i = 1000000000; i < 9999999999l;i++)
		{
			char[] nums = (i+"").toCharArray();
			int[] count = new int[10];
			for(char c : nums)
			{
				count[c-48]++;
			}
			boolean isPand=true;
			for(int h : count)
			{
				if(h>1)
					isPand = false;
			}
			System.out.println(i);
			if(!isPand)
				continue;
			if(Long.valueOf(""+nums[1]+nums[2]+nums[3])%2==0 &&
					Long.valueOf(""+nums[2]+nums[3]+nums[4])%3==0 &&
					Long.valueOf(""+nums[3]+nums[4]+nums[5])%5==0 &&
					Long.valueOf(""+nums[4]+nums[5]+nums[6])%7==0 &&
					Long.valueOf(""+nums[5]+nums[6]+nums[7])%11==0 &&
					Long.valueOf(""+nums[6]+nums[7]+nums[8])%13==0 &&
					Long.valueOf(""+nums[7]+nums[8]+nums[9])%17==0)
			{
				sum+=i;
			}
		}*/
		System.out.println(recurseCombinations("0123456789",""));
	}
	
	public static long recurseCombinations(String full,String permuted)
	{
		if(full.length() == 0 )
		{
			System.out.println(permuted);
			char[] nums = permuted.toCharArray();
			if(Long.valueOf(""+nums[1]+nums[2]+nums[3])%2==0 &&
					Long.valueOf(""+nums[2]+nums[3]+nums[4])%3==0 &&
					Long.valueOf(""+nums[3]+nums[4]+nums[5])%5==0 &&
					Long.valueOf(""+nums[4]+nums[5]+nums[6])%7==0 &&
					Long.valueOf(""+nums[5]+nums[6]+nums[7])%11==0 &&
					Long.valueOf(""+nums[6]+nums[7]+nums[8])%13==0 &&
					Long.valueOf(""+nums[7]+nums[8]+nums[9])%17==0)
			{
				return Long.valueOf(permuted);
			}
			return 0;
		}
		long sumCombinations = 0;
		for(int i = 0; i< full.length(); i++)
		{
			char c = full.charAt(i);
			sumCombinations+= recurseCombinations(full.replaceAll(""+c, ""),permuted+c);
		}
		return sumCombinations;
	}
	
}
