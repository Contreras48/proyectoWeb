package proyecto.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto.entidades.OrdenDetallePK;
import proyecto.entidades.Ordenes;
import proyecto.entidades.Productos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-27T11:39:20")
@StaticMetamodel(OrdenDetalle.class)
public class OrdenDetalle_ { 

    public static volatile SingularAttribute<OrdenDetalle, BigDecimal> precioUnitario;
    public static volatile SingularAttribute<OrdenDetalle, Ordenes> ordenes;
    public static volatile SingularAttribute<OrdenDetalle, Float> descuento;
    public static volatile SingularAttribute<OrdenDetalle, OrdenDetallePK> ordenDetallePK;
    public static volatile SingularAttribute<OrdenDetalle, Short> cantidad;
    public static volatile SingularAttribute<OrdenDetalle, Productos> productos;

}