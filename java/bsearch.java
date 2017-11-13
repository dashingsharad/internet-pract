import java.util.Scanner;
class array
{
	int a[],size;
	public array(int s)
	{
		size=s;
		a=new int[size];
	}
	public void input()
	{
		Scanner S=new Scanner(System.in);
		System.out.print("Enter the sorted array \n");
		for(int i=0;i<size;i++)
			a[i]=S.nextInt();
	}
	public void display()
	{
		System.out.print("the array is \n");
		for(int i=0;i<size;i++)
			System.out.print(a[i]+"\n");
	}
	public void BinarySearch(int el)
	{
		int beg=0,end=size-1,mid,pos=-1;
		while(beg<end)
		{
			mid=(beg+end)/2;
			if(a[mid]==el)
			{
				pos=mid;
				break;
			}
			else if(el>a[mid])
				beg=mid+1;
			else
				end=mid-1;
		}
		if(pos!=-1)
			System.out.print("Position of "+el+" is "+(pos+1)+"\n");	
		else
			System.out.print("NOT FOUND");	
	}	
}
public class bsearch
{
	public static void main(String args[])
	{
		int s,op,flag=0,el,ch=1,f=0;
		Scanner S1=new Scanner(System.in);	
		System.out.print("Enter the size of array \n");
		s=S1.nextInt();
		array A=new array(s);
		while(ch==1)
		{

			System.out.flush();
			System.out.print("         MENU              \n");
			System.out.print("1.      INPUT ARRAY        \n");
			System.out.print("2.     DISPLAY ARRAY       \n");
			System.out.print("3.     BINARY SEARCH       \n");
			System.out.print("4.      EXIT               \n");
			System.out.print("    ENTER UR CHOICE  	     \n");
			op=S1.nextInt();
			switch(op)
			{
				case 1:	A.input();
					flag=1;
					break;
				case 2:	if(flag==1)
						A.display();
					else
						System.out.print("PLZ EXECUTE 1ST OPTION");
					break;
				case 3:	if(flag==1)
					{
						System.out.print("Enter the element to be searched\n");
						el=S1.nextInt();
						A.BinarySearch(el);
					}
					else
						System.out.print("PLZ EXECUTE 1st OPTION");
					break;
				case 4:	f=1;
					break;
					
			}
			if(f==1)
				break;
					
		}
	}
}