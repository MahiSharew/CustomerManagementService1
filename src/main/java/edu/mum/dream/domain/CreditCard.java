package edu.mum.dream.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CreditCard")
public class CreditCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "creditcard_ID")
	private Long id;
    private String cardNumber;
    private String cardHolderName;
    private String expiryMonth;
    private String expiryYear;
    private String securityCode;

	
}
