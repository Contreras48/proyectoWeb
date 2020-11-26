/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import proyecto.entidades.Territorios;

/**
 *
 * @author samuel cruz
 */
@Stateless
public class TerritoriosFacade extends AbstractFacade<Territorios> implements TerritoriosFacadeLocal {

    @PersistenceContext(unitName = "PRN315_GRUPO_4_2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TerritoriosFacade() {
        super(Territorios.class);
    }
    
}
