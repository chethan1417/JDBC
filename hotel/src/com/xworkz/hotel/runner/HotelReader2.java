package com.xworkz.hotel.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hotel.constants.ConnectionInfo;

public class HotelReader2 {

	public static void main(String[] args) {

		String query2 = "SELECT area_name, street_name FROM hotel_data WHERE ratings > 4";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ConnectionInfo.URL.getValue(), ConnectionInfo.USERNAME.getValue(),
					ConnectionInfo.PASSWORD.getValue());

			Statement statement = connection.createStatement();
			ResultSet resultSet2 = statement.executeQuery(query2);
			while (resultSet2.next()) {
				System.out.println("Area: " + resultSet2.getString("area_name") + ", Street: "
						+ resultSet2.getString("street_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
