
package com.dussanpalma.demo.models.dao;

import com.dussanpalma.demo.models.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Client, Long>{
    
}
