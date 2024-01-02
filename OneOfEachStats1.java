/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		double num = Integer(Math.random());
		int countk = 0;
		double sumkids = 0; 
		boolean isgirl = true;
		boolean isboy = true;
		int twok = 0;
		int threek = 0;
		int morek = 0;
		for (int i = 0; i < t; i++)
		{
			while(isboy == true || isgirl == true)
		    {
				if (num >= 0.5) // checks if its boy or girl
				{
					isgirl=false;
				}
				else 
				{
                	isboy=false;
             
				}
				countk++; // total num of children in this family
				if (isboy == false && isgirl ==false)
				{
				    if (countk == 2) 
					{
						twok++; // adding to the total of two kids in a family
					}
				    else if (countk == 3)
					{
						threek++; // adding to the total of 3 kids in a family
					}
				    else if (countk > 3)
					{
					   	morek++; // adding to the total of 4 or more kids in a family
					} 
					sumkids+=countk;
				}
			    num = Integer(Math.random()); // if there are not at least one boy and girl it gives a new random 
		    }
		    countk = 0; // reset to count number of kids in a new family 
	        isboy = true;
		    isgirl = true;
	    }
	    double avarage= sumkids/t;
	    System.out.println("Average: "+avarage+" children to get at least one of each gender.");
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
