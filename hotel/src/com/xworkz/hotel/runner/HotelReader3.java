package com.xworkz.hotel.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hotel.constants.ConnectionInfo;

public class HotelReader3 {

	public static void main(String[] args) {

		String query3 = "SELECT hotel_name FROM hotel_data WHERE partner_name = 'chethan' AND sunday_availability = true";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ConnectionInfo.URL.getValue(), ConnectionInfo.USERNAME.getValue(),
					ConnectionInfo.PASSWORD.getValue());

			Statement statement = connection.createStatement();
			ResultSet resultSet3 = statement.executeQuery(query3);
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("hotel_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
