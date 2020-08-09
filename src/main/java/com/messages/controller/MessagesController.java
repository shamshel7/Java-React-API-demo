package com.messages.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.messages.entity.Messages;
import com.messages.links.MessageLinks;
import com.messages.service.MessagesService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class MessagesController {
	
	@Autowired
    MessagesService messagesService;
	
	@GetMapping(path = MessageLinks.LIST_MESSAGES)
    public ResponseEntity<?> listMessages() {
        log.info("MessagesController:  list messages");
        List<Messages> resource = messagesService.getMessages();
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = MessageLinks.ADD_MESSAGE)
	public ResponseEntity<?> saveMessage(@RequestBody Messages message) {
        log.info("MessagesController:  list messages");
        Messages resource = messagesService.saveMessage(message);
        return ResponseEntity.ok(resource);
    }
}
