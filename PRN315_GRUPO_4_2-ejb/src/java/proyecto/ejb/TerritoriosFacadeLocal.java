/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import java.util.List;
import javax.ejb.Local;
import proyecto.entidades.Territorios;

/**
 *
 * @author samuel cruz
 */
@Local
public interface TerritoriosFacadeLocal {

    void create(Territorios territorios);

    void edit(Territorios territorios);

    void remove(Territorios territorios);

    Territorios find(Object id);

    List<Territorios> findAll();

    List<Territorios> findRange(int[] range);

    int count();
    
}
