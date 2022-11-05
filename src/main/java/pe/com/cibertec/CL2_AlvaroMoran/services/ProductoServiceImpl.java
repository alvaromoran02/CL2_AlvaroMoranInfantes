/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cibertec.CL2_AlvaroMoran.dao.ProductosDAO;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Productos;

/**
 *
 * @author RYZEN
 */
@Service
public class ProductoServiceImpl implements  ProductoService{

    @Autowired
    private ProductosDAO proDAO;
    
    @Override
    public List<Productos> getProductos() {
        return (List<Productos>)proDAO.findAll();
    }

    @Override
    public Optional<Productos> getProductosById(Long id) {
        return proDAO.findById(id);
    }

    @Override
    public void createProducto(Productos p) {
        proDAO.save(p);
    }

    @Override
    public void updateProducto(Long id, Productos p) {
        proDAO.save(p);
    }

    @Override
    public void deleteProducto(Long id) {
        proDAO.deleteById(id);
    }
    
    
}
