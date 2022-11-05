/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cibertec.CL2_AlvaroMoran.dao.ComprasDAO;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Compras;

/**
 *
 * @author RYZEN
 */
@Service
public class CompraServiceImpl implements CompraService{

    @Autowired
    private ComprasDAO comDAO;
    
    @Override
    public List<Compras> getCompras() {
        return (List<Compras>)comDAO.getCompras();
    }

    @Override
    public void createCompra(Compras c) {
        comDAO.save(c);
    }

    @Override
    public List<Compras> getComprasAdmin() {
        return (List<Compras>)comDAO.getComprasAdmin();
    }

    
}
