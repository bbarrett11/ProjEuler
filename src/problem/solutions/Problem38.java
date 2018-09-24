package problem.solutions;

public class Problem38 {
	public static void main(String[] args)
	{
		int max = 0;
		for(int i = 1; i<100000;i++)
		{
			for(int h = 1; h < 10; h++)
			{
				String s = "";
				for(int j = 1; j < h; j++)
				{
					s+=j*i+"";
				}
				if(s.length() == 9)
				{
					if(s.contains("1") && s.contains("2") && s.contains("3") && s.contains("4") && s.contains("5") && s.contains("6") && s.contains("7") && s.contains("8")&&s.contains("9"))
					{
						if(Integer.valueOf(s) > max)
						{
							max = Integer.valueOf(s);
							System.out.println(max);
						}
					}
				}
			}
		}
	}
}
