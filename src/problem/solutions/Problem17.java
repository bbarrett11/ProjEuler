package problem.solutions;

public class Problem17 {
	static int sum = 0;
	static String[] singles = new String[] {"one","two","three","four","five","six","seven","eight","nine",};
	static String[] teens = new String[] {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String[] tens = new String[] {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	static String[] hundred = new String[] {"hundred","onethousand"};

	public static void main(String[] args)
	{
		int count = 0;
		for(String s:singles)
		{
			sum+=s.length();
			System.out.println(s);
			//System.out.println(++count);
		}
		System.out.println("ten");
		//System.out.println(++count);

		for(String s : teens)
		{			
			sum+=s.length();
			System.out.println(s);
			//System.out.println(++count);

		}
		for(String s : tens)
		{
			System.out.println(s);			//System.out.println(++count);
			sum+=s.length();

			for(String p:singles)
			{
				sum+=s.length()+p.length();
				System.out.println(s+" "+p);
				//System.out.println(++count);

			}
		}
		for(String s : singles)
		{
			sum+=s.length()+7;
			System.out.println(s+"hundred");			//System.out.println(++count);


			for(String p:singles)
			{
				sum+=s.length()+p.length()+10;
				System.out.println(s+"hundredand"+p);			//System.out.println(++count);

			}
			sum+=s.length()+13;
			System.out.println(s+"hundredandten");			//System.out.println(++count);

			for(String p : teens)
			{			
				sum+=s.length()+p.length()+10;
				System.out.println(s+"hundredand"+p);			//System.out.println(++count);


			}

			
			for(String p : tens)
			{
				sum+=10+s.length()+p.length();
				System.out.println(s+"hundredand"+p);			//System.out.println(++count);


				for(String d:singles)
				{
					sum+=s.length()+p.length()+d.length()+10;
					System.out.println(s+"hundredand"+p+""+d);			//System.out.println(++count);


				}
			}
		}
		
		System.out.println(sum+"onethousand".length()+"ten".length());			//System.out.println(++count);

	}
	

}
