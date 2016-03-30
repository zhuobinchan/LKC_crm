package com.crm.tagclass;

import java.io.IOException;
import java.io.StringWriter;
import java.net.URLDecoder;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CharsetTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		JspFragment jf = this.getJspBody();
		StringWriter sw = new StringWriter();
		jf.invoke(sw);//先存到缓存中再来取
		
		String content = sw.toString();
		content = URLDecoder.decode(content, "utf-8");
		this.getJspContext().getOut().write(content);
	}

	
}
