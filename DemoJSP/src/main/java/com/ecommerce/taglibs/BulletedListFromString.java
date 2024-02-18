package com.ecommerce.taglibs;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class BulletedListFromString extends SimpleTagSupport{

	private String items;
	
	public void setItems(String items) {
		this.items = items;
	}
	
	public void doTag() throws JspException, IOException {
		 String[] itemList = items.split(",");
		 getJspContext().getOut().write("<ul");
		 
		 for(String item: itemList) {
			 getJspContext().getOut().write("<li>"+item.trim()+"</li>");
			 
		 }
		 
		 getJspContext().getOut().write("</ul");
	}
}
