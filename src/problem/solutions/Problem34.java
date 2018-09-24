package problem.solutions;

public class Problem34 {
	public static void main(String args[])
	{
		for(int i = 3; ; i++)
		{
			String s = i+"";
			int f = 0;
			for(char c :s.toCharArray())
			{
				f+=R((int)(c-48));
			}
			if(f==i)
				System.out.println(i);
		}
	}

	static long R(int n)
	{
		return n < 2 ?1 : n*R(n-1);
	}

}