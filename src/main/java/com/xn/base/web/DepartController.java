package com.xn.base.web;

import com.xn.base.entity.Depart;
import com.xn.base.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/depart")
public class DepartController {

    @Autowired
    private DepartService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Depart> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Depart findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(Depart entity){
        service.save(entity);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void update(@PathVariable Integer id,@RequestBody Depart entity){
        service.update(entity,id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
