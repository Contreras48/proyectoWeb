/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import java.util.List;
import javax.ejb.Local;
import proyecto.entidades.Ordenes;

/**
 *
 * @author samuel cruz
 */
@Local
public interface OrdenesFacadeLocal {

    void create(Ordenes ordenes);

    void edit(Ordenes ordenes);

    void remove(Ordenes ordenes);

    Ordenes find(Object id);

    List<Ordenes> findAll();

    List<Ordenes> findRange(int[] range);

    int count();
    
}
