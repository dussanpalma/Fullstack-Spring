
package com.dussanpalma.demo.models.dao;

import com.dussanpalma.demo.models.entity.Mechanic;
import org.springframework.data.repository.CrudRepository;

public interface IMechanicDao   extends CrudRepository<Mechanic, Long>{
    
}
