package problem.solutions;

public class Problem31 {

	public static void main(String[] args) {
		int[] coins = new int[] {200,100,50,20,10,5,2,1}; 
		int c = 0;
		for(int i = 0; i<=7; i++)
		{
			for(int j =0; j < 7; j++)
			{
				for(int k = 0; k<17;k++)
				{
					for(int x =0; x<27;x++)
					{
						for(int y = 0; y<47; y++)
						{
							for(int z = 0; z < 107; z++)
								if(i*100+j*50+k*20+x*10+y*5+z*2 <= 200)
									c++;
						}
					}
				}
			}
		}
		System.out.println(1+c);

	}

}
