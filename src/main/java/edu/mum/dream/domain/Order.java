package edu.mum.dream.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ORDER")
public class Order {
	 public enum OrderStatus {
	        Created, Processing, Paid, Finished, Cancelld
	    }
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orderId")
	private Long Id;
	private String userName;
	private Date timestamp;
	private OrderStatus orderStatus = OrderStatus.Created;
	

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "order")
	private List<CreditCard> creditCard;

	
}
