/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Compras;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Productos;
import pe.com.cibertec.CL2_AlvaroMoran.services.CompraService;
import pe.com.cibertec.CL2_AlvaroMoran.services.ProductoService;

/**
 *
 * @author RYZEN
 */
@Controller
public class CompraController {
    @Autowired
    private CompraService comService;
    
    @GetMapping("/compras")
    public String mostrarListaCompra(Model model){
        List<Compras> lstCom = comService.getCompras();
        model.addAttribute("compras", lstCom);
        return "list-compras";
    }
    
    @GetMapping("/comprasadmin")
    public String mostrarListaCompraClientes(Model model){
        List<Compras> lstCom = comService.getComprasAdmin();
        model.addAttribute("compras", lstCom);
        return "list-comprasAdmin";
    }
    
    @GetMapping("/compras/crear")
    public String mostrarCrearCompra() {
        return "create-compras";
    }
    
    @PostMapping("/compras/crear")
    public String CrearCompra(@ModelAttribute("compra") Compras compra) {
        comService.createCompra(compra);
        System.out.println(compra);
        return "redirect:/compras";
    } 

    
}
