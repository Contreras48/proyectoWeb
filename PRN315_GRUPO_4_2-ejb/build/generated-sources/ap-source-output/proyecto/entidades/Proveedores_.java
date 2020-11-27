package proyecto.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto.entidades.Productos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-27T11:39:20")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, Integer> proveedorID;
    public static volatile SingularAttribute<Proveedores, String> codigoPostal;
    public static volatile SingularAttribute<Proveedores, String> direccion;
    public static volatile ListAttribute<Proveedores, Productos> productosList;
    public static volatile SingularAttribute<Proveedores, String> puestoContacto;
    public static volatile SingularAttribute<Proveedores, String> homePage;
    public static volatile SingularAttribute<Proveedores, String> nombreEmpresa;
    public static volatile SingularAttribute<Proveedores, String> pais;
    public static volatile SingularAttribute<Proveedores, String> nombreContacto;
    public static volatile SingularAttribute<Proveedores, String> ciudad;
    public static volatile SingularAttribute<Proveedores, String> region;
    public static volatile SingularAttribute<Proveedores, String> telefono;
    public static volatile SingularAttribute<Proveedores, String> fax;

}