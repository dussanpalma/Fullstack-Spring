package com.dussanpalma.demo.models.service;

import com.dussanpalma.demo.models.entity.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.dussanpalma.demo.models.dao.IClientDao;
import com.dussanpalma.demo.models.dao.iFacturaDao;
import com.dussanpalma.demo.models.entity.Factura;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientDao clientDao;
    
     @Autowired
    private iFacturaDao facturaDao;


    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {

        return (List<Client>) clientDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Client findById(Long id) {
        return clientDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Client save(Client cliente) {
           return clientDao.save(cliente);

      }

    @Override
    @Transactional
    public void delete(Long id) {
        clientDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Factura findFacturaById(Long id) {
        
        return facturaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Factura save(Factura factura) {
         return facturaDao.save(factura);
    }

    @Override
    @Transactional
    public void deleteFactura(Long id) {
        facturaDao.deleteById(id);
    }

}
