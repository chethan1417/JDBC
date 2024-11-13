package com.xworkz.data.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.data.enums.Info;

public class CarsRunner {

	public static void main(String[] args) {

		 Connection connection=null;
		 PreparedStatement prep=null;
		 
		 try {
			connection=DriverManager.getConnection(Info.URL.getValue(),Info.URL.getValue(),Info.PASSWORD.getValue());
			prep=connection.prepareStatement("insert into cars_data(?,?,?)");
			Object[][] carData = {
	                {1, "Toyota Corolla", "White"},
	                {2, "Honda Civic", "Black"},
	                {3, "Ford Mustang", "Red"},
	                {4, "Chevrolet Camaro", "Blue"},
	                {5, "BMW 3 Series", "Silver"},
	                {6, "Audi A4", "Grey"},
	                {7, "Mercedes C-Class", "Black"},
	                {8, "Tesla Model S", "White"},
	                {9, "Volkswagen Golf", "Green"},
	                {10, "Mazda 3", "Red"},
	                {11, "Hyundai Elantra", "Blue"},
	                {12, "Nissan Altima", "Black"},
	                {13, "Kia Optima", "Silver"},
	                {14, "Subaru Impreza", "White"},
	                {15, "Jaguar XE", "Grey"}
	            };
		 
		 for (Object[] car : carData) {
             prep.setInt(1, (int) car[0]);
             prep.setString(2, (String) car[1]);
             prep.setString(3, (String) car[2]);
             prep.addBatch();
         }
		 
         int[] values = prep.executeBatch();
		 
		 } catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
