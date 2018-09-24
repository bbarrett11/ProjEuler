package problem.solutions;

public class Problem33 {
	public static void main(String[] args)
	{
		double f= 1;
		for(int i = 0; i < 100;i++)
		{
			for(int h = 1; h < 100; h++)
			{
				String s1 = i+"";
				String s2 = h+"";
				if(s1.contains(s2.substring(0,1)))
				{
					double n1 = Double.parseDouble(s1);
					double d1 = Double.parseDouble(s2);
					s1.replace(s2.substring(0,1), "");
					s2 = s2.substring(1);
					if(s1.length()<1 || s2.length() <1 || s2.equals("0"))
						continue;
					double n = Double.parseDouble(s1);
					double d = Double.parseDouble(s2);
					if(n/d == n1/d1)
					{System.out.println(n+" / "+d);
					f*=n1/d1;
					}
				
				}
				else if(s2.length() > 1 && s1.contains(s2.substring(1)))
				{
					double n1 = Double.parseDouble(s1);
					double d1 = Double.parseDouble(s2);
					String ts1 = s1.replace(s2.substring(1), "");
					String ts2 = s2 = s2.substring(0,1);
					if(ts1.length()<1 || ts2.length() <1 || ts2.equals("0"))
						continue;
					double n = Double.parseDouble(ts1);
					double d = Double.parseDouble(ts2);
					if(n/d == n1/d1 && n1 %10 !=0)
					{
						System.out.println(n1+" / "+d1);
						f*=d1/n1;

					}

				}
			}
		}
		System.out.println(1/f);

	}
}
