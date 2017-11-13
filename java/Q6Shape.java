import java.util.Scanner;


//******************* CLASS SHAPE ************************
class Shape
{
	int x1,y1,x2,y2;
	
//###################### GETCOORD FUNCTION ######################
	public void getcoord()
	{
		Scanner S=new Scanner(System.in);
		System.out.print("Enter the Coordinates of the Rectangle \n\n");
		System.out.print("Enter the X1 coordinate \n");
		x1=S.nextInt();
		System.out.print("Enter the Y1 coordinate \n");
		y1=S.nextInt();
		System.out.print("Enter the X2 coordinate \n");
		x2=S.nextInt();
		System.out.print("Enter the Y2 coordinate \n");
		y2=S.nextInt();
	}


//###################### SHOWCOORD FUNCTION ######################
	public void showcoord()
	{
		System.out.println("Coordinates are \n\n");
		System.out.println("(x1,y1) = "+x1+" , "+y1+"\n");
		System.out.println("(x2,y1) = "+x2+" , "+y1+"\n");
		System.out.println("(x2,y2) = "+x2+" , "+y2+"\n");
		System.out.println("(x1,y2) = "+x1+" , "+y2+"\n");
	}
}


//******************* CLASS RECT ************************
class Rect extends Shape
{
	private int l,b;
	
//###################### GETCOORD FUNCTION ######################
	public void getcoord()
	{
		super.getcoord();
	}


//###################### SHOWCOORD FUNCTION ######################
	public void showcoord()
	{
		l=x2-x1;
		b=y2-y1;
		System.out.println("Length is = "+l+"\n Breadth is "+b);
	}
}


//******************* CLASS Q6SHAPE (MAIN FUNCTION CLASS) ************************
public class Q6Shape
{

	
//###################### MAIN FUNCTION ######################
	public static void main(String args[])
	{
		Shape S;
		Rect R=new Rect();
		R.getcoord();		// Call to an overridden Function resoloves at run time
		S=R;			// assigning subclass variable to superclass refernce variable
		S.showcoord();		// using a overriden function of subclass through superclass object
	}
}