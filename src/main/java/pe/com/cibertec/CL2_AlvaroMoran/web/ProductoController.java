/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Productos;
import pe.com.cibertec.CL2_AlvaroMoran.services.ProductoService;

/**
 *
 * @author RYZEN
 */
@Controller
public class ProductoController {
    @Autowired
    private ProductoService proService;
    
    @GetMapping("/productos")
    public String mostrarListaProductos(Model model){       
        List<Productos> lstPro = proService.getProductos();      
        model.addAttribute("productos", lstPro);
        System.out.println(lstPro);
        return "list-productos";
    }
    
    @GetMapping("productos/crear")
    public String mostrarCrearProducto() {
        return "create-productos";
    }
    
    @PostMapping("productos/crear")
    public String crearProducto(@ModelAttribute("producto") Productos producto) {    
        
        proService.createProducto(producto);
        return "redirect:/productos";
    }
    
    @GetMapping("productos/editar/{id}")
    public String mostrarEditarProducto(@PathVariable("id") Long id, Model model){
        Optional<Productos> producto = proService.getProductosById(id);
        if(producto.isEmpty()){
            return "redirect:/productos";
        }
        model.addAttribute("producto", producto.get());
        
        return "update-productos";
    }
    
    @PostMapping("productos/editar/{id}")
    public String editarProducto(@PathVariable("id") Long id, @ModelAttribute("producto") Productos producto){
        producto.setId_Prod(id);
        proService.updateProducto(id, producto);
        
        return "redirect:/productos";
    }
    
    @GetMapping("/productos/eliminar/{id}")
    public String deleteProducto(@PathVariable("id") Long id){
        proService.deleteProducto(id);
        return "redirect:/productos";
    }
}
