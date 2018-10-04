package problem.solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Problem44 {
	public static void main(String[] args)
	{
		long min = 99999999999999l;
		int numElements = 50000;
		long[] l = new long[numElements];
		HashMap<Long,Boolean> m = new HashMap<Long,Boolean>();
		for(int i = 1; i < numElements;i++)
		{
			l[i] = (i*(3*i-1)/2);
			m.put((long)i*(3*i-1)/2,true);
		}
		//System.out.println(l.toString());
		for(int i = 1; i < l.length; i++)
		{
			for(int h = 1; h < l.length; h++)
			{
				if(i==h || Math.abs(l[i]-l[h]) >= min)
					continue;
				if(m.containsKey(Math.abs(l[i]-l[h])) && m.containsKey(Math.abs(l[i]+l[h])) && m.get(Math.abs(l[i]-l[h])) && m.get(Math.abs(l[i]+l[h])))
						{
						min = Math.min(min, Math.abs(l[i]-l[h]));
						System.out.println(min);
						}
			}
		}
	}
}
