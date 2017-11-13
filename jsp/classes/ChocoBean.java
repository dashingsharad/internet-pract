package c3;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class ChocoBean extends SimpleTagSupport
{
	private String texture;
	public void setTexture(String t)
	{
		texture=t;
	}
	public void doTag() throws JspException,IOException
	{
		JspWriter out=getJspContext().getOut();
		if(texture.equals("Chewy"))
			out.println("FiveStar,BarOne");
		else if(texture.equals("Crunchy"))
			out.println("Munch,KitKat");
		else
			out.println("INVALID USER");


	}
}