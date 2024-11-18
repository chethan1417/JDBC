package com.xworkz.formJdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.formJdbc.constants.ConnectionJdbc;
import com.xworkz.formJdbc.dto.FormDTO;

public class FormRepositoryImpl implements FormRepository {

	@Override
	public boolean save(FormDTO formDTO) {

		Connection connection = null;
		PreparedStatement prep = null;
		boolean isValid = false;

		try {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("invoking driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(ConnectionJdbc.URL.getValue(), ConnectionJdbc.USERNAME.getValue(),
					ConnectionJdbc.PASSWORD.getValue());
			prep = connection.prepareStatement("INSERT INTO form_data (name, email, age, contact) VALUES (?, ?, ?, ?)");
			prep.setString(1, formDTO.getName());
			prep.setString(2, formDTO.getEmail());
			prep.setInt(3, formDTO.getAge());
			prep.setLong(4, formDTO.getContact());
			
			int value = prep.executeUpdate();
			
			if (value > 0) {
				System.out.println("data saved");
				isValid = true;
			} else {
				System.out.println("data not saved");
				isValid = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return isValid;
	}

}
