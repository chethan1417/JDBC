package com.xworkz.clothes.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClothesReaderRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/customer";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query1="SELECT customer_Name FROM customer_data WHERE customer_Email = 'chethan@gmail.com' AND customer_mobileNo = 8548878989";
		String query2="SELECT customer_Address FROM customer_data WHERE customer_Name = 'Amit' AND customer_mobileNo = 9123045698";
		String query3="SELECT customer_Email FROM customer_data where customer_id=4 AND customer_mobileNo=8765432109";
		String query4="SELECT customer_Email ,nameOfClothes FROM customer_data where customer_mobileNo = 9112233446 AND customer_Name = 'Arjun'";
		String query5="SELECT customer_Name FROM customer_data WHERE customer_id>10";
		
		Connection connection= null;
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement1 =connection.createStatement();
			ResultSet resultSet1= statement1.executeQuery(query1);
			
			while(resultSet1.next()) {
				System.out.println(resultSet1.getString("customer_Name"));	
			}
			
			Statement statement2=connection.createStatement();
			ResultSet resultSet2=statement2.executeQuery(query2);
			while(resultSet2.next()) {
				System.out.println(resultSet2.getString("customer_Address"));
			}
			
			Statement statement3=connection.createStatement();
			ResultSet resultSet3=statement3.executeQuery(query3);
			while(resultSet3.next()) {
				System.out.println(resultSet3.getString("customer_Email"));
			}
			
			Statement statement4=connection.createStatement();
			ResultSet resultSet4=statement4.executeQuery(query4);
			while(resultSet4.next()) {
				System.out.println(resultSet4.getString("customer_Email"));
				System.out.println(resultSet4.getString("nameOfClothes"));
					
			}
			
			Statement statement5=connection.createStatement();
			ResultSet resultSet5=statement5.executeQuery(query5);
			while(resultSet5.next()) {
				System.out.println(resultSet5.getString("customer_Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
