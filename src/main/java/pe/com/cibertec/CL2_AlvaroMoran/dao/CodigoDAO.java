/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Codigo;

/**
 *
 * @author RYZEN
 */
@Repository
public interface CodigoDAO extends CrudRepository<Codigo, Object>{
   /* List<Codigo> findByCodigos(@Param(value = "CodProd") String CodProd); */
}
