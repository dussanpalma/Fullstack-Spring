package com.dussanpalma.demo.models.service;

import com.dussanpalma.demo.models.entity.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.dussanpalma.demo.models.dao.IClientDao;
import com.dussanpalma.demo.models.dao.IProductDao;
import com.dussanpalma.demo.models.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {

        return (List<Product>) productDao.findAll();
    }

}
