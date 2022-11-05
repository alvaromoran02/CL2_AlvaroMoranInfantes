/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Productos;

/**
 *
 * @author RYZEN
 */
@Service
public interface ProductoService {
    public List<Productos> getProductos(); 
    public Optional<Productos> getProductosById(Long id);
    public void createProducto(Productos p);
    public void updateProducto(Long id, Productos p);
    public void deleteProducto(Long id);
}
