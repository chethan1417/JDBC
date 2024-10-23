package com.xworkz.shoe.runner;

public class Shoe {

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
			Class.forName("com.xworkz.shoe.runner.NikeShoe");
			System.out.println("invoking static block of NikeShoe ");
			
		}
		catch(ClassNotFoundException e1)
		{
			e1.printStackTrace();
		}

	}

}
