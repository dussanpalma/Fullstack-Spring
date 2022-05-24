
package com.dussanpalma.demo.models.dao;

import com.dussanpalma.demo.models.entity.Tienda;
import org.springframework.data.repository.CrudRepository;

public interface ITiendaDao extends CrudRepository<Tienda, Long>{
    
}
