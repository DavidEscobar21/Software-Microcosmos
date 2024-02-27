package com.clases;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PedidosDevueltos.class)
public abstract class PedidosDevueltos_ {

	public static volatile SingularAttribute<PedidosDevueltos, String> descripcion;
	public static volatile SingularAttribute<PedidosDevueltos, Integer> idPedidosDevueltos;
	public static volatile SingularAttribute<PedidosDevueltos, Integer> idCompra;
	public static volatile SingularAttribute<PedidosDevueltos, Integer> idEmpleados;
	public static volatile SingularAttribute<PedidosDevueltos, Timestamp> fechaAnulacion;

}

