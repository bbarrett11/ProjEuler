package problem.solutions;

public class Problem39 {
	public static void main(String[] args)
	{
		int max = 0;
		int maxN = 0;
		for(int i = 1; i <=1000;i++)
		{
			int c = 0;
			for(int h=1; h < i; h++)
			{
				for(int j = 1; j < i-h;j++)
				{
					int w = i-j-h;
					if(h+j>w && h+w > j && j+w>h && h*h+j*j==w*w)
						c++;
				}
			}
			if(c>max)
			{
				max = c;
				maxN=i;
				System.out.println(i);
			}
			if(i==120)
				System.out.println(c);
		}
	}
}
