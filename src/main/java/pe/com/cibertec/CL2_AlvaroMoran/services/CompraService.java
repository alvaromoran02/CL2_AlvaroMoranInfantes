/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.services;

import java.util.List;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Compras;


/**
 *
 * @author RYZEN
 */
public interface CompraService {
    public List<Compras> getCompras();
    public void createCompra(Compras c); 
    public List<Compras> getComprasAdmin();
}
