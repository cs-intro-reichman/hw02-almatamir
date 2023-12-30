/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		int num = (int)(Math.random() * 10 + 1);
		int countk=0;
		int avarage=0; 
		boolean isgirl= true;
		boolean isboy= true;
		int stop=0;
		int twok=0;
		int threek=0;
		int morek=0;
		for (int i=0; i<t; i++)
		{
		while(stop==0)
		{
			if (num>5)
			{
				isgirl=false;
			}
			else 
			{
            
                isboy=false;
             
			}
			countk++;
			avarage++;
			if (isboy==false && isgirl ==false)
			{
				stop=1;
				if (countk==2)
				{
					twok++;
				}
				else if (countk==3)
				{
					threek++;
				}
				else morek++;
				countk=0;
			}
			else num = (int)(Math.random() * 10 + 1);
		}
	    }
	    double k= avarage/t;
	   
	    System.out.println("Average: "+k+" children to get at least one of each gender.");
	    System.out.println("Number of families with 2 children: "+ twok);
	    System.out.println("Number of families with 3 children: "+ threek);
	    System.out.println("Number of families with 4 or more children: "+ morek);
	    if (twok>threek && twok> morek)
	    {
          System.out.println("The most common number of children is 2.");
	    }
	    else if (threek> morek&& threek>morek)
	    {
	    	System.out.println("The most common number of children is 3.");
	    }
	    else System.out.println("The most common number of children is 4 or more.");


	}
}
