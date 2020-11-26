package proyecto.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto.entidades.Empleados;
import proyecto.entidades.Region;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-25T16:54:09")
@StaticMetamodel(Territorios.class)
public class Territorios_ { 

    public static volatile ListAttribute<Territorios, Empleados> empleadosList;
    public static volatile SingularAttribute<Territorios, Region> regionID;
    public static volatile SingularAttribute<Territorios, String> territorioID;
    public static volatile SingularAttribute<Territorios, String> descripcionTerritorio;

}