package com.xworkz.bikez.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BikesReaderRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/vehicles";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query1 = "SELECT bike_model FROM bikes_data WHERE owner_contact = 9876543210 AND bike_brand = 'Honda'";
		String query2 = "SELECT purchase_price FROM bikes_data WHERE bike_id = 3 AND insurance_status = 'Active'";
		String query3 = "SELECT owner_name FROM bikes_data WHERE bike_model = 'Pulsar' AND color = 'Black'";
		String query4 = "SELECT bike_brand, fuel_type FROM bikes_data WHERE mileage > 40 AND fuel_type = 'Petrol'";
		String query5 = "SELECT bike_model FROM bikes_data WHERE purchase_price > 100000";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement1 = connection.createStatement();
			ResultSet resultSet1 = statement1.executeQuery(query1);
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("bike_model"));
			}
			System.out.println();

			Statement statement2 = connection.createStatement();
			ResultSet resultSet2 = statement2.executeQuery(query2);
			while (resultSet2.next()) {
				System.out.println("Purchase Price: " + resultSet2.getDouble("purchase_price"));
			}
			System.out.println();

			Statement statement3 = connection.createStatement();
			ResultSet resultSet3 = statement3.executeQuery(query3);
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("owner_name"));
			}
			System.out.println();
			
			Statement statement4 = connection.createStatement();
			ResultSet resultSet4 = statement4.executeQuery(query4);
			while (resultSet4.next()) {
				System.out.println("Bike Brand: " + resultSet4.getString("bike_brand"));
				System.out.println("Fuel Type: " + resultSet4.getString("fuel_type"));
			}
			System.out.println();

			Statement statement5 = connection.createStatement();
			ResultSet resultSet5 = statement5.executeQuery(query5);
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("bike_model"));
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
