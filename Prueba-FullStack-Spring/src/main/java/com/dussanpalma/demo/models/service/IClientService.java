
package com.dussanpalma.demo.models.service;

import com.dussanpalma.demo.models.entity.Client;
import com.dussanpalma.demo.models.entity.Factura;
import java.util.List;

public interface IClientService {
    
    public List<Client> findAll();
    
    public Client findById(Long id);

    public Client save(Client cliente);
    
    public void delete(Long id);
    
    public Factura findFacturaById(Long id);

    public Factura save(Factura factura);

     public void deleteFactura(Long id);
 
    
}
