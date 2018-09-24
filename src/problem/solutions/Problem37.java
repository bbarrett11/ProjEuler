package problem.solutions;

public class Problem37 {
	public static void main(String[] args)
	{
		for(int i = 11; ;i++)
		{
			boolean isP = true;
			if(!P(i))
				continue;
			int tp = i;
			while(tp>0)
			{	
				if(!P(tp))
				{	
					isP = false;
					break;
				}
				tp/=10;
			}
			tp = i;
			while(tp>0)
			{
				if(!P(tp))
				{
					isP=false;
					break;
				}
				String tS = tp+"";
				tS = tS.substring(1);
				if(tS.equals(""))
					break;
				tp = Integer.valueOf(tS);
			}
			if(isP)
				System.out.println(i);
		}
	}
	static boolean P(int n)
	{
		if(n==1)
			return false;
		for(int i = 2; i <= Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
}
