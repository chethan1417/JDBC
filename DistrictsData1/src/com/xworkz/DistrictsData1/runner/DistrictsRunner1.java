package com.xworkz.DistrictsData1.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DistrictsRunner1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/districts";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into districts_data values (1, 'Belagavi', 'Karnataka'), (2, 'Pune', 'Maharashtra'), (3, 'Ahmedabad', 'Gujarat'), (4, 'Jaipur', 'Rajasthan'), (5, 'Chennai', 'Tamil Nadu'), (6, 'Kochi', 'Kerala'), (7, 'Amritsar', 'Punjab'), (8, 'Lucknow', 'Uttar Pradesh'), (9, 'Patna', 'Bihar'), (10, 'Kolkata', 'West Bengal'), (11, 'Bhubaneswar', 'Odisha'), (12, 'Hyderabad', 'Telangana'), (13, 'Gurgaon', 'Haryana'), (14, 'Visakhapatnam', 'Andhra Pradesh'), (15, 'Surat', 'Gujarat'), (16, 'Guwahati', 'Assam'), (17, 'Indore', 'Madhya Pradesh'), (18, 'Raipur', 'Chhattisgarh'), (19, 'Ranchi', 'Jharkhand'), (20, 'New Delhi', 'Delhi')";
		String updateQuery = "update districts_data set state = 'KA' WHERE id = 1";
		String updateQuery1 = "update districts_data set state = 'MH' WHERE id = 2";
		String updateQuery2 = "update districts_data set state = 'GJ' WHERE id = 3";
		String updateQuery3 = "update districts_data set state = 'RJ' WHERE id = 4";
		String updateQuery4 = "update districts_data set state = 'TN' WHERE id = 5";
		String updateQuery5 = "update districts_data set state = 'KE' WHERE id = 6";
		String updateQuery6 = "update districts_data set state = 'PN' WHERE id = 7";
		String updateQuery7 = "update districts_data set state = 'UP' WHERE id = 8";
		String updateQuery8 = "update districts_data set state = 'BH' WHERE id = 9";
		String updateQuery9 = "update districts_data set state = 'WB' WHERE id = 10";
        String deleteQuery1="delete from districts_data where id=11";
        String deleteQuery2="delete from districts_data where id=12";
        String deleteQuery3="delete from districts_data where id=13";
        String deleteQuery4="delete from districts_data where id=14";
        String deleteQuery5="delete from districts_data where id=15";
        String deleteQuery6="delete from districts_data where id=16";
        String deleteQuery7="delete from districts_data where id=17";
        String deleteQuery8="delete from districts_data where id=18";
        String deleteQuery9="delete from districts_data where id=19";
        String deleteQuery10="delete from districts_data where id=20";

		try (Connection connection = DriverManager.getConnection(url, userName, password))
		{
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(deleteQuery10);
			if (value > 0) {
				System.out.println("this is saved");
			} else {
				System.out.println("not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
