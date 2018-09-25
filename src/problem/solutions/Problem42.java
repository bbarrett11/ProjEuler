package problem.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Problem42 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader read = new BufferedReader(new FileReader(new File("p042_words.txt")));
		String words = read.readLine();
		int total = 0;
		System.out.println(Arrays.toString(words.split(",")).length());
		for(String s: words.split(","))
		{
			s = s.replaceAll("\"", "");
			int i = 0;
			for(char c : s.toCharArray())
			{
				i+=(c-64);
			}
			for(int counter = 0; i >0; counter++)
				i-=counter;
			if(i==0)
				total++;
		}
		System.out.println(total);
	}
}
