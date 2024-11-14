package com.xworkz.hotel.constants;

public enum ConnectionInfo {
	
	URL("jdbc:mysql://localhost:3306/hotels"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private final String value;
	
	private ConnectionInfo(String value) {
		this.value=value;
	}

	public String getValue()
	{
		return value;
	}
}
