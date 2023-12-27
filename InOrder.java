/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
        int num1;
		int num2 = 0;
		int stop=0;
		while (stop==0)
		{
		    num1 = (int)((Math.random() * 10));
		    if (num1>num2)
		    	System.out.println(num1);
		    else stop=1;
		    num2=num1;
            

	    }
		
	}
}
