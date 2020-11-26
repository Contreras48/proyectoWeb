/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import proyecto.entidades.Transportistas;

/**
 *
 * @author samuel cruz
 */
@Stateless
public class TransportistasFacade extends AbstractFacade<Transportistas> implements TransportistasFacadeLocal {

    @PersistenceContext(unitName = "PRN315_GRUPO_4_2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransportistasFacade() {
        super(Transportistas.class);
    }

    @Override
    public List<Transportistas> buscarTodoAlfabeticamente() {
        try {
            em.getEntityManagerFactory().getCache().evictAll();                         //limipia la memoria
            String consulta = "SELECT * FROM [Transportistas] order by NombreEmpresa";  //Query de consulta
            Query query = em.createNativeQuery(consulta, Transportistas.class);         //Ejecución de consulta y converción de entidad
            List<Transportistas> listaResultado = query.getResultList();                //Pasando el resultado a lista
            return listaResultado;
        } catch (Exception e) {
            return null;
        }
    }
    
}
