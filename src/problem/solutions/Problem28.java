package problem.solutions;

public class Problem28 {

	public static void main(String[] args) {
		double total = 1;
		double addend=1;
		for(int i = 0; i < 500; i++)
		{
			for(int h = 0; h < 4; h++)
			{
				addend+=(i+1)*2;
				total+=addend;
			}
		}
		System.out.println(total);

	}

}
