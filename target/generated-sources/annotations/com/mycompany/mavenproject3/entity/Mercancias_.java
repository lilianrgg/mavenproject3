package com.mycompany.mavenproject3.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-31T19:27:40")
@StaticMetamodel(Mercancias.class)
public class Mercancias_ { 

    public static volatile SingularAttribute<Mercancias, Integer> id;
    public static volatile SingularAttribute<Mercancias, String> direccion;
    public static volatile SingularAttribute<Mercancias, String> estadoEnvio;
    public static volatile SingularAttribute<Mercancias, Integer> precio;
    public static volatile SingularAttribute<Mercancias, Integer> destinatarioId;
    public static volatile SingularAttribute<Mercancias, Integer> usuarioRegistroId;
    public static volatile SingularAttribute<Mercancias, String> ciudadDestino;
    public static volatile SingularAttribute<Mercancias, Date> fechaSalida;
    public static volatile SingularAttribute<Mercancias, String> nombreProducto;

}