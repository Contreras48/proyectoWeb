/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;
import proyecto.entidades.OrdenDetalle;
import proyecto.entidades.OrdenDetallePK;

/**
 *
 * @author samuel cruz
 */
@Stateless
@Path("proyecto.entidades.ordendetalle")
public class OrdenDetalleFacadeREST extends AbstractFacade<OrdenDetalle> {

    @PersistenceContext(unitName = "PRN315_GRUPO_4_2-warPU")
    private EntityManager em;

    private OrdenDetallePK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;ordenID=ordenIDValue;productoID=productoIDValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        proyecto.entidades.OrdenDetallePK key = new proyecto.entidades.OrdenDetallePK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> ordenID = map.get("ordenID");
        if (ordenID != null && !ordenID.isEmpty()) {
            key.setOrdenID(new java.lang.Integer(ordenID.get(0)));
        }
        java.util.List<String> productoID = map.get("productoID");
        if (productoID != null && !productoID.isEmpty()) {
            key.setProductoID(new java.lang.Integer(productoID.get(0)));
        }
        return key;
    }

    public OrdenDetalleFacadeREST() {
        super(OrdenDetalle.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(OrdenDetalle entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, OrdenDetalle entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        proyecto.entidades.OrdenDetallePK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public OrdenDetalle find(@PathParam("id") PathSegment id) {
        proyecto.entidades.OrdenDetallePK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<OrdenDetalle> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<OrdenDetalle> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
