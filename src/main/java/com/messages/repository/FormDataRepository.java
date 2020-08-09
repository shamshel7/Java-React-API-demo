package com.messages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.messages.entity.FormData;

@RepositoryRestResource()
public interface FormDataRepository extends JpaRepository<FormData, Integer>, JpaSpecificationExecutor<FormData>, QuerydslPredicateExecutor<FormData> {}