package com.xworkz.data.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.omg.PortableInterceptor.Interceptor;

import com.xworkz.data.enums.BikesInfo;

public class BikesRunner {

	public static void main(String[] args) {

		Connection connection=null;
		PreparedStatement prep=null;
		
		
		try {
			connection=DriverManager.getConnection(BikesInfo.URL.getValue(),BikesInfo.USERNAME.getValue(),BikesInfo.PASSWORD.getValue());
			prep=connection.prepareStatement("insert into bikes_data values(?,?,?)");
			prep.setInt(1, 15);
			prep.setString(2, "Buza");
			prep.setString(3,"Red and black");
			
			int value=prep.executeUpdate();
			if(value>0)
			{
				System.out.println("data is saved");
			}
			else
			{
				System.out.println("data is not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
