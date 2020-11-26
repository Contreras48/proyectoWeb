/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author samuel cruz
 */
@Entity
@Table(name = "Orden_Detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenDetalle.findAll", query = "SELECT o FROM OrdenDetalle o")
    , @NamedQuery(name = "OrdenDetalle.findByOrdenID", query = "SELECT o FROM OrdenDetalle o WHERE o.ordenDetallePK.ordenID = :ordenID")
    , @NamedQuery(name = "OrdenDetalle.findByProductoID", query = "SELECT o FROM OrdenDetalle o WHERE o.ordenDetallePK.productoID = :productoID")
    , @NamedQuery(name = "OrdenDetalle.findByPrecioUnitario", query = "SELECT o FROM OrdenDetalle o WHERE o.precioUnitario = :precioUnitario")
    , @NamedQuery(name = "OrdenDetalle.findByCantidad", query = "SELECT o FROM OrdenDetalle o WHERE o.cantidad = :cantidad")
    , @NamedQuery(name = "OrdenDetalle.findByDescuento", query = "SELECT o FROM OrdenDetalle o WHERE o.descuento = :descuento")})
public class OrdenDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdenDetallePK ordenDetallePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PrecioUnitario")
    private BigDecimal precioUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cantidad")
    private short cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Descuento")
    private float descuento;
    @JoinColumn(name = "OrdenID", referencedColumnName = "OrdenID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ordenes ordenes;
    @JoinColumn(name = "ProductoID", referencedColumnName = "ProductoID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Productos productos;

    public OrdenDetalle() {
    }

    public OrdenDetalle(OrdenDetallePK ordenDetallePK) {
        this.ordenDetallePK = ordenDetallePK;
    }

    public OrdenDetalle(OrdenDetallePK ordenDetallePK, BigDecimal precioUnitario, short cantidad, float descuento) {
        this.ordenDetallePK = ordenDetallePK;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public OrdenDetalle(int ordenID, int productoID) {
        this.ordenDetallePK = new OrdenDetallePK(ordenID, productoID);
    }

    public OrdenDetallePK getOrdenDetallePK() {
        return ordenDetallePK;
    }

    public void setOrdenDetallePK(OrdenDetallePK ordenDetallePK) {
        this.ordenDetallePK = ordenDetallePK;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public Ordenes getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(Ordenes ordenes) {
        this.ordenes = ordenes;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordenDetallePK != null ? ordenDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenDetalle)) {
            return false;
        }
        OrdenDetalle other = (OrdenDetalle) object;
        if ((this.ordenDetallePK == null && other.ordenDetallePK != null) || (this.ordenDetallePK != null && !this.ordenDetallePK.equals(other.ordenDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.OrdenDetalle[ ordenDetallePK=" + ordenDetallePK + " ]";
    }
    
}
