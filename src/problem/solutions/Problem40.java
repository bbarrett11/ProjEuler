package problem.solutions;

public class Problem40 {
	public static void main(String[] args)
	{
		int[] elems = {1,10,100,1000,10000,100000,1000000};
		int n = 0;
		int a = 0;
		int f = 1;
		for(int i = 1; a<elems.length;i++)
		{
			String s = i+"";
			n+=s.length();
			//System.out.println(n);
			if(n>=elems[a])
			{
				f*=(s.charAt(s.length()-1-(n-elems[a]))-48);
				a++;
			}
		}
		System.out.println(f);
	}
}
