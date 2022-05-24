
package com.dussanpalma.demo.models.dao;

import com.dussanpalma.demo.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductDao extends CrudRepository<Product, Long>{
    
}
