
package com.dussanpalma.demo.models.dao;

import com.dussanpalma.demo.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;


public interface iFacturaDao  extends CrudRepository<Factura, Long>{
    
}
