package Advance;

import java.awt.AWTException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class closefinally
{
	public static void main(String[] args) throws SQLException
	{
		Connection con =  null;
		Driver driverref = new Driver();
		try
		{
		//Step 1: Register to the Database
		DriverManager.registerDriver(driverref);
		
		//Step 2: Get Connection to database
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Geetha", "root", "root");
		
		//Step 3: Issue create Statement
		Statement stat=con.createStatement();
		
		//Step4: Execute query
		int result =stat.executeUpdate("insert into table1 values(1234, 'abc')");
		
		if(result==1)
		{
			System.out.println("query executed");
		}
		else
		{
			System.out.println("query failed");
		}
		}
		catch(Exception e) {
			
		}
		finally
		{
			con.close();
			System.out.println("Connection is closed");
		}
	}

}
