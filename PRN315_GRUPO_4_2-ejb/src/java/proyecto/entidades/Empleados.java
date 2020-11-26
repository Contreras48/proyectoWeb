/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
@Table(name = "Empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findByEmpleadoID", query = "SELECT e FROM Empleados e WHERE e.empleadoID = :empleadoID")
    , @NamedQuery(name = "Empleados.findByNombres", query = "SELECT e FROM Empleados e WHERE e.nombres = :nombres")
    , @NamedQuery(name = "Empleados.findByApellidos", query = "SELECT e FROM Empleados e WHERE e.apellidos = :apellidos")
    , @NamedQuery(name = "Empleados.findByPuesto", query = "SELECT e FROM Empleados e WHERE e.puesto = :puesto")
    , @NamedQuery(name = "Empleados.findByPuestoNominal", query = "SELECT e FROM Empleados e WHERE e.puestoNominal = :puestoNominal")
    , @NamedQuery(name = "Empleados.findByFechaNacimiento", query = "SELECT e FROM Empleados e WHERE e.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Empleados.findByFechaContratacion", query = "SELECT e FROM Empleados e WHERE e.fechaContratacion = :fechaContratacion")
    , @NamedQuery(name = "Empleados.findByDireccion", query = "SELECT e FROM Empleados e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Empleados.findByCiudad", query = "SELECT e FROM Empleados e WHERE e.ciudad = :ciudad")
    , @NamedQuery(name = "Empleados.findByRegion", query = "SELECT e FROM Empleados e WHERE e.region = :region")
    , @NamedQuery(name = "Empleados.findByCodigoPostal", query = "SELECT e FROM Empleados e WHERE e.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Empleados.findByPais", query = "SELECT e FROM Empleados e WHERE e.pais = :pais")
    , @NamedQuery(name = "Empleados.findByTelefonoCasa", query = "SELECT e FROM Empleados e WHERE e.telefonoCasa = :telefonoCasa")
    , @NamedQuery(name = "Empleados.findByExtension", query = "SELECT e FROM Empleados e WHERE e.extension = :extension")
    , @NamedQuery(name = "Empleados.findByNotas", query = "SELECT e FROM Empleados e WHERE e.notas = :notas")
    , @NamedQuery(name = "Empleados.findByUbicacionFoto", query = "SELECT e FROM Empleados e WHERE e.ubicacionFoto = :ubicacionFoto")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmpleadoID")
    private Integer empleadoID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Apellidos")
    private String apellidos;
    @Size(max = 30)
    @Column(name = "Puesto")
    private String puesto;
    @Size(max = 25)
    @Column(name = "PuestoNominal")
    private String puestoNominal;
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "FechaContratacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContratacion;
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
    @Column(name = "TelefonoCasa")
    private String telefonoCasa;
    @Size(max = 4)
    @Column(name = "Extension")
    private String extension;
    @Lob
    @Column(name = "Foto")
    private byte[] foto;
    @Size(max = 1073741823)
    @Column(name = "Notas")
    private String notas;
    @Size(max = 255)
    @Column(name = "UbicacionFoto")
    private String ubicacionFoto;
    @JoinTable(name = "EmpleadoTerritorio", joinColumns = {
        @JoinColumn(name = "EmpleadoID", referencedColumnName = "EmpleadoID")}, inverseJoinColumns = {
        @JoinColumn(name = "TerritorioID", referencedColumnName = "TerritorioID")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Territorios> territoriosList;
    @OneToMany(mappedBy = "jefeInmediato", fetch = FetchType.LAZY)
    private List<Empleados> empleadosList;
    @JoinColumn(name = "JefeInmediato", referencedColumnName = "EmpleadoID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empleados jefeInmediato;
    @OneToMany(mappedBy = "empleadoID", fetch = FetchType.LAZY)
    private List<Ordenes> ordenesList;

    public Empleados() {
    }

    public Empleados(Integer empleadoID) {
        this.empleadoID = empleadoID;
    }

    public Empleados(Integer empleadoID, String nombres, String apellidos) {
        this.empleadoID = empleadoID;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Integer getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(Integer empleadoID) {
        this.empleadoID = empleadoID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuestoNominal() {
        return puestoNominal;
    }

    public void setPuestoNominal(String puestoNominal) {
        this.puestoNominal = puestoNominal;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
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

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getUbicacionFoto() {
        return ubicacionFoto;
    }

    public void setUbicacionFoto(String ubicacionFoto) {
        this.ubicacionFoto = ubicacionFoto;
    }

    @XmlTransient
    public List<Territorios> getTerritoriosList() {
        return territoriosList;
    }

    public void setTerritoriosList(List<Territorios> territoriosList) {
        this.territoriosList = territoriosList;
    }

    @XmlTransient
    public List<Empleados> getEmpleadosList() {
        return empleadosList;
    }

    public void setEmpleadosList(List<Empleados> empleadosList) {
        this.empleadosList = empleadosList;
    }

    public Empleados getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(Empleados jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
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
        hash += (empleadoID != null ? empleadoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.empleadoID == null && other.empleadoID != null) || (this.empleadoID != null && !this.empleadoID.equals(other.empleadoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.Empleados[ empleadoID=" + empleadoID + " ]";
    }
    
}
