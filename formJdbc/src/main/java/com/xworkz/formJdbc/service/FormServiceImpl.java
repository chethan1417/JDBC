package com.xworkz.formJdbc.service;

import com.xworkz.formJdbc.dto.FormDTO;
import com.xworkz.formJdbc.repository.FormRepositoryImpl;

public class FormServiceImpl implements FormService {

	@Override
	public boolean validateAndSave(FormDTO formDTO) {

		
		FormRepositoryImpl form=new FormRepositoryImpl();
		form.save(formDTO);
		
		boolean valid=true;
		if(formDTO!=null) {
			
			String name=formDTO.getName();
			if(name!=null && name.length()>3)
			{
				System.out.println("Valid name");
			}
			else
			{
				System.err.println("InValid name");	
				valid=false;
			}
			
			String email=formDTO.getEmail();
			if(email!=null && email.endsWith(".com") && email.contains("@"))
			{
				System.out.println("valid email");
			}
			else
			{
				System.out.println("Invalid email");
				valid=false;
			}
			
			int age=formDTO.getAge();
			if(age>18)
			{
				System.out.println("valid age");
			}
			else
			{
				System.out.println("invalid age");
				valid=false;
			}
			
			long contact=formDTO.getContact();
			if(contact>9)
			{
				System.out.println("valid contact number");
			}
			else
			{
				System.out.println("invalid contact number");
				valid=false;
			}
		}
		
		return valid;
	}

}
