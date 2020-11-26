/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import java.util.List;
import javax.ejb.Local;
import proyecto.entidades.Transportistas;

/**
 *
 * @author samuel cruz
 */
@Local
public interface TransportistasFacadeLocal {

    void create(Transportistas transportistas);

    void edit(Transportistas transportistas);

    void remove(Transportistas transportistas);

    Transportistas find(Object id);

    List<Transportistas> findAll();

    List<Transportistas> findRange(int[] range);

    int count();
    
    List<Transportistas> buscarTodoAlfabeticamente();
    
}
