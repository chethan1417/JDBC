package com.xworkz.runner.cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cars {
	
	public static void main(String[] args) {

				String url = "jdbc:mysql://localhost:3306/cars";
				String userName = "root";
				String password = "Xworkzodc@123";
				String insertQuery = "insert into cars_data values(1,'BMW','m1'),(2,'BMW','m2'),(3,'BMW','m5'),(4,'tata','indica'),(5,'tata','indigo'),(6,'tata','nano'),(7,'tata','altroz'),(8,'tata','nexon'),(9,'tata','safari'),(10,'tata','harrier'),(11,'tata','nexa'),(12,'mahendra','xuv300'),(13,'mahendra','xuv500'),(14,'mahendra','xuv700'),(15,'toyota','innova'),(16,'toyota','crysta'),(17,'toyota','fortuner'),(18,'toyata','legender'),(19,'RR','defender'),(20,'RR','RangeRover')";
		        String updateQuery1="update cars_data set brand = 'bmw' WHERE id = 1";
		        String updateQuery2="update cars_data set brand = 'bmw' WHERE id = 2";
		        String updateQuery3="update cars_data set brand = 'bmw' WHERE id = 3";
		        String updateQuery4="update cars_data set brand = 'TATA' WHERE id = 4";
		        String updateQuery5="update cars_data set brand = 'TATA' WHERE id = 5";
		        String updateQuery6="update cars_data set brand = 'TATA' WHERE id = 6";
		        String updateQuery7="update cars_data set brand = 'TATA' WHERE id = 7";
		        String updateQuery8="update cars_data set brand = 'TATA' WHERE id = 8";
		        String updateQuery9="update cars_data set brand = 'TATA' WHERE id = 9";
		        String updateQuery10="update cars_data set brand = 'TATA' WHERE id = 10";
		        String deleteQuery1="delete from cars_data where id=11";
		        String deleteQuery2="delete from cars_data where id=12";
		        String deleteQuery3="delete from cars_data where id=13";
		        String deleteQuery4="delete from cars_data where id=14";
		        String deleteQuery5="delete from cars_data where id=15";
		        String deleteQuery6="delete from cars_data where id=16";
		        String deleteQuery7="delete from cars_data where id=17";
		        String deleteQuery8="delete from cars_data where id=18";
		        String deleteQuery9="delete from cars_data where id=19";
		        String deleteQuery10="delete from cars_data where id=20";



				try (Connection connection = DriverManager.getConnection(url, userName, password);) {
					Statement statement = connection.createStatement();
					int value = statement.executeUpdate(deleteQuery10);
					if (value > 0) {
						System.out.println("this is saved");
					} else {
						System.out.println("this is not saved");
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

}

}
