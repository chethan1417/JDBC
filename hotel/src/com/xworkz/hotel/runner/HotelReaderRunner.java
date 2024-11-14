package com.xworkz.hotel.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hotel.constants.ConnectionInfo;

public class HotelReaderRunner {

	public static void main(String[] args) {

		String query1 = "SELECT hotel_name FROM hotel_data WHERE owner_name = 'Goutham' AND is_veg = true";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ConnectionInfo.URL.getValue(), ConnectionInfo.USERNAME.getValue(),
					ConnectionInfo.PASSWORD.getValue());

			Statement statement = connection.createStatement();
			ResultSet resultSet1 = statement.executeQuery(query1);
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("hotel_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
