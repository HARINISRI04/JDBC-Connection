package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dem.Database;
import com.dem.Reg;

/**
 * Servlet implementation class view
 */
@WebServlet("/view")
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.print("<a href='form.html'>Home page</a>");
		pw.print("<h1>Display All Data</h1>");
		Database dbo=new Database();
		ArrayList<Reg> rlist=dbo.selectval();
		Iterator<Reg> itr=rlist.iterator();
		pw.print("<table border='1'>");
		pw.print("<tr> <th>Firstname</th> <th>Lastname</th> <th>Age</th> <th>Email</th> <th>Contactno</th> <th>PanNo</th> <th>Aadharno</th></tr>");
		while(itr.hasNext())
		{
			Reg r=itr.next();
			pw.print("<tr>");
			pw.print("<td>"+r.getFirstname()+"</td>");
			pw.print("<td>"+r.getLastname()+"</td>");
			pw.print("<td>"+r.getAge()+"</td>");
			pw.print("<td>"+r.getEmail()+"</td>");
			pw.print("<td>"+r.getContactNo()+"</td>");
			pw.print("<td>"+r.getPanNo()+"</td>");
			pw.print("<td>"+r.getAadharNo()+"</td>");
			pw.print("</tr>");
		}
		pw.print("</table>");
}
	}

