package proyecto.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto.entidades.Ordenes;
import proyecto.entidades.TipoCliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-27T11:39:20")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> codigoPostal;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> puestoContacto;
    public static volatile ListAttribute<Cliente, TipoCliente> tipoClienteList;
    public static volatile SingularAttribute<Cliente, String> nombreEmpresa;
    public static volatile SingularAttribute<Cliente, String> pais;
    public static volatile SingularAttribute<Cliente, String> nombreContacto;
    public static volatile SingularAttribute<Cliente, String> clienteID;
    public static volatile SingularAttribute<Cliente, String> ciudad;
    public static volatile ListAttribute<Cliente, Ordenes> ordenesList;
    public static volatile SingularAttribute<Cliente, String> region;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> fax;

}