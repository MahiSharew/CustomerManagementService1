package edu.mum.dream.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity 
@Table(name="MEMBR")
public class Member {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_id")
	private long id;
	
	@Column(length = 16)
	private String firstName;
	@Column(length = 16)
	private String lastName;
 	
	
	



	@OneToOne(fetch=FetchType.EAGER) 
 	@JoinColumn(name="memberId") 
 	UserCredentials userCredentials;
 	
 
	@OneToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name="memberId") 
    private Address addresses ;

 
  }
