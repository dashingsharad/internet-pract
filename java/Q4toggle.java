import java.util.Scanner;                                                                     
                                                                     
                                                                     
                                             
import java.util.*;

public class Q4toggle
{
	public static void main(String [] args)
	{
		int num,pos,result,i=0,newpos=0;
		double newnum=0,newbit=0,newresult=0;
		System.out.println("Program to toggle the nth bit of a binary number");
		System.out.println("Please enter the binary number");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		System.out.println("Please enter the bit to be toggled (position from the right)");
		pos=in.nextInt();
		newpos=(int) Math.pow(10,pos-1);
		while(num!=0)
		{
			int temp;
			temp=num%10;
			newnum=newnum + temp*Math.pow(2,i);
			num=num/10;
			i++;
		}
		i=0;
		while(newpos!=0)
		{
			int temp;
			temp=newpos%10;
			newbit=newbit + temp*Math.pow(2,i);
			newpos=newpos/10;
			i++;
		}
		result=(int)newnum^(int)newbit;
		i=0;
		while(result!=0)
		{
			int temp;
			temp=result%2;
			if(temp==1)
				newresult=newresult+temp*Math.pow(10,i);
			result=result/2;
			i++;
		}
		System.out.println((int)newresult);
	}
}
			
			
