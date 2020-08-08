package com.xn.base.service;

import com.xn.base.dao.DepartDao;
import com.xn.base.entity.Depart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartService {

    @Autowired
    private DepartDao departDao;

    //查询
    public List<Depart> findAll() {
        return departDao.findAll();
    }

    //根据id查询
    public Depart findById(Integer id) {
        return departDao.findById(id).get();
    }

    //增加
    public void save(Depart entity) {
        departDao.save(entity);
    }

    //修改
    public void update(Depart entity, Integer id) {
        entity.setId(id);
        departDao.save(entity);
    }

    //删除
    public void delete(Integer id) {
        departDao.deleteById(id);
    }
}
