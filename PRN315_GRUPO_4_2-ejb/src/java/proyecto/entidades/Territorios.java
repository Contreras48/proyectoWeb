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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "Territorios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Territorios.findAll", query = "SELECT t FROM Territorios t")
    , @NamedQuery(name = "Territorios.findByTerritorioID", query = "SELECT t FROM Territorios t WHERE t.territorioID = :territorioID")
    , @NamedQuery(name = "Territorios.findByDescripcionTerritorio", query = "SELECT t FROM Territorios t WHERE t.descripcionTerritorio = :descripcionTerritorio")})
public class Territorios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TerritorioID")
    private String territorioID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DescripcionTerritorio")
    private String descripcionTerritorio;
    @ManyToMany(mappedBy = "territoriosList", fetch = FetchType.LAZY)
    private List<Empleados> empleadosList;
    @JoinColumn(name = "RegionID", referencedColumnName = "RegionID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Region regionID;

    public Territorios() {
    }

    public Territorios(String territorioID) {
        this.territorioID = territorioID;
    }

    public Territorios(String territorioID, String descripcionTerritorio) {
        this.territorioID = territorioID;
        this.descripcionTerritorio = descripcionTerritorio;
    }

    public String getTerritorioID() {
        return territorioID;
    }

    public void setTerritorioID(String territorioID) {
        this.territorioID = territorioID;
    }

    public String getDescripcionTerritorio() {
        return descripcionTerritorio;
    }

    public void setDescripcionTerritorio(String descripcionTerritorio) {
        this.descripcionTerritorio = descripcionTerritorio;
    }

    @XmlTransient
    public List<Empleados> getEmpleadosList() {
        return empleadosList;
    }

    public void setEmpleadosList(List<Empleados> empleadosList) {
        this.empleadosList = empleadosList;
    }

    public Region getRegionID() {
        return regionID;
    }

    public void setRegionID(Region regionID) {
        this.regionID = regionID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (territorioID != null ? territorioID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Territorios)) {
            return false;
        }
        Territorios other = (Territorios) object;
        if ((this.territorioID == null && other.territorioID != null) || (this.territorioID != null && !this.territorioID.equals(other.territorioID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.Territorios[ territorioID=" + territorioID + " ]";
    }
    
}
