package com.xworkz.deliver.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeliveryInsertRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/delivery";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query = "INSERT INTO order_data (order_id, customer_id, order_amount, tax, shipping_fee, payment_status, delivery_status, delivery_date, payment_method, courier_service, delivery_time_slot) VALUES "
                + "(1, 1, 3400, 200, 50, 'Paid', 'Delivered', '2023-10-12', 'Credit Card', 'BlueDart', '9 AM - 12 PM'), "
                + "(2, 2, 4800, 300, 75, 'Paid', 'Pending', '2023-11-01', 'UPI', 'DTDC', '2 PM - 5 PM'), "
                + "(3, 3, 2700, 150, 60, 'Unpaid', 'In Transit', '2023-11-05', 'Cash', 'FedEx', '12 PM - 3 PM'), "
                + "(4, 4, 1400, 100, 50, 'Paid', 'Delivered', '2023-10-28', 'Debit Card', 'BlueDart', '5 PM - 8 PM'), "
                + "(5, 5, 950, 50, 20, 'Paid', 'Delivered', '2023-10-22', 'UPI', 'DTDC', '9 AM - 12 PM'), "
                + "(6, 6, 1150, 70, 30, 'Unpaid', 'Pending', '2023-11-15', 'Cash', 'Ecom Express', '3 PM - 6 PM'), "
                + "(7, 7, 1250, 80, 40, 'Paid', 'Delivered', '2023-10-30', 'Credit Card', 'BlueDart', '11 AM - 2 PM'), "
                + "(8, 8, 1700, 100, 45, 'Paid', 'In Transit', '2023-11-07', 'Debit Card', 'DTDC', '9 AM - 12 PM'), "
                + "(9, 9, 1500, 90, 35, 'Paid', 'Pending', '2023-11-10', 'Credit Card', 'FedEx', '1 PM - 4 PM'), "
                + "(10, 10, 1800, 110, 50, 'Paid', 'Delivered', '2023-11-01', 'UPI', 'BlueDart', '2 PM - 5 PM'), "
                + "(11, 11, 1150, 70, 30, 'Unpaid', 'In Transit', '2023-11-06', 'Cash', 'DTDC', '4 PM - 7 PM'), "
                + "(12, 12, 650, 30, 15, 'Paid', 'Delivered', '2023-10-26', 'Credit Card', 'Ecom Express', '10 AM - 1 PM'), "
                + "(13, 13, 970, 60, 25, 'Paid', 'Delivered', '2023-11-02', 'Debit Card', 'BlueDart', '5 PM - 8 PM'), "
                + "(14, 14, 450, 25, 10, 'Paid', 'Pending', '2023-11-09', 'UPI', 'FedEx', '3 PM - 6 PM'), "
                + "(15, 15, 2350, 120, 50, 'Unpaid', 'Pending', '2023-11-13', 'Cash', 'BlueDart', '9 AM - 12 PM'), "
                + "(16, 16, 2800, 150, 60, 'Paid', 'Delivered', '2023-11-03', 'Credit Card', 'DTDC', '1 PM - 4 PM'), "
                + "(17, 17, 1600, 100, 45, 'Paid', 'In Transit', '2023-11-08', 'Debit Card', 'FedEx', '11 AM - 2 PM'), "
                + "(18, 18, 1350, 80, 40, 'Unpaid', 'Pending', '2023-11-15', 'UPI', 'BlueDart', '4 PM - 7 PM'), "
                + "(19, 19, 1950, 110, 50, 'Paid', 'Delivered', '2023-11-05', 'Cash', 'Ecom Express', '9 AM - 12 PM'), "
                + "(20, 20, 2500, 140, 65, 'Unpaid', 'In Transit', '2023-11-11', 'Credit Card', 'FedEx', '2 PM - 5 PM')";

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
