package org.jboss.jdf.example.ticketmonster.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TicketPrice.class)
public abstract class TicketPrice_ {

	public static volatile SingularAttribute<TicketPrice, Long> id;
	public static volatile SingularAttribute<TicketPrice, TicketCategory> ticketCategory;
	public static volatile SingularAttribute<TicketPrice, Float> price;
	public static volatile SingularAttribute<TicketPrice, Show> show;
	public static volatile SingularAttribute<TicketPrice, Section> section;

}

