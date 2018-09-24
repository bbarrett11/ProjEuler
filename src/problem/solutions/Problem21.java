package problem.solutions;

public class Problem21 {
	public static void main(String[] args)
	{
		int count = 0;
		int[] a = new int[10001];
		for(int i = 1; i < a.length; i++)
		{
			int tempCount = 0;
			for(int h = 1; h < i;h++)
			{
				if(i%h==0)
					tempCount+=h;
			}
			a[i]=tempCount;
			if(tempCount < i && a[tempCount] ==i)
				count+=tempCount+i;
			
		}
		System.out.println("");
		System.out.println(count);
	}
}
