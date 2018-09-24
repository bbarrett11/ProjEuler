package problem.solutions;

public class Problem35 {
	public static void main(String args[]) throws InterruptedException
	{
		int c = 0;
		for(int i= 2; i < 1000000; i++)
		{
			boolean isCircular = true;
			String s = i+"";
			String init = i+"";
			s = s.substring(s.length()-1) + s.substring(0,s.length()-1);
			while(!s.equals(init))
			{
				if(!P(Integer.valueOf(s)))
				{	isCircular = false;
					break;
				}
				s = s.substring(s.length()-1) + s.substring(0,s.length()-1);
			}
			if(isCircular && P(Integer.valueOf(s)))
			{
				c++;
				System.out.println(i);
			}
		}
		System.out.println(c);
	}
	static boolean P(int n)
	{
		for(int i = 2; i<= Math.sqrt(n);i++)
			if(n%i == 0)
				return false;
		return true;
	}
}


