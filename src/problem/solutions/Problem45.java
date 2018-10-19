package problem.solutions;

public class Problem45 {
	public static void main(String[] args)
	{
		long Tn=0,Pn=0,Hn=0;
		long Ti=0,Pi=0,Hi=0;
		while(true)
		{	Hn = Hi*(2*Hi-1);
			while(Pn < Hn)
			{
				Pn = Pi*(3*Pi-1)/2;
				Pi++;
			}
			while(Tn < Hn)
			{
				Tn = Ti*(Ti+1)/2;
				Ti++;
			}
			if(Hn==Pn && Hn == Tn)
				System.out.println(Hn);
			Hi++;
		}
	}
}
