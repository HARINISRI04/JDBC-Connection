package com.demo;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dem.Database;
import com.dem.Reg;
/**
 * Servlet implementation class details
 */
@WebServlet("/details")
public class details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String fnm=request.getParameter("fn");
		String lnm=request.getParameter("ln");
		Integer agee=Integer.parseInt(request.getParameter("age"));
		String mai=request.getParameter("id");
		long cnum=Long.parseLong(request.getParameter("num"));
		long pnum=Long.parseLong(request.getParameter("pan"));
		long anum=Long.parseLong(request.getParameter("aadhar"));
		//System.out.println(fnm+" "+mai);
		Reg regs=new Reg(fnm,lnm,agee,mai,cnum,pnum,anum);
		Database db=new Database();
		int n=db.insertval(regs);
		if(n==1)
		{
			//response.sendRedirect("view");
			pw.print("<p>saved</P>");
			pw.print("<a href='http://localhost:8080/Register/view'>View data</a>");
		}
		else
		{
			pw.print("<p>Not saved</P>");
		}
	}

}
