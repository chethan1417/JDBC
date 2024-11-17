package com.xworkz.formJdbc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.formJdbc.dto.FormDTO;
import com.xworkz.formJdbc.service.FormService;
import com.xworkz.formJdbc.service.FormServiceImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/form")
public class FormServlet extends HttpServlet{
	
	public FormServlet() {

		System.out.println("no arg const of FormServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		String contact=req.getParameter("contact");
		int convertedAge=Integer.valueOf(age);
		long convertedContact=Long.valueOf(contact);
		
		FormService formService=new FormServiceImpl();
		FormDTO formDTO=new FormDTO(name, email, convertedAge, convertedContact);
		boolean check=formService.validateAndSave(formDTO);

		if(check)
		{
			System.out.println("valid Form");
		}
		else
		{
			System.out.println("invalid form");
		}
		
		RequestDispatcher requestDispatcher= req.getRequestDispatcher("./Form.jsp");
		requestDispatcher.forward(req, resp);
		
	}

}
