
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int num = (int)(Math.random() * 10 + 1);
		int countk=0;
		boolean isgirl= true;
		boolean isboy= true;
		int stop=0;
		String s="";
		while(stop==0)
		{

			if (num>5)
			{
				s+=" g ";
				isgirl=false;
				System.out.print("g ");
			}
			else 
			{
                s+=" b ";
                isboy=false;
                System.out.print("b ");
			}
			countk++;
			if (isboy==false && isgirl ==false)
			{
				System.out.println();
				System.out.println("You made it... and you now have "+ countk+ " children.");
				stop=1;
			}
			else num = (int)(Math.random() * 10 + 1);


		}
	}
}
