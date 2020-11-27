/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author samuel cruz
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(proyecto.service.CategoriasFacadeREST.class);
        resources.add(proyecto.service.ClienteFacadeREST.class);
        resources.add(proyecto.service.EmpleadosFacadeREST.class);
        resources.add(proyecto.service.OrdenDetalleFacadeREST.class);
        resources.add(proyecto.service.OrdenesFacadeREST.class);
        resources.add(proyecto.service.ProductosFacadeREST.class);
        resources.add(proyecto.service.ProveedoresFacadeREST.class);
        resources.add(proyecto.service.RegionFacadeREST.class);
        resources.add(proyecto.service.TerritoriosFacadeREST.class);
        resources.add(proyecto.service.TipoClienteFacadeREST.class);
        resources.add(proyecto.service.TransportistasFacadeREST.class);
    }
    
}
