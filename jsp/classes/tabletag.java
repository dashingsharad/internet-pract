package c3;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class tabletag extends SimpleTagSupport 
{
	public void doTag() throws JspException, IOException
 	{
		JspWriter out = getJspContext().getOut();
		for(int i=0;i<=10;i++)
			out.println(3*i + "<br>");
    	}
}
