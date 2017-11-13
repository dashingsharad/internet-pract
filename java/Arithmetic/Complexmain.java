package Arithmetic;
import java.util.Scanner;
class Complex
{
	int real,img;
	public Complex()
	{
		real=0;
		img=0;
	}
	public Complex(int r,int i)
	{
		real=r;
		img=i;
	}
	public void add(Complex C1,Complex C2)
	{
		this.real=C1.real+C2.real;
		this.img=C1.img+C2.img;
	}
	public void sub(Complex C1,Complex C2)
	{
		this.real=C1.real-C2.real;
		this.img=C1.img-C2.img;
	}
	public void multiply(Complex C1,Complex C2)
	{
		this.real=(C1.real*C2.real)-(C1.img*C2.img);
		this.img=(C1.real*C2.img)+(C1.img+C2.real);
	}
	public void display()
	{
		System.out.print("Complex no. is -  "+real+"+"+img+"i");
	}
}
	
public class Complexmain
{

	public static void main(String args[])
	{
		
		int ch,flag=0,rs=1;
		Scanner S=new Scanner(System.in);
		int r,i;
		System.out.print("Enter the real part of first Complex Number");
		r=S.nextInt();
		System.out.print("Enter the imaginary part of first Complex Number");
		i=S.nextInt();
		Complex C1=new Complex(r,i);
		System.out.print("Enter the real part of 2nd Complex Number");
		r=S.nextInt();
		System.out.print("Enter the imaginary part of 2nd Complex Number");
		i=S.nextInt();
		Complex C2=new Complex(r,i);
		Complex C3=new Complex();
		while(rs==1)
		{
			System.out.print("\n\n 				MENU 					\n\n");
			System.out.print("		1. DISPLAY \n");
			System.out.print("		2. ADD \n");
			System.out.print("		3. SUB \n");
			System.out.print("		4. MULTIPLY \n");
			System.out.print("		5. EXIT \n");
			System.out.print("		ENTER UR CHOICE \n");
			ch=S.nextInt();
			switch(ch)
			{
				case 1:	C1.display();
					C2.display();
					break;
				case 2:	C3.add(C1,C2);
					System.out.print("SUM IS \n");
					C3.display();
					break;
				case 3:	C3.sub(C1,C2);
					System.out.print("DIFFERENCE IS \n");
					C3.display();
					break;
				case 4:	C3.multiply(C1,C2);
					System.out.print("PRODUCT IS \n");
					C3.display();
					break;
				case 5:	flag=1;
					break;	
			}
			if(flag==1)
			{
				flag=0;
				break;
			}
		}
	}
}