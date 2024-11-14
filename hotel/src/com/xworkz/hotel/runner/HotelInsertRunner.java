package com.xworkz.hotel.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.hotel.constants.ConnectionInfo;
import com.xworkz.hotel.dto.HotelDTO;

public class HotelInsertRunner {

	public static void main(String[] args) {

		HotelDTO hotelDTO = new HotelDTO(1,"upadya","Goutham",true,"IUDP","Bnglr road","Akhil","9AM to 10PM", true,5);
		HotelDTO hotelDTO1 = new HotelDTO(2,"krishna","Kiran",false,"Rajajinagar","smg road","chethan","9AM to 10PM", false,4);
		HotelDTO hotelDTO2 = new HotelDTO(3,"swagath","bharath",false,"BTM","bk road","sujay","9AM to 10PM", false,4);
		HotelDTO hotelDTO3= new HotelDTO(4,"mane ruchi","likith",false,"Indiranagar","RC road","bhuvan","9AM to 10PM", true,4);
		HotelDTO hotelDTO4 = new HotelDTO(5,"udupi","alok",true,"RR nagar","KHB road","gothu","9AM to 10PM", false,5);
		HotelDTO hotelDTO5 = new HotelDTO(6,"kamath","yashwanth",true,"vijaynagar","DVG road","sanjan","9AM to 10PM", true,3);
		HotelDTO hotelDTO6 = new HotelDTO(7,"sri hari","bhuvan",true,"vidyanagar","TMK road","geetha","9AM to 10PM", false,3);
		HotelDTO hotelDTO7 = new HotelDTO(8,"amogha","chethan",false,"davalagiri","MN road","sangeetha","9AM to 10PM", true,4);
		HotelDTO hotelDTO8 = new HotelDTO(9,"ruchi","varun",true,"SR layout","Tumkur road","gnan","9AM to 10PM", true,5);
		HotelDTO hotelDTO9 = new HotelDTO(10,"aisiri","sujay",true,"RC layout","SMG road","kiran","9AM to 10PM", false,4);

		Connection connection=null;
		PreparedStatement prep=null;
		
		try {
			connection=DriverManager.getConnection(ConnectionInfo.URL.getValue(),ConnectionInfo.USERNAME.getValue(),ConnectionInfo.PASSWORD.getValue());
		   prep=connection.prepareStatement("insert into hotel_data values(?,?,?,?,?,?,?,?,?,?)");
		   prep.setInt(1,hotelDTO.getId());
		   prep.setString(2,hotelDTO.getHotelName());
		   prep.setString(3,hotelDTO.getOwnerName());
		   prep.setBoolean(4,hotelDTO.isVeg());
		   prep.setString(5,hotelDTO.getAreaName());
		   prep.setString(6,hotelDTO.getStreetName());
		   prep.setString(7,hotelDTO.getPartnerName());
		   prep.setString(8,hotelDTO.getTimings());
		   prep.setBoolean(9,hotelDTO.isSundayAvailablity());
		   prep.setInt(10,hotelDTO.getRatings());


		   int values=prep.executeUpdate();
		   if(values>0)
		   {
			   System.out.println("this is saved ");
		   }
		   else
		   {
			   System.out.println("this is not saved");
		   }
		   
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
