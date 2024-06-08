package com.example.initRoute.service;



import com.example.initRoute.model.DocumentModel;
import com.example.initRoute.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public DocumentModel saveDocument(DocumentModel document) {
        document.setDocument_id(UUID.randomUUID());
        document.setCreated_on(new java.util.Date());
        return documentRepository.save(document);
    }

    public Optional<DocumentModel> getDocument(UUID documentId) {
        return documentRepository.findById(documentId);
    }
}


