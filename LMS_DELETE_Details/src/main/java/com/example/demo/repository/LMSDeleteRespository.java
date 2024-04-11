package com.example.demo.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.LMSDelete;

import main.java.com.example.demo.repository.CustomLoginRepository;

@Repository
@Qualifier("mongoEmployeeRepository")
public interface LMSDeleteRespository extends MongoRepository<LMSDelete, String>, CustomLoginRepository {

    Optional<LMSDelete> findBybookname(String bookname);

}