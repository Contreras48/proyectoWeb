/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author samuel cruz
 */
@Entity
@Table(name = "Productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByProductoID", query = "SELECT p FROM Productos p WHERE p.productoID = :productoID")
    , @NamedQuery(name = "Productos.findByNombreProducto", query = "SELECT p FROM Productos p WHERE p.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "Productos.findByCantidadPorUnidad", query = "SELECT p FROM Productos p WHERE p.cantidadPorUnidad = :cantidadPorUnidad")
    , @NamedQuery(name = "Productos.findByPrecioUnitario", query = "SELECT p FROM Productos p WHERE p.precioUnitario = :precioUnitario")
    , @NamedQuery(name = "Productos.findByUnidadesEnAlmacen", query = "SELECT p FROM Productos p WHERE p.unidadesEnAlmacen = :unidadesEnAlmacen")
    , @NamedQuery(name = "Productos.findByUnidadesPorOrden", query = "SELECT p FROM Productos p WHERE p.unidadesPorOrden = :unidadesPorOrden")
    , @NamedQuery(name = "Productos.findByNivelImportancia", query = "SELECT p FROM Productos p WHERE p.nivelImportancia = :nivelImportancia")
    , @NamedQuery(name = "Productos.findByDiscontinuado", query = "SELECT p FROM Productos p WHERE p.discontinuado = :discontinuado")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductoID")
    private Integer productoID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NombreProducto")
    private String nombreProducto;
    @Size(max = 20)
    @Column(name = "CantidadPorUnidad")
    private String cantidadPorUnidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PrecioUnitario")
    private BigDecimal precioUnitario;
    @Column(name = "UnidadesEnAlmacen")
    private Short unidadesEnAlmacen;
    @Column(name = "UnidadesPorOrden")
    private Short unidadesPorOrden;
    @Column(name = "NivelImportancia")
    private Short nivelImportancia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Discontinuado")
    private boolean discontinuado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productos", fetch = FetchType.LAZY)
    private List<OrdenDetalle> ordenDetalleList;
    @JoinColumn(name = "CategoriaID", referencedColumnName = "CategoriaID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Categorias categoriaID;
    @JoinColumn(name = "ProveedorID", referencedColumnName = "ProveedorID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedores proveedorID;

    public Productos() {
    }

    public Productos(Integer productoID) {
        this.productoID = productoID;
    }

    public Productos(Integer productoID, String nombreProducto, boolean discontinuado) {
        this.productoID = productoID;
        this.nombreProducto = nombreProducto;
        this.discontinuado = discontinuado;
    }

    public Integer getProductoID() {
        return productoID;
    }

    public void setProductoID(Integer productoID) {
        this.productoID = productoID;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCantidadPorUnidad() {
        return cantidadPorUnidad;
    }

    public void setCantidadPorUnidad(String cantidadPorUnidad) {
        this.cantidadPorUnidad = cantidadPorUnidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Short getUnidadesEnAlmacen() {
        return unidadesEnAlmacen;
    }

    public void setUnidadesEnAlmacen(Short unidadesEnAlmacen) {
        this.unidadesEnAlmacen = unidadesEnAlmacen;
    }

    public Short getUnidadesPorOrden() {
        return unidadesPorOrden;
    }

    public void setUnidadesPorOrden(Short unidadesPorOrden) {
        this.unidadesPorOrden = unidadesPorOrden;
    }

    public Short getNivelImportancia() {
        return nivelImportancia;
    }

    public void setNivelImportancia(Short nivelImportancia) {
        this.nivelImportancia = nivelImportancia;
    }

    public boolean getDiscontinuado() {
        return discontinuado;
    }

    public void setDiscontinuado(boolean discontinuado) {
        this.discontinuado = discontinuado;
    }

    @XmlTransient
    public List<OrdenDetalle> getOrdenDetalleList() {
        return ordenDetalleList;
    }

    public void setOrdenDetalleList(List<OrdenDetalle> ordenDetalleList) {
        this.ordenDetalleList = ordenDetalleList;
    }

    public Categorias getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(Categorias categoriaID) {
        this.categoriaID = categoriaID;
    }

    public Proveedores getProveedorID() {
        return proveedorID;
    }

    public void setProveedorID(Proveedores proveedorID) {
        this.proveedorID = proveedorID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoID != null ? productoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.productoID == null && other.productoID != null) || (this.productoID != null && !this.productoID.equals(other.productoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.Productos[ productoID=" + productoID + " ]";
    }
    
}
