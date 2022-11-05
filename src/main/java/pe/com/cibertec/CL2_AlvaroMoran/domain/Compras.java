/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author RYZEN
 */
@Data
@Entity
@Table(name="compras")
public class Compras implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Com")
    private Long id_com;
    @Column(name="fecha_Compra")
    private Date fecha;
    @Column(name="monto_Total")
    private float monto;
    @Column(name="Id_Usu")
    private int id_usu;
    @Column(name="Id_Prod")
    private int id_pro;
    
    /*private String nombre_producto;*/
    
}
