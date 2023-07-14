package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet  extends  HttpServlet
{
  
	
	private static final long serialVersionUID = 1L;

	  public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	  {
		try 
		 {
			 String first_name=req.getParameter("first_name"); 
			 String last_name=req.getParameter("last_name");
			 String emailId=req.getParameter("emailId");
			 String pass_word=req.getParameter("pass_word");
			 
			 res.setContentType("text/html");
			  PrintWriter   out=res.getWriter();
			  
			  out.print("<html>");
			  out.print("<body>");
			  out.print("<h1>Student Resistration Form Data</h1>");
			  out.print("<p> first_name :: " + first_name + "</p>");
			  out.print("<p> last_name :: " + last_name +"</p>");
			  out.print("<p> emailId ::"+ emailId +"</p>");
			  out.print("<p>pass_word ::"+ pass_word +"</p>)");
			  out.print("</body>");
			  out.print("</html>");
			  out.close();
			  
			  System.out.println("first_name ::"+first_name);
			  System.out.println("last_name ::"+last_name);
			  System.out.println("emailId ::"+emailId);
			  System.out.println("pass_word ::"+pass_word);
			  }
			  catch(Exception e)
			  {
				  System.out.print("hi i am here");
			  }
			 
		  
		}

}
