import java.io.*;
import java.util.Scanner;

//******************* CLASS COPY *******************
public class Q7copy 
{

//###################### MAIN FUNCTION ####################

	public static void main(String args[]) throws FileNotFoundException
	{
		try
		{	
			String S1=new String();	
			FileReader f=new FileReader(args[0]);
			PrintWriter pr=new PrintWriter(args[1]);
			Scanner S=new Scanner(f);
			while(S.hasNextLine())	
			{
				S1=S.nextLine();
				pr.println(S1);
			}
			System.out.print("\n\n\n FILE COPIED THANX FOSR USING THE PROGRAM\n\n\n ");
			pr.close();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("ARGUMENT MISSIN \n\n");
		}
	}
}

