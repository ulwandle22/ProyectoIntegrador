/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.msh.Service;

import com.portfolio.msh.entity.Hys;
import com.portfolio.msh.repository.rhys;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class Shys {
    @Autowired
    rhys rhys;
    
    public List<rhys> list(){
        return rhys.findAll();
    }
    
    public Optional<rhys> getOne(int id){
        return rhys.findById(id);
    }
    
    public Optional<rhys> getByNombre(String nombre){
        return rhys.findByNombre(nombre);
    }
    
    public void save(Hys skill){
        rhys.save(skill);
    }
    
    public void delete(int id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rhys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhys.existsByNombre(nombre);
    }

    
    
}
