/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		double t = Integer.parseInt(args[0]);
		int num = (int)(Math.random() * 10 + 1);
		int countk=0;
		double avarage=0; 
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
		    	avarage++; // total num of children
				if (num>5) // checks if its boy or girl
				{
					isgirl=false;
				}
				else 
				{
                	isboy=false;
             
				}
				countk++; // total num of children in this family 
				if (isboy==false && isgirl ==false) // checks if there re at lest one bot and girl
				{
					if (countk==2) 
					{
						twok++; // adding to the total of two kids in a family
					}
					else if (countk==3)
					{
						threek++; // adding to the total of 3 kids in a family
					}
					else if (countk>3)
					{
					   	morek++; // adding to the total of 4 or more kids in a family
					}
					stop=1; // finish this fanmily 
				}
				else num = (int)(Math.random() * 10 + 1); // if there are not at least one boy and girl it gives a new random 
		    }
		    isboy=true;
		    isgirl=true;
		    countk=0; // reset to count number of kids in a new family 
		    stop=0; // while to continue 
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
