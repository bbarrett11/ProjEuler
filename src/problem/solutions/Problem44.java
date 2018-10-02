package problem.solutions;

import java.util.LinkedList;
import java.util.List;

public class Problem44 {
	public static void main(String[] args)
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		int numElements = 50000;
		for(int i = 1; i <= numElements;i++)
		{
			l.add(i*(3*i-1)/2);
		}
		//System.out.println(l.toString());
		for(int i = 0; i < l.size(); i++)
		{
			for(int h = 0; h < l.size(); h++)
			{
				if(i==h)
					continue;
				if(l.contains(Math.abs(l.get(i)-l.get(h))) && l.contains(Math.abs(l.get(i)+l.get(h))))
						{
					System.out.println(Math.abs(l.get(i)-l.get(h)));
						}
			}
		}
	}
}
