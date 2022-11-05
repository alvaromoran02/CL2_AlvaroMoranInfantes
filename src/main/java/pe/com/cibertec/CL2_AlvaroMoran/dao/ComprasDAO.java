/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.CL2_AlvaroMoran.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.CL2_AlvaroMoran.domain.Compras;

/**
 *
 * @author RYZEN
 */
@Repository
public interface ComprasDAO extends CrudRepository<Compras, Long>{
    @Query(value="insert into compras( IdCom, fechaCompra, montoTotal, IdUsu, Id) values (null,now(),?,2,?)", nativeQuery=true)
    public void createCompra(float monto, int idProducto);
    
    @Query(value="select c.Id_com, c.fecha_Compra, c.monto_Total, c.Id_Usu, c.Id_Prod, p.Nombre as nombre_producto from compras c inner join productos p on c.Id_Prod = p.Id_Prod where c.Id_Usu = 1;", nativeQuery=true)
    public List<Compras> getCompras();
    
    @Query(value="select c.Id_com, c.fecha_Compra, c.monto_Total, c.Id_Usu, c.Id_Prod, p.Nombre as nombre_producto from compras c inner join productos p on c.Id_Prod = p.Id_Prod", nativeQuery=true)
    public List<Compras> getComprasAdmin();
    
   //@Query(value="delete from compras where id_com = ?", nativeQuery=true)
    //public void deleteCompra(Long id_com);
}
