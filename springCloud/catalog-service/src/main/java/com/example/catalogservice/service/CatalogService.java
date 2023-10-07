package com.example.catalogservice.service;

import com.example.catalogservice.domain.CatalogEntity;
import org.springframework.stereotype.Service;

public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();
}
