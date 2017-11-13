package c3;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.Date;

public class datetag extends SimpleTagSupport 
{
	public void doTag() throws JspException, IOException
 	{
		JspWriter out = getJspContext().getOut();
		Date n_date=new Date();
		out.println(n_date);
    	}
}
