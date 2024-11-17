package com.xworkz.formJdbc.repository;

import com.xworkz.formJdbc.dto.FormDTO;

public interface FormRepository {

	boolean save(FormDTO formDTO);
}
