/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.form;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import proyecto.entidades.Transportistas;

/**
 *
 * @author samuel cruz
 */
@Named(value = "transportistaForm")
@SessionScoped
public class TransportistaForm implements Serializable {
    private Transportistas transportista;

    /**
     * Creates a new instance of TransportistaForm
     */
    public TransportistaForm() {
    }
    
    @PostConstruct
    public void init() {
        try {
            //Codigo de inicializacion de formulario
        } catch (Exception e) {
        }   
    }
    
    public Transportistas getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportistas transportista) {
        this.transportista = transportista;
    }
    
}
