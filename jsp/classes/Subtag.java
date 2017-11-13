package c3;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class Subtag extends SimpleTagSupport
{
	private String input,start,end;
	public void setInput(String i)
	{
		input=i;
	}
	public void setStart(String s)
	{
		start=s;
	}
	public void setEnd(String e)
	{
		end=e;
	}
	public void doTag() throws JspException,IOException
	{
		JspWriter out=getJspContext().getOut();
		if(input!="null")
		{
			int s=Integer.parseInt(start);
			int e=Integer.parseInt(end);
			if(s<0 || e<0)
				out.println("INDICES CAN'T BE NEGATIVE");
			else if(s>e)
				out.println("Start index can't be > end index");
			else if(e>input.length())
				out.println("ERROR!!!  End index can't be greater than string lenth");
			else
			{
				String sub=input.substring(s,e+1);
				out.println("THE SUBSTRING IS  " +sub);
			}
		}
		else
			out.println("PLZ PROVIDE AN INPUT");
	}
}