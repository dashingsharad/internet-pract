package Arithmetic;

import java.util.Scanner;

class Rational
{
	int num,deno;
	public Rational()
	{
		num=0;
		deno=1;
	}
	public Rational(int n,int d)
	{
		num=n;
		deno=d;
	}
	private int gcd(int a,int b)
	{
		int g=0,min;
		if(a<b)
			min=a;
		else if(b>a)
			min=b;
		else
			min=a;
		for(int i=1;i<=min;i++)
			if(a%i==0 && b%i==0)
				g=i;
		return g;
	}
	public void add(Rational R1,Rational R2)
	{
		int g; 
		num=(R1.num*R2.deno)+(R2.num*R1.deno);
		deno=R1.deno*R2.deno;
		g=gcd(Math.abs(num),Math.abs(deno));
		num=num/g;
		deno=deno/g;
	}
	public void sub(Rational R1,Rational R2)
	{
		int g; 
		num=(R1.num*R2.deno)-(R2.num*R1.deno);
		deno=R1.deno*R2.deno;
		g=gcd(Math.abs(num),Math.abs(deno));
		num=num/g;
		deno=deno/g;
	}
	public void multiply(Rational R1,Rational R2)
	{
		int g; 
		num=(R1.num*R2.num);
		deno=R1.deno*R2.deno;
		g=gcd(Math.abs(num),Math.abs(deno));
		num=num/g;
		deno=deno/g;
	}
	public void divide(Rational R1,Rational R2)
	{
		int g; 
		num=(R1.num*R2.deno);
		deno=R1.deno*R2.num;
		g=gcd(Math.abs(num),Math.abs(deno));
		num=num/g;
		deno=deno/g;
	}
	public void display()
	{
		System.out.print("Rational no. is \n"+num+"/"+deno);
	}
}
public class Rationalmain
{
	public static void main(String args[])
	{
		int ch,flag=0,rs=1;
		Scanner S=new Scanner(System.in);
		int n,d;
		System.out.print("Enter the numerator of first Rational Number");
		n=S.nextInt();
		System.out.print("Enter the denominator of first Rational Number");
		d=S.nextInt();
		Rational R1=new Rational(n,d);
		System.out.print("Enter the numerator of 2nd Rational Number");
		n=S.nextInt();
		System.out.print("Enter the denominator of 2nd Rational Number");
		d=S.nextInt();
		Rational R2=new Rational(n,d);
		Rational R3=new Rational();
		while(rs==1)
		{
			System.out.print("\n\n 				MENU 					\n\n");
			System.out.print("		1. DISPLAY \n");
			System.out.print("		2. ADD \n");
			System.out.print("		3. SUB \n");
			System.out.print("		4. MULTIPLY \n");
			System.out.print("		5. DIVIDE \n");
			System.out.print("		6. EXIT \n");
			System.out.print("		ENTER UR CHOICE \n");
			ch=S.nextInt();
			switch(ch)
			{
				case 1:	R1.display();
					R2.display();
					break;
				case 2:	R3.add(R1,R2);
					System.out.print("SUM IS \n");
					R3.display();
					break;
				case 3:	R3.sub(R1,R2);
					System.out.print("DIFFERENCE IS \n");
					R3.display();
					break;
				case 4:	R3.multiply(R1,R2);
					System.out.print("PRODUCT IS IS \n");
					R3.display();
					break;
				case 5:	R3.divide(R1,R2);
					System.out.print("DIVISION IS \n");
					R3.display();
					break;
				case 6:	flag=1;
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