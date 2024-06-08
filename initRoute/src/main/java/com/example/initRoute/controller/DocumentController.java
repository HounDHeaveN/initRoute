package com.example.initRoute.controller;



import com.example.initRoute.model.DocumentModel;
import com.example.initRoute.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping("/savedocument")
    public DocumentModel saveDocument(@RequestBody DocumentModel document) {
        return documentService.saveDocument(document);
    }

    @GetMapping("/getdocument/{documentId}")
    public Optional<DocumentModel> getDocument(@PathVariable UUID documentId) {
        return documentService.getDocument(documentId);
    }
}

