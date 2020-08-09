package com.messages.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.messages.entity.Messages;
import com.messages.repository.MessagesRepository;

@Component
public class MessagesService {
	
	private MessagesRepository messagesRepository;

    public MessagesService(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    public List<Messages> getMessages() {
        return messagesRepository.findAll();
    }
    
    public Messages saveMessage(Messages messages) {
    	return messagesRepository.save(messages);
    }

}
