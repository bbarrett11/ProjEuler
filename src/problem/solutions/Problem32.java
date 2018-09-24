package problem.solutions;

import java.util.Arrays;

public class Problem32 {
	public static void main(String[] args)
	{
		long total = 0;
		for(int i = 1; i < 100;i++)
		{
			for(int h = ((i+"").length() ==1 ?1000:(i+"").length() ==2?100:10000); h< 10000; h++)
			{
				
				String s = i+""+h+(i*h);
				boolean[] b = new boolean[9];
				if(s.length()>=10)
					continue;
				for(char c : s.toCharArray())
				{
					if(c==48)
						continue;
					b[c-49] = !b[c-49];
				}
				boolean check = true;
				for(boolean a : b)
				{
					check=a&&check;
				}
				if(check)
				{
					total+=i*h;
					System.out.println(Arrays.toString(b));
					System.out.println((i*h));
				}
			}
		}
		System.out.println(total);
	}
}
