package com.messages.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.messages.entity.FormData;
import com.messages.links.FormDataLinks;
import com.messages.service.FormDataService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class FormDataController {
	
	@Autowired
    FormDataService formDataService;
    
    @GetMapping(path = FormDataLinks.LIST_FORM_DATA)
    public ResponseEntity<?> listFormData() {
        log.info("FormDataController:  list form data");
        List<FormData> resource = formDataService.getFormData();
        return ResponseEntity.ok(resource);
    }

}
