package proyecto.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto.entidades.Cliente;
import proyecto.entidades.Empleados;
import proyecto.entidades.OrdenDetalle;
import proyecto.entidades.Transportistas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-25T16:54:09")
@StaticMetamodel(Ordenes.class)
public class Ordenes_ { 

    public static volatile ListAttribute<Ordenes, OrdenDetalle> ordenDetalleList;
    public static volatile SingularAttribute<Ordenes, String> regionEnvio;
    public static volatile SingularAttribute<Ordenes, Empleados> empleadoID;
    public static volatile SingularAttribute<Ordenes, Integer> ordenID;
    public static volatile SingularAttribute<Ordenes, Date> fechaEnvio;
    public static volatile SingularAttribute<Ordenes, Cliente> clienteID;
    public static volatile SingularAttribute<Ordenes, Transportistas> trasportista;
    public static volatile SingularAttribute<Ordenes, String> ciudadEnvio;
    public static volatile SingularAttribute<Ordenes, String> codigoPostalEnvio;
    public static volatile SingularAttribute<Ordenes, String> paisEnvio;
    public static volatile SingularAttribute<Ordenes, Date> fechaEntrega;
    public static volatile SingularAttribute<Ordenes, String> nombreEnvio;
    public static volatile SingularAttribute<Ordenes, String> direccionEnvio;
    public static volatile SingularAttribute<Ordenes, Date> fechaOrden;
    public static volatile SingularAttribute<Ordenes, BigDecimal> flete;

}