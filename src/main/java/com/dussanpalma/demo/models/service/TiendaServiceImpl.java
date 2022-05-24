package com.dussanpalma.demo.models.service;

import com.dussanpalma.demo.models.entity.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.dussanpalma.demo.models.dao.IClientDao;
import com.dussanpalma.demo.models.dao.ITiendaDao;
import com.dussanpalma.demo.models.entity.Tienda;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TiendaServiceImpl implements ITiendaService {

    @Autowired
    private ITiendaDao tiendaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Tienda> findAll() {

        return (List<Tienda>) tiendaDao.findAll();
    }

}
