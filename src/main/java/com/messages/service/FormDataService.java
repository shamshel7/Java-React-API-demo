package com.messages.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.messages.entity.FormData;
import com.messages.repository.FormDataRepository;

@Component
public class FormDataService {
	
	private FormDataRepository formDataRepository;

    public FormDataService(FormDataRepository formDataRepository) {
        this.formDataRepository = formDataRepository;
    }

    public List<FormData> getFormData() {
        return formDataRepository.findAll();
    }

}
