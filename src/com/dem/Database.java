package com.dem;

import java.sql.*;
import java.util.*;

public class Database {
	private java.sql.Connection Con;
	public Database()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/regform";
			String user="root";
			String pass="";
			this.Con=DriverManager.getConnection(url,user,pass);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public int insertval(Reg reg1)
	{
		int count=0;
		try
		{
			String q="insert into emp_details(Firstname,Lastname,Age,Email,ContactNo,PanNo,AadharNo)"
					+ "values(?,?,?,?,?,?,?)";
			PreparedStatement pst=this.Con.prepareStatement(q);
			pst.setString(1, reg1.getFirstname());
			pst.setString(2, reg1.getLastname());
			pst.setInt(3, reg1.getAge());
			pst.setString(4, reg1.getEmail());
			pst.setLong(5, reg1.getContactNo());
			pst.setLong(6, reg1.getPanNo());
			pst.setLong(7, reg1.getAadharNo());
			count = pst.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return count;
	}
	public ArrayList<Reg> selectval()
	{
		ArrayList<Reg> rlist=new ArrayList<Reg>();
		try
		{
			String q="select * from emp_details";
			PreparedStatement pst=this.Con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				String fname=rs.getString("Firstname");
				String lname=rs.getString("Lastname");
				Integer agee=rs.getInt("Age");
				String mai=rs.getString("Email");
				long cno=rs.getLong("ContactNo");
				long pno=rs.getLong("PanNo");
				long ano=rs.getLong("AadharNo");
				Reg obj=new Reg(fname,lname,agee,mai,cno,pno,ano);
				rlist.add(obj);				
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return rlist;
	}
}