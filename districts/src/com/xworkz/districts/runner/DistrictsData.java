package com.xworkz.districts.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DistrictsData {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/districts";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery="insert into districts_data values (1, 'Belagavi', 'Karnataka'), (2, 'Pune', 'Maharashtra'), (3, 'Ahmedabad', 'Gujarat'), (4, 'Jaipur', 'Rajasthan'), (5, 'Chennai', 'Tamil Nadu'), (6, 'Kochi', 'Kerala'), (7, 'Amritsar', 'Punjab'), (8, 'Lucknow', 'Uttar Pradesh'), (9, 'Patna', 'Bihar'), (10, 'Kolkata', 'West Bengal'), (11, 'Bhubaneswar', 'Odisha'), (12, 'Hyderabad', 'Telangana'), (13, 'Gurgaon', 'Haryana'), (14, 'Visakhapatnam', 'Andhra Pradesh'), (15, 'Surat', 'Gujarat'), (16, 'Guwahati', 'Assam'), (17, 'Indore', 'Madhya Pradesh'), (18, 'Raipur', 'Chhattisgarh'), (19, 'Ranchi', 'Jharkhand'), (20, 'New Delhi', 'Delhi')";
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
				System.out.println("not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
