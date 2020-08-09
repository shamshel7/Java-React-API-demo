package com.messages.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Data
public class Messages {
	
	@Id
	@Column
    private long id;

    @Column
    @NotNull(message="{NotNull.Message.name}")
    private String name;
    
    @Column
    @NotNull(message="{NotNull.Message.email}")
    private String email;
    
    @Column
    @NotNull(message="{NotNull.Message.enquiry}")
    private String enquiry;

}
