package main.java.com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.repository.model.LMSDelete;

public interface CustomLoginRepository extends MongoRepository<LMSDelete, String> {
    void deleteBybookname(String bookname);
    @Query("{ 'bookname' : ?0 }")
    Optional<LMSDelete> findByBook_name(String bookname);
}
