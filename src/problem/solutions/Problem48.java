package problem.solutions;

public class Problem48 {
	public static void main(String[] args)
	{
		double s = 0;
		for(int i = 1; i < 1001; i++)
		{
			double t = i;
			for(int j = 0; j < i-1; j++)
			{
				t= (t*i)%Math.pow(10, 10);
			}
			System.out.println(t+": "+Math.pow(i, i));
			s= (s+t) %Math.pow(10, 10) ;
		}
		System.out.println(s);
	}
}
