package com.xworkz.formJdbc.service;

import com.xworkz.formJdbc.dto.FormDTO;

public interface FormService {

	boolean validateAndSave(FormDTO formDTO);

}
