package com.example.erp_production_mrp.exception;

import org.springframework.data.crossstore.ChangeSetPersister;

public class ResourceNotFoundException extends ChangeSetPersister.NotFoundException {
    public ResourceNotFoundException(String s) {
    }
}
