/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "Proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")
    , @NamedQuery(name = "Proveedores.findByProveedorID", query = "SELECT p FROM Proveedores p WHERE p.proveedorID = :proveedorID")
    , @NamedQuery(name = "Proveedores.findByNombreEmpresa", query = "SELECT p FROM Proveedores p WHERE p.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "Proveedores.findByNombreContacto", query = "SELECT p FROM Proveedores p WHERE p.nombreContacto = :nombreContacto")
    , @NamedQuery(name = "Proveedores.findByPuestoContacto", query = "SELECT p FROM Proveedores p WHERE p.puestoContacto = :puestoContacto")
    , @NamedQuery(name = "Proveedores.findByDireccion", query = "SELECT p FROM Proveedores p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Proveedores.findByCiudad", query = "SELECT p FROM Proveedores p WHERE p.ciudad = :ciudad")
    , @NamedQuery(name = "Proveedores.findByRegion", query = "SELECT p FROM Proveedores p WHERE p.region = :region")
    , @NamedQuery(name = "Proveedores.findByCodigoPostal", query = "SELECT p FROM Proveedores p WHERE p.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Proveedores.findByPais", query = "SELECT p FROM Proveedores p WHERE p.pais = :pais")
    , @NamedQuery(name = "Proveedores.findByTelefono", query = "SELECT p FROM Proveedores p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Proveedores.findByFax", query = "SELECT p FROM Proveedores p WHERE p.fax = :fax")
    , @NamedQuery(name = "Proveedores.findByHomePage", query = "SELECT p FROM Proveedores p WHERE p.homePage = :homePage")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProveedorID")
    private Integer proveedorID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NombreEmpresa")
    private String nombreEmpresa;
    @Size(max = 30)
    @Column(name = "NombreContacto")
    private String nombreContacto;
    @Size(max = 30)
    @Column(name = "PuestoContacto")
    private String puestoContacto;
    @Size(max = 60)
    @Column(name = "Direccion")
    private String direccion;
    @Size(max = 15)
    @Column(name = "Ciudad")
    private String ciudad;
    @Size(max = 15)
    @Column(name = "Region")
    private String region;
    @Size(max = 10)
    @Column(name = "CodigoPostal")
    private String codigoPostal;
    @Size(max = 15)
    @Column(name = "Pais")
    private String pais;
    @Size(max = 24)
    @Column(name = "Telefono")
    private String telefono;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 24)
    @Column(name = "Fax")
    private String fax;
    @Size(max = 1073741823)
    @Column(name = "HomePage")
    private String homePage;
    @OneToMany(mappedBy = "proveedorID", fetch = FetchType.LAZY)
    private List<Productos> productosList;

    public Proveedores() {
    }

    public Proveedores(Integer proveedorID) {
        this.proveedorID = proveedorID;
    }

    public Proveedores(Integer proveedorID, String nombreEmpresa) {
        this.proveedorID = proveedorID;
        this.nombreEmpresa = nombreEmpresa;
    }

    public Integer getProveedorID() {
        return proveedorID;
    }

    public void setProveedorID(Integer proveedorID) {
        this.proveedorID = proveedorID;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getPuestoContacto() {
        return puestoContacto;
    }

    public void setPuestoContacto(String puestoContacto) {
        this.puestoContacto = puestoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @XmlTransient
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proveedorID != null ? proveedorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.proveedorID == null && other.proveedorID != null) || (this.proveedorID != null && !this.proveedorID.equals(other.proveedorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.Proveedores[ proveedorID=" + proveedorID + " ]";
    }
    
}
