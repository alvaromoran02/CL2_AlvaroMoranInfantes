/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Codigo;
import pe.com.cibertec.CL2_AlvaroMoran.services.CodigoService;

/**
 *
 * @author RYZEN
 */
public class CodigoController {
    /*@Autowired
    CodigoService codService;
    
    @GetMapping("/{id}")
    public List<Codigo> searchCodigo(@PathVariable("CodProd") String CodProd){
        return codService.findByCodigo(CodProd);
    }*/
}
