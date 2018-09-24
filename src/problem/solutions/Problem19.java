package problem.solutions;

public class Problem19 {

	public static void main(String[] args) {
		int year = 1901;
		int weekDay = 2;
		int count = 0;
		while(year <2001)
		{	for(int i = 1; i < 367;i++)
			{
				if(i==1
				||	i==32 
				|| (i==92)
				|| (i==122)
				|| (i==153)
				|| (i==183)
				|| (i==214)
				|| (i==245)
				|| (i==275)
				|| (i==306)
				|| (i==336))
				{
					System.out.println(weekDay);
					if(weekDay ==0)
						count++;
				}
				else if(i==60 && (year%4!=0 || (year%100 == 0 && year%400 !=0)) )
				{
					if(weekDay ==0)
						count++;
					System.out.println("not leap"+weekDay);
					i++;
				}
				else if(i==61 && (year%4==0 && (year%100 != 0 || year%400 ==0)))
				{
					System.out.println(weekDay);
					if(weekDay ==0)
						count++;
				}
				weekDay+=1;
				weekDay%=7;
			}
		year++;
		}
	System.out.println(count);
	}

}
