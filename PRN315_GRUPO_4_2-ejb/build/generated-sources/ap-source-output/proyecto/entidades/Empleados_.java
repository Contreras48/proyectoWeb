package proyecto.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto.entidades.Empleados;
import proyecto.entidades.Ordenes;
import proyecto.entidades.Territorios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-25T16:54:09")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, String> apellidos;
    public static volatile SingularAttribute<Empleados, String> extension;
    public static volatile SingularAttribute<Empleados, String> ubicacionFoto;
    public static volatile SingularAttribute<Empleados, String> codigoPostal;
    public static volatile ListAttribute<Empleados, Empleados> empleadosList;
    public static volatile SingularAttribute<Empleados, Date> fechaNacimiento;
    public static volatile SingularAttribute<Empleados, Integer> empleadoID;
    public static volatile SingularAttribute<Empleados, String> notas;
    public static volatile SingularAttribute<Empleados, Empleados> jefeInmediato;
    public static volatile SingularAttribute<Empleados, String> direccion;
    public static volatile SingularAttribute<Empleados, String> nombres;
    public static volatile SingularAttribute<Empleados, String> puestoNominal;
    public static volatile SingularAttribute<Empleados, String> pais;
    public static volatile SingularAttribute<Empleados, String> puesto;
    public static volatile SingularAttribute<Empleados, String> telefonoCasa;
    public static volatile SingularAttribute<Empleados, byte[]> foto;
    public static volatile ListAttribute<Empleados, Territorios> territoriosList;
    public static volatile SingularAttribute<Empleados, String> ciudad;
    public static volatile SingularAttribute<Empleados, Date> fechaContratacion;
    public static volatile ListAttribute<Empleados, Ordenes> ordenesList;
    public static volatile SingularAttribute<Empleados, String> region;

}