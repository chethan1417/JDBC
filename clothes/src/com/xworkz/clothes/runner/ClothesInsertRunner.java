package com.xworkz.clothes.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClothesInsertRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/customer";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query = "INSERT INTO customer_data (customer_id, customer_Name, customer_Address, customer_Email, customer_mobileNo, total_Bill, discount, date, time, nameOfClothes, quantity) VALUES "
                + "(1, 'chethan', 'Bengaluru', 'chethan@gmail.com', 8548878989, 3200, 5, NOW(), NOW(), 'Shirt', 1), "
                + "(2, 'Vikas', 'Hyderabad', 'vikas@gmail.com', 9123456789, 4500, 3, NOW(), NOW(), 'Jeans', 2), "
                + "(3, 'Shreya', 'Pune', 'shreya@gmail.com', 9876012345, 2500, 2, NOW(), NOW(), 'Dress', 1), "
                + "(4, 'Manoj', 'Chennai', 'manoj@gmail.com', 8765432109, 1300, 1, NOW(), NOW(), 'T-Shirt', 2), "
                + "(5, 'Rajesh', 'Coimbatore', 'rajesh@gmail.com', 9123674521, 900, 1, NOW(), NOW(), 'Cap', 1), "
                + "(6, 'Sunita', 'Mumbai', 'sunita@gmail.com', 9876548901, 1100, 1, NOW(), NOW(), 'Shirt', 1), "
                + "(7, 'Amit', 'Delhi', 'amit@gmail.com', 9123045698, 1200, 1, NOW(), NOW(), 'Jacket', 1), "
                + "(8, 'Sneha', 'Mysuru', 'sneha@gmail.com', 9988776655, 1600, 1, NOW(), NOW(), 'Sweater', 1), "
                + "(9, 'Lakshmi', 'Kochi', 'lakshmi@gmail.com', 9112233445, 1300, 2, NOW(), NOW(), 'Blouse', 3), "
                + "(10, 'Ajit', 'Jaipur', 'ajit@gmail.com', 9876123456, 1600, 2, NOW(), NOW(), 'Kurta', 2), "
                + "(11, 'Parth', 'Nagpur', 'parth@gmail.com', 9012345678, 1100, 1, NOW(), NOW(), 'Hat', 2), "
                + "(12, 'Disha', 'Surat', 'disha@gmail.com', 9987612345, 600, 1, NOW(), NOW(), 'Vest', 1), "
                + "(13, 'Karan', 'Bhopal', 'karan@gmail.com', 9765432109, 900, 1, NOW(), NOW(), 'Hoodie', 1), "
                + "(14, 'Ravi', 'Ahmedabad', 'ravi@gmail.com', 9887765544, 400, 1, NOW(), NOW(), 'Innerwear', 1), "
                + "(15, 'Suresh', 'Lucknow', 'suresh@gmail.com', 9123456788, 2200, 2, NOW(), NOW(), 'Formal Shirt', 2), "
                + "(16, 'Tina', 'Bhubaneswar', 'tina@gmail.com', 9012341234, 2500, 3, NOW(), NOW(), 'Saree', 2), "
                + "(17, 'Arjun', 'Indore', 'arjun@gmail.com', 9112233446, 1400, 1, NOW(), NOW(), 'Track Pants', 2), "
                + "(18, 'Meena', 'Patna', 'meena@gmail.com', 9987612344, 1300, 1, NOW(), NOW(), 'Raincoat', 2), "
                + "(19, 'Dev', 'Ranchi', 'dev@gmail.com', 9876012344, 1800, 2, NOW(), NOW(), 'Oversize T-shirt', 2), "
                + "(20, 'Nisha', 'Guwahati', 'nisha@gmail.com', 9123456787, 2300, 1, NOW(), NOW(), 'Salwar Kameez', 2)";

		
		
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
