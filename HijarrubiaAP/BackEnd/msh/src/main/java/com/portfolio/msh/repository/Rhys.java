/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.msh.repository;

import com.portfolio.msh.entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 * 
 * 
 */
public interface rhys extends JpaRepository<rhys, Integer>{
    Optional<rhys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);

    public void save(Hys skill);

   
}
