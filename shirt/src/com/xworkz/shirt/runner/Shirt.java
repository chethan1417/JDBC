package com.xworkz.shirt.runner;

public class Shirt {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("invoking Driver");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		
		try
		{
			Class.forName("com.xworkz.shirt.runner.PoloShirt");
			System.out.println("invoking static block of PoloShirt ");
			
		}
		catch(ClassNotFoundException e1)
		{
			e1.printStackTrace();
		}

		
	}

}
