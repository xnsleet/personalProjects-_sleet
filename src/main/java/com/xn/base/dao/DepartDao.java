package com.xn.base.dao;

import com.xn.base.entity.Depart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartDao extends JpaRepository<Depart,Integer>,JpaSpecificationExecutor<Depart> {
}
