package problem.solutions;

public class Problem36 {
	public static void main(String[] args) throws InterruptedException
	{
		long c = 0;
		for(int i = 0; i < 1000000; i++)
		{
			StringBuilder s2= new StringBuilder(i+"");
			s2.reverse();
			
			if(!(i+"").equals(new String(s2)))
				continue;
			String b2 = Integer.toString(i,2);
			StringBuilder t2 = new StringBuilder(b2);
			t2.reverse();
			if((b2+"").equals(new String(t2)))
			{	
			c+=i;
			System.out.println(i);
			}
		}
		System.out.println(c);
	}
}
