package com.xworkz.bikez.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BikesInsertRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/vehicles";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "INSERT INTO bikes_data (bike_id, bike_model, bike_brand, owner_name, owner_contact, purchase_price, mileage, registration_date, insurance_status, color, fuel_type) VALUES "
				+ "(1, 'Shine', 'Honda', 'Rajesh', 9876543210, 75000, 55, '2022-01-15', 'Active', 'Black', 'Petrol'), "
				+ "(2, 'FZ', 'Yamaha', 'Amit', 9123456789, 85000, 45, '2021-06-10', 'Active', 'Blue', 'Petrol'), "
				+ "(3, 'Pulsar', 'Bajaj', 'Kavita', 9876012345, 90000, 50, '2020-04-20', 'Expired', 'Red', 'Petrol'), "
				+ "(4, 'Classic 350', 'Royal Enfield', 'Suman', 8765432109, 180000, 40, '2021-11-11', 'Active', 'Silver', 'Petrol'), "
				+ "(5, 'Activa', 'Honda', 'Rahul', 9123674521, 65000, 60, '2022-03-30', 'Active', 'White', 'Petrol'), "
				+ "(6, 'Splendor', 'Hero', 'Priya', 9876548901, 55000, 70, '2019-12-25', 'Expired', 'Black', 'Petrol'), "
				+ "(7, 'Apache', 'TVS', 'Ravi', 9123045698, 95000, 50, '2020-05-15', 'Active', 'Green', 'Petrol'), "
				+ "(8, 'Electric Bike', 'Ola', 'Sneha', 9988776655, 120000, 90, '2021-08-10', 'Active', 'Yellow', 'Electric'), "
				+ "(9, 'Duke 250', 'KTM', 'Lakshmi', 9112233445, 250000, 35, '2021-09-25', 'Expired', 'Orange', 'Petrol'), "
				+ "(10, 'Bullet', 'Royal Enfield', 'Ajay', 9876123456, 190000, 38, '2020-02-14', 'Active', 'Black', 'Petrol')";

		
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			int i = statement.executeUpdate(query);
			if (i > 0) {
				System.out.println("Data is saved");
			} else {
				System.err.println("Data is not saved");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
