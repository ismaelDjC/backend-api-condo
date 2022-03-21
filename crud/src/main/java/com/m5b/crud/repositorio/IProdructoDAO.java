package com.m5b.crud.repositorio;
import com.m5b.crud.modelo.ProductoDTO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdructoDAO extends MongoRepository<ProductoDTO,String> {
    
}
