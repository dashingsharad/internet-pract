package c3;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class Table extends SimpleTagSupport
{
	private String tab;
	public void setTab(String t)
	{
		tab=t;
	}
	public void doTag() throws JspException,IOException
	{
		JspWriter W=getJspContext().getOut();
		int t=Integer.parseInt(tab);
		for(int i=1;i<=10;i++)
		{
			W.println(t*i + "<br>");
		}
		
	}	

}