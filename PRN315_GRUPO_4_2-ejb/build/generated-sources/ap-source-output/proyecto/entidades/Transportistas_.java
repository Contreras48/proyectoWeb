package proyecto.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto.entidades.Ordenes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-27T11:39:20")
@StaticMetamodel(Transportistas.class)
public class Transportistas_ { 

    public static volatile ListAttribute<Transportistas, Ordenes> ordenesList;
    public static volatile SingularAttribute<Transportistas, String> telefono;
    public static volatile SingularAttribute<Transportistas, String> nombreEmpresa;
    public static volatile SingularAttribute<Transportistas, Integer> transportistaID;

}