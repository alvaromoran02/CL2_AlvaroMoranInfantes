/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Productos;

/**
 *
 * @author RYZEN
 */
@Repository
public interface ProductosDAO extends CrudRepository<Productos, Long> {
    
}
