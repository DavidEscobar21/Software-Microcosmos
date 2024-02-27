package com.clases;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FacturasDevueltas.class)
public abstract class FacturasDevueltas_ {

	public static volatile SingularAttribute<FacturasDevueltas, String> descripcion;
	public static volatile SingularAttribute<FacturasDevueltas, Integer> idFacturaDevuelta;
	public static volatile SingularAttribute<FacturasDevueltas, Timestamp> fechaDevolucion;
	public static volatile SingularAttribute<FacturasDevueltas, Integer> idEmpleados;
	public static volatile SingularAttribute<FacturasDevueltas, Integer> idVenta;

}

