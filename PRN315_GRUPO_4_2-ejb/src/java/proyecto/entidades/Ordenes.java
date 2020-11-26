/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author samuel cruz
 */
@Entity
@Table(name = "Ordenes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordenes.findAll", query = "SELECT o FROM Ordenes o")
    , @NamedQuery(name = "Ordenes.findByOrdenID", query = "SELECT o FROM Ordenes o WHERE o.ordenID = :ordenID")
    , @NamedQuery(name = "Ordenes.findByFechaOrden", query = "SELECT o FROM Ordenes o WHERE o.fechaOrden = :fechaOrden")
    , @NamedQuery(name = "Ordenes.findByFechaEntrega", query = "SELECT o FROM Ordenes o WHERE o.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "Ordenes.findByFechaEnvio", query = "SELECT o FROM Ordenes o WHERE o.fechaEnvio = :fechaEnvio")
    , @NamedQuery(name = "Ordenes.findByFlete", query = "SELECT o FROM Ordenes o WHERE o.flete = :flete")
    , @NamedQuery(name = "Ordenes.findByNombreEnvio", query = "SELECT o FROM Ordenes o WHERE o.nombreEnvio = :nombreEnvio")
    , @NamedQuery(name = "Ordenes.findByDireccionEnvio", query = "SELECT o FROM Ordenes o WHERE o.direccionEnvio = :direccionEnvio")
    , @NamedQuery(name = "Ordenes.findByCiudadEnvio", query = "SELECT o FROM Ordenes o WHERE o.ciudadEnvio = :ciudadEnvio")
    , @NamedQuery(name = "Ordenes.findByRegionEnvio", query = "SELECT o FROM Ordenes o WHERE o.regionEnvio = :regionEnvio")
    , @NamedQuery(name = "Ordenes.findByCodigoPostalEnvio", query = "SELECT o FROM Ordenes o WHERE o.codigoPostalEnvio = :codigoPostalEnvio")
    , @NamedQuery(name = "Ordenes.findByPaisEnvio", query = "SELECT o FROM Ordenes o WHERE o.paisEnvio = :paisEnvio")})
public class Ordenes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrdenID")
    private Integer ordenID;
    @Column(name = "FechaOrden")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOrden;
    @Column(name = "FechaEntrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Column(name = "FechaEnvio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEnvio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Flete")
    private BigDecimal flete;
    @Size(max = 40)
    @Column(name = "NombreEnvio")
    private String nombreEnvio;
    @Size(max = 60)
    @Column(name = "DireccionEnvio")
    private String direccionEnvio;
    @Size(max = 15)
    @Column(name = "CiudadEnvio")
    private String ciudadEnvio;
    @Size(max = 15)
    @Column(name = "RegionEnvio")
    private String regionEnvio;
    @Size(max = 10)
    @Column(name = "CodigoPostalEnvio")
    private String codigoPostalEnvio;
    @Size(max = 15)
    @Column(name = "PaisEnvio")
    private String paisEnvio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenes", fetch = FetchType.LAZY)
    private List<OrdenDetalle> ordenDetalleList;
    @JoinColumn(name = "ClienteID", referencedColumnName = "ClienteID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente clienteID;
    @JoinColumn(name = "EmpleadoID", referencedColumnName = "EmpleadoID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empleados empleadoID;
    @JoinColumn(name = "Trasportista", referencedColumnName = "TransportistaID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Transportistas trasportista;

    public Ordenes() {
    }

    public Ordenes(Integer ordenID) {
        this.ordenID = ordenID;
    }

    public Integer getOrdenID() {
        return ordenID;
    }

    public void setOrdenID(Integer ordenID) {
        this.ordenID = ordenID;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public BigDecimal getFlete() {
        return flete;
    }

    public void setFlete(BigDecimal flete) {
        this.flete = flete;
    }

    public String getNombreEnvio() {
        return nombreEnvio;
    }

    public void setNombreEnvio(String nombreEnvio) {
        this.nombreEnvio = nombreEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getCiudadEnvio() {
        return ciudadEnvio;
    }

    public void setCiudadEnvio(String ciudadEnvio) {
        this.ciudadEnvio = ciudadEnvio;
    }

    public String getRegionEnvio() {
        return regionEnvio;
    }

    public void setRegionEnvio(String regionEnvio) {
        this.regionEnvio = regionEnvio;
    }

    public String getCodigoPostalEnvio() {
        return codigoPostalEnvio;
    }

    public void setCodigoPostalEnvio(String codigoPostalEnvio) {
        this.codigoPostalEnvio = codigoPostalEnvio;
    }

    public String getPaisEnvio() {
        return paisEnvio;
    }

    public void setPaisEnvio(String paisEnvio) {
        this.paisEnvio = paisEnvio;
    }

    @XmlTransient
    public List<OrdenDetalle> getOrdenDetalleList() {
        return ordenDetalleList;
    }

    public void setOrdenDetalleList(List<OrdenDetalle> ordenDetalleList) {
        this.ordenDetalleList = ordenDetalleList;
    }

    public Cliente getClienteID() {
        return clienteID;
    }

    public void setClienteID(Cliente clienteID) {
        this.clienteID = clienteID;
    }

    public Empleados getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(Empleados empleadoID) {
        this.empleadoID = empleadoID;
    }

    public Transportistas getTrasportista() {
        return trasportista;
    }

    public void setTrasportista(Transportistas trasportista) {
        this.trasportista = trasportista;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordenID != null ? ordenID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordenes)) {
            return false;
        }
        Ordenes other = (Ordenes) object;
        if ((this.ordenID == null && other.ordenID != null) || (this.ordenID != null && !this.ordenID.equals(other.ordenID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.Ordenes[ ordenID=" + ordenID + " ]";
    }
    
}
