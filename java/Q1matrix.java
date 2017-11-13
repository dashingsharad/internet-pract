/* Define a class Matrix class and do the following operations-:

1.  ADD
2.  SUBTRACT
3.  MULTIPLICATION
4.  DIVISION
5.  TO STRING */


import java.util.Scanner;


//*************************** MATRIX CLASS ****************************
class Matrix
{
	private int a[][],rows,cols;
	
//###################### DEFAULT CONSTRUCTOR MATRIX ###################
	public Matrix()
	{
		rows=0;
		cols=0;
	}


//###################### CONSTRUCTOR MATRIX ###################
	public Matrix(int r,int c)
	{
		rows=r;
		cols=c;
		a=new int [rows][cols];
	}

//###################### FUNCTION TO STRING ###################
	public String toString()
	{
		String S=new String();
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				S=S+a[i][j]+" ";
		return S;
	}


//########################## FUNCTION INPUT ###################
	public void input()
	{
		Scanner S=new Scanner(System.in);
		System.out.print("Enter the Rows");
		rows=S.nextInt();
		System.out.print("Enter the Coloumns");
		cols=S.nextInt();
		System.out.print("Enter the matrix");
		a=new int [rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				a[i][j]=S.nextInt();
				System.out.print(" ");
			}
			System.out.print("\n");
		}	
	}

//############################### FUNCTION DISPLAY ###################
	public void display()
	{
		String S=new String();
		S=toString();
		System.out.print(S+"\n\n");

	}


//############################### FUNCTION ADD ###################
	public void add(Matrix M1,Matrix M2)
	{
		Matrix M=new Matrix(M1.rows,M2.cols);
		if((M1.rows==M2.rows) && (M1.cols==M2.cols))
		{
			for(int i=0;i<M1.rows;i++)
				for(int j=0;j<M1.cols;j++)
					M.a[i][j]=M1.a[i][j]+M2.a[i][j];
		}
		else
			System.out.print("Matrices are incompatible to add, plz enter valid rows and cols");
		System.out.print("\n\n\nSUM MATRIX IS\n\n\n");
		M.display();
	}


//############################### FUNCTION SUB ###################
	public void sub(Matrix M1,Matrix M2)
	{
		Matrix M=new Matrix(M1.rows,M2.cols);
		if((M1.rows==M2.rows) && (M1.cols==M2.cols))
		{
			for(int i=0;i<rows;i++)
				for(int j=0;j<cols;j++)
					M.a[i][j]=M1.a[i][j]-M2.a[i][j];
		}
		else
			System.out.print("Matrices are incompatible to add, plz enter valid rows and cols");
		System.out.print("\n\n\nDIFFERENCE MATRIX IS\n\n\n");
		M.display();
	}

//############################### FUNCTION TRANSPOSE ###################
	public void transpose(Matrix M1)
	{
		Matrix M=new Matrix(M1.cols,M1.rows);
		for(int i=0;i<M1.cols;i++)
			for(int j=0;j<M1.rows;j++)
				M.a[i][j]=M1.a[j][i];
		System.out.print("\n\n\nTRANPOSE MATRX IS\n\n\n");
		M.display();
	}

//############################### FUNCTION MUTIPLY ###################
	public void multiply(Matrix M1,Matrix M2)
	{
		Matrix M=new Matrix(M1.rows,M2.cols);
		if(M1.cols==M2.rows)
		{
			for(int i=0;i<M1.rows;i++)
				for(int j=0;j<M2.cols;j++)
					for(int k=0;k<M1.cols;k++)
						M.a[i][j]+=M1.a[i][k]*M2.a[k][j];
		}
		else
			System.out.print("Matrices are incompatible to multiply, plz enter valid first matrix rows=2nd matrix cols");
		System.out.print("\n\n\nMULTIPLY MATRIX IS\n\n\n");
		M.display();
	}
}


//************************** CLASS TEST MATRIX ***********************

public class Q1matrix
{
	

//############################### MAIN FUNCTION #############################3
	public static void main(String args[])
	{
		int r,c,ch=1,fg1=0,fg2=0,op,f=0;
		Scanner S1=new Scanner(System.in);
		Matrix M1=new Matrix(),M2=new Matrix(),M3=new Matrix();
		while(ch==1)
		{

			System.out.flush();
			System.out.print("*************  MENU **************\n");
			System.out.print("1.      INPUT MATRIX        \n");
			System.out.print("2.     DISPLAY MATRIX       \n");
			System.out.print("3.     ADDITION             \n");
			System.out.print("4.     SUBTRACTION             \n");
			System.out.print("5.     MULTIPLICATION             \n");
			System.out.print("6.     TRANPOSE             \n");
			System.out.print("7.     EXIT             \n");
			System.out.print("    ENTER UR CHOICE  	      \n");
			op=S1.nextInt();
			switch(op)
			{
				case 1:	System.out.print("MATRIX 1\n\n");
					M1.input();
					fg1=1;
					System.out.print("\n\nMATRIX 2\n\n");
					M2.input();
					fg2=1;
					break;
				case 2:	if(fg1==1 && fg2==1)
					{
						System.out.print("MATRIX 1 \n\n\n");
						M1.display();
						System.out.print("\n\n\n");
						System.out.print("MATRIX 2 \n\n\n");
						M2.display();
					}
					else	
						System.out.print("PLZ EXECUTE 1ST OPTION");
					break;
				case 3:	if(fg1==1 && fg2==1)
						M3.add(M1,M2);
					else	
						System.out.print("2 MATRIX REQUIRED FOR THIS OPERATION,PLZ EXECUTE 1ST OPTION");
					break;
				case 4:	if(fg1==1 && fg2==1)
						M3.sub(M1,M2);
					else	
						System.out.print("2 MATRIX REQUIRED FOR THIS OPERATION,PLZ EXECUTE 1ST OPTION");
					break;
				case 5:	if(fg1==1 && fg2==1)
						M3.multiply(M1,M2);
					else	
						System.out.print("2 MATRIX REQUIRED FOR THIS OPERATION,PLZ EXECUTE 1ST OPTION");
					break;
				case 6:	if(fg1==1 || fg2==1)
						M3.transpose(M1);
					else	
						System.out.print("PLZ EXECUTE 1ST OPTION");
					break;	
				case 7:	f=1;
					break;			
			}			
			if(f==1)
				break;
		}
	}
}