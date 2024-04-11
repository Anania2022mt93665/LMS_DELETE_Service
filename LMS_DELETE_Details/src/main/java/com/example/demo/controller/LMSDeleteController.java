package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.LMSDeleteRespository;
import com.example.demo.service.LMSDeleteService;

@RestController

@RequestMapping("/LMS")

public class LMSDeleteController {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    LMSDeleteService lMSDeleteService;

    @Autowired
    LMSDeleteRespository lMSDeleteRespository;


    @DeleteMapping("/delete-LMS_Book-details")
    public String deletedataBybookname(@RequestParam String bookname) {
        lMSDeleteService.deletedataBybookname(bookname);
        return "Deleted Successfully";
    }


}


