package problem.solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem24 {
	public static ArrayList<String> s = new ArrayList<String>();
	public static void main(String[] args)
	{
		permutation("0123456789");
		long[] i = new long[s.size()];
		int count = 0;
		for(String a : s)
		{
			i[count++]=Long.valueOf(a);
		}
		Arrays.sort(i);
		System.out.println(i.length);
		System.out.println(i[999999]);
	}
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) s.add(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
