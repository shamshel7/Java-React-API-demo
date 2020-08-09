package com.messages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.messages.entity.Messages;

@RepositoryRestResource()
public interface MessagesRepository extends JpaRepository<Messages, Integer>, JpaSpecificationExecutor<Messages>, QuerydslPredicateExecutor<Messages> {}
