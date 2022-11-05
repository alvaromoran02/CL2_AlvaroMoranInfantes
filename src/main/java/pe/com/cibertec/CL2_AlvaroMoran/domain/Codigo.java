/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author RYZEN
 */
@Entity
public class Codigo {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Long Id;
    public String CodProd;
    public String Nombre;
    public double Precio;
    public String ImgP;
    public String Marca;
    public String Descipcion;
}
