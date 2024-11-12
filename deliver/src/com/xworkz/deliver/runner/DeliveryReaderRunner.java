package com.xworkz.deliver.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeliveryReaderRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/delivery";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query1 = "SELECT payment_method FROM order_data WHERE order_id = 1 AND customer_id = 1";
		String query2 = "SELECT delivery_time_slot FROM order_data WHERE customer_id = 2 AND order_amount > 4000";
		String query3 = "SELECT courier_service FROM order_data WHERE order_id = 3 AND payment_status = 'Unpaid'";
		String query4 = "SELECT order_amount, tax FROM order_data WHERE customer_id = 5 AND payment_status = 'Paid'";
		String query5 = "SELECT payment_status FROM order_data WHERE order_amount > 2000";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement1 = connection.createStatement();
			ResultSet resultSet1 = statement1.executeQuery(query1);
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("payment_method"));
			}
			System.out.println();

			Statement statement2 = connection.createStatement();
			ResultSet resultSet2 = statement2.executeQuery(query2);
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("delivery_time_slot"));
			}
			System.out.println();

			Statement statement3 = connection.createStatement();
			ResultSet resultSet3 = statement3.executeQuery(query3);
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("courier_service"));
			}
			System.out.println();

			Statement statement4 = connection.createStatement();
			ResultSet resultSet4 = statement4.executeQuery(query4);
			while (resultSet4.next()) {
				System.out.println("Order Amount: " + resultSet4.getString("order_amount"));
				System.out.println("Tax: " + resultSet4.getString("tax"));
			}
			System.out.println();

			Statement statement5 = connection.createStatement();
			ResultSet resultSet5 = statement5.executeQuery(query5);
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("payment_status"));
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
