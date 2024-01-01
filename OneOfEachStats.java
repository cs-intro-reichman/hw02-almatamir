import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int t = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		double num = generator.nextDouble();
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
				if (num>0.5) // checks if its boy or girl
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
				else num = generator.nextDouble(); // if there are not at least one boy and girl it gives a new random 
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

