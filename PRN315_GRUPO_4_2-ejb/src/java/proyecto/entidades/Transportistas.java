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
@Table(name = "Transportistas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transportistas.findAll", query = "SELECT t FROM Transportistas t")
    , @NamedQuery(name = "Transportistas.findByTransportistaID", query = "SELECT t FROM Transportistas t WHERE t.transportistaID = :transportistaID")
    , @NamedQuery(name = "Transportistas.findByNombreEmpresa", query = "SELECT t FROM Transportistas t WHERE t.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "Transportistas.findByTelefono", query = "SELECT t FROM Transportistas t WHERE t.telefono = :telefono")})
public class Transportistas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TransportistaID")
    private Integer transportistaID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NombreEmpresa")
    private String nombreEmpresa;
    @Size(max = 24)
    @Column(name = "Telefono")
    private String telefono;
    @OneToMany(mappedBy = "trasportista", fetch = FetchType.LAZY)
    private List<Ordenes> ordenesList;

    public Transportistas() {
    }

    public Transportistas(Integer transportistaID) {
        this.transportistaID = transportistaID;
    }

    public Transportistas(Integer transportistaID, String nombreEmpresa) {
        this.transportistaID = transportistaID;
        this.nombreEmpresa = nombreEmpresa;
    }

    public Integer getTransportistaID() {
        return transportistaID;
    }

    public void setTransportistaID(Integer transportistaID) {
        this.transportistaID = transportistaID;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public List<Ordenes> getOrdenesList() {
        return ordenesList;
    }

    public void setOrdenesList(List<Ordenes> ordenesList) {
        this.ordenesList = ordenesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transportistaID != null ? transportistaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transportistas)) {
            return false;
        }
        Transportistas other = (Transportistas) object;
        if ((this.transportistaID == null && other.transportistaID != null) || (this.transportistaID != null && !this.transportistaID.equals(other.transportistaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.Transportistas[ transportistaID=" + transportistaID + " ]";
    }
    
}
