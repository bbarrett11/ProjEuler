package problem.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Student\\Desktop\\p022_names.txt");
		FileReader input = new FileReader(file);
		Scanner scan = new Scanner(input);
		BufferedReader buff = new BufferedReader(input);
		ArrayList<String> Alist = new ArrayList<String>();
		String s = "";
		while(scan.hasNext())
		{
			s+=scan.next();
		}
		String[] Slist = s.split(",");
		for(int i= 0; i < Slist.length; i++)
		{
			Slist[i] = Slist[i].replaceAll("\"", "");
		}
		Arrays.sort(Slist);
		long totalcount = 0;
		long counter = 1;
		for(String tempS : Slist)
		{
			long count = 0;
			for(char c : tempS.toCharArray())
			{
				count += (c-64);
			}
			totalcount+=count*counter;
			counter++;
			if(tempS.equals("COLIN"))
			System.out.println(count*(counter-1));
		}
		System.out.println(Arrays.toString(Slist));
		System.out.println(totalcount);

	}

}
