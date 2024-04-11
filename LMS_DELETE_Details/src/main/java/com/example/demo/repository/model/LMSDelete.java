package com.example.demo.repository.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;

@Document(collection = "LMSInformation")
@Data
public class LMSDelete {
    @Id
    private String id;
    private String bookname;
    private String book_classification;
    private String book_price;
    private String book_rating;
    private String book_renewed_date;
}
