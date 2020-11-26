/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import java.util.List;
import javax.ejb.Local;
import proyecto.entidades.OrdenDetalle;

/**
 *
 * @author samuel cruz
 */
@Local
public interface OrdenDetalleFacadeLocal {

    void create(OrdenDetalle ordenDetalle);

    void edit(OrdenDetalle ordenDetalle);

    void remove(OrdenDetalle ordenDetalle);

    OrdenDetalle find(Object id);

    List<OrdenDetalle> findAll();

    List<OrdenDetalle> findRange(int[] range);

    int count();
    
}
