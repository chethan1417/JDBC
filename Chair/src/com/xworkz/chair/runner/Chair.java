package com.xworkz.chair.runner;

public class Chair {
	
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
			Class.forName("com.xworkz.chair.runner.PlasticChair");
			System.out.println("invoking static block of PlasticChair ");
			
		}
		catch(ClassNotFoundException e1)
		{
			e1.printStackTrace();
		}

	}

}
