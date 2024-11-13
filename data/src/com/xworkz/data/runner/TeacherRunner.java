package com.xworkz.data.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.data.enums.Info;

public class TeacherRunner {

	public static void main(String[] args) {

		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		try {
			connection=DriverManager.getConnection(Info.URL.getValue(),Info.USERNAME.getValue(),Info.PASSWORD.getValue());
			preparedStatement=connection.prepareStatement("insert into teachers_data values(?,?,?)");
			preparedStatement.setInt(1,15);
			preparedStatement.setString(2, "akhil");
			preparedStatement.setString(3, "23000");
			
			int value=preparedStatement.executeUpdate();
			
			if(value>0)
			{
				System.out.println("Data is saved");
			}
			else
			{
				System.out.println("Data is Not saved");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
