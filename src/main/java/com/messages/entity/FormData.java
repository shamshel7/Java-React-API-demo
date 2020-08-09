package com.messages.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Data
public class FormData {
	
	@Id
    @Column
    @NotNull(message="{NotNull.FormDatum.id}")
    private String id;

    @Column
    @NotNull(message="{NotNull.FormDatum.fieldName}")
    private String fieldName;

}