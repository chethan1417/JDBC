package com.xworkz.data.enums;

public enum BikesInfo {
	
	URL("jdbc:mysql://localhost:3306/teachers"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private final String value;
	
	private BikesInfo(String value)
	{
		this.value=value;
	}
	
	public String getValue()
	{
		return value;
		
	}

}
