package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LMSDeleteRespository;

@Service
public class LMSDeleteService {

    @Autowired
    LMSDeleteRespository lMSDeleteRespository;
    


    public void deletedataBybookname(String bookname) {
        lMSDeleteRespository.deleteBybookname(bookname);
    }



}
