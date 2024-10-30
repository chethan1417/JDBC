package com.xworkz.runner.students1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentsdata1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/students";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into data values(1,'chethan','chitradurga'),(2,'sudhu','davangere'),(3,'kumar','bagalkot'),(4,'karthik','hubli'),(5,'likhi','bengaluru'),(6,'sachin','harihar'),(7,'alok','sira'),(8,'anoop','gadag'),(9,'sarthak','hiriyur'),(10,'vaiju','dharwad'),(11,'chandan','manglore'),(12,'gani','bidar'),(13,'yashu','hassan'),(14,'kiran','shivmogga'),(15,'nattu','mysore'),(16,'rajath','udupi'),(17,'bhuvan','mandya'),(18,'harsha','hospet'),(19,'yashwanth','maddur'),(20,'goutham','bellary')";
        String updateQuery="update data set district = 'CTA' WHERE id = 1";
        String updateQuery1="update data set district = 'DVG' WHERE id = 2";
        String updateQuery2="update data set district = 'BGT' WHERE id = 3";
        String updateQuery3="update data set district = 'HBI' WHERE id = 4";
        String updateQuery4="update data set district = 'BLR' WHERE id = 5";
        String updateQuery5="update data set district = 'HAR' WHERE id = 6";
        String updateQuery6="update data set district = 'SI' WHERE id = 7";
        String updateQuery7="update data set district = 'GAD' WHERE id = 8";
        String updateQuery8="update data set district = 'HIR' WHERE id = 9";
        String updateQuery9="update data set district = 'DHA' WHERE id = 10";
        String deleteQuery1="delete from data where id=11";
        String deleteQuery2="delete from data where id=12";
        String deleteQuery3="delete from data where id=13";
        String deleteQuery4="delete from data where id=14";
        String deleteQuery5="delete from data where id=15";
        String deleteQuery6="delete from data where id=16";
        String deleteQuery7="delete from data where id=17";
        String deleteQuery8="delete from data where id=18";
        String deleteQuery9="delete from data where id=19";
        String deleteQuery10="delete from data where id=20";



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
