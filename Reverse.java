/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s= args[0]; 
		int n = s.length();
		String news= "";
		String savec= "";
		int count=0;
		for(int i=n-1;i>=0; i--)
		{
			count++;
			news+= s.charAt(i);	
        }
		System.out.println(news);
		System.out.println("The middle character is "+ news.charAt(count/2));




	}
}
