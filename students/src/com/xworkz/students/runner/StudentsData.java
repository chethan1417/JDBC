package com.xworkz.students.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsData {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/students";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery="insert into data values(1,'chethan','chitradurga'),(2,'sudhu','davangere'),(3,'kumar','bagalkot'),(4,'karthik','hubli'),(5,'likhi','bengaluru'),(6,'sachin','harihar'),(7,'alok','sira'),(8,'anoop','gadag'),(9,'sarthak','hiriyur'),(10,'vaiju','dharwad'),(11,'chandan','manglore'),(12,'gani','bidar'),(13,'yashu','hassan'),(14,'kiran','shivmogga'),(15,'nattu','mysore'),(16,'rajath','udupi'),(17,'bhuvan','mandya'),(18,'harsha','hospet'),(19,'yashwanth','maddur'),(20,'goutham','bellary')";
				
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate(insertQuery);
			if(value>0)
			{
				System.out.println("this is saved");
			}
			else
			{
				System.out.println("this is not saved");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
