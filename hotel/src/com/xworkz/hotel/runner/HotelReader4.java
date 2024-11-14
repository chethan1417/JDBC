package com.xworkz.hotel.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hotel.constants.ConnectionInfo;

public class HotelReader4 {

	public static void main(String[] args) {

		String query4 = "SELECT hotel_name, timings FROM hotel_data WHERE area_name = 'BTM'";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ConnectionInfo.URL.getValue(), ConnectionInfo.USERNAME.getValue(),
					ConnectionInfo.PASSWORD.getValue());

			Statement statement = connection.createStatement();
			ResultSet resultSet4 = statement.executeQuery(query4);
			while (resultSet4.next()) {
				System.out.println("Hotel Name: " + resultSet4.getString("hotel_name") + ", Timings: "
						+ resultSet4.getString("timings"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
