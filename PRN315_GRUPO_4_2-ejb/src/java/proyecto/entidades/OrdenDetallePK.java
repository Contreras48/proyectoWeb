/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author samuel cruz
 */
@Embeddable
public class OrdenDetallePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "OrdenID")
    private int ordenID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductoID")
    private int productoID;

    public OrdenDetallePK() {
    }

    public OrdenDetallePK(int ordenID, int productoID) {
        this.ordenID = ordenID;
        this.productoID = productoID;
    }

    public int getOrdenID() {
        return ordenID;
    }

    public void setOrdenID(int ordenID) {
        this.ordenID = ordenID;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ordenID;
        hash += (int) productoID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenDetallePK)) {
            return false;
        }
        OrdenDetallePK other = (OrdenDetallePK) object;
        if (this.ordenID != other.ordenID) {
            return false;
        }
        if (this.productoID != other.productoID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.OrdenDetallePK[ ordenID=" + ordenID + ", productoID=" + productoID + " ]";
    }
    
}
