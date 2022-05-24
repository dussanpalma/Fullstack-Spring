package com.dussanpalma.demo.models.service;

import com.dussanpalma.demo.models.dao.IMechanicDao;
import com.dussanpalma.demo.models.entity.Mechanic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MechanicServiceImpl implements IMechanicService {

    @Autowired
    private IMechanicDao mechanicDao;

    @Override
    @Transactional(readOnly = true)
    public List<Mechanic> findAll() {

        return (List<Mechanic>) mechanicDao.findAll();

    }

}
