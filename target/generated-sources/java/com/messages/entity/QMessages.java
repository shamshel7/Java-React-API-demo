package com.messages.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMessages is a Querydsl query type for Messages
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMessages extends EntityPathBase<Messages> {

    private static final long serialVersionUID = 993346114L;

    public static final QMessages messages = new QMessages("messages");

    public final StringPath email = createString("email");

    public final StringPath enquiry = createString("enquiry");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QMessages(String variable) {
        super(Messages.class, forVariable(variable));
    }

    public QMessages(Path<? extends Messages> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMessages(PathMetadata metadata) {
        super(Messages.class, metadata);
    }

}

