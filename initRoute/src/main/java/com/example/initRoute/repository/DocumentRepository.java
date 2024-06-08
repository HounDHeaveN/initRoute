package com.example.initRoute.repository;



import com.example.initRoute.model.DocumentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DocumentRepository extends MongoRepository<DocumentModel, UUID> {

}

