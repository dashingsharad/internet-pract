package c3;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class Hellotag extends SimpleTagSupport
{
	private String sign;
	public void setSign(String n)
	{
		sign=n;
	}
	public void doTag() throws JspException,IOException
	{
		JspWriter out=getJspContext().getOut();
		out.println("Hello" + sign);
	}
}