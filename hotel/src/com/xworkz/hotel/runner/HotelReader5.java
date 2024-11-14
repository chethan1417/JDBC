package com.xworkz.hotel.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hotel.constants.ConnectionInfo;

public class HotelReader5 {

	public static void main(String[] args) {

		String query5 = "SELECT hotel_name, owner_name FROM hotel_data WHERE ratings = 5";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ConnectionInfo.URL.getValue(), ConnectionInfo.USERNAME.getValue(),
					ConnectionInfo.PASSWORD.getValue());

			Statement statement = connection.createStatement();
			ResultSet resultSet5 = statement.executeQuery(query5);
			while (resultSet5.next()) {
				System.out.println("Hotel Name: " + resultSet5.getString("hotel_name") + ", Owner: "
						+ resultSet5.getString("owner_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
