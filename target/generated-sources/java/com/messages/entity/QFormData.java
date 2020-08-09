package com.messages.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFormData is a Querydsl query type for FormData
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFormData extends EntityPathBase<FormData> {

    private static final long serialVersionUID = 1928638340L;

    public static final QFormData formData = new QFormData("formData");

    public final StringPath fieldName = createString("fieldName");

    public final StringPath id = createString("id");

    public QFormData(String variable) {
        super(FormData.class, forVariable(variable));
    }

    public QFormData(Path<? extends FormData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFormData(PathMetadata metadata) {
        super(FormData.class, metadata);
    }

}

