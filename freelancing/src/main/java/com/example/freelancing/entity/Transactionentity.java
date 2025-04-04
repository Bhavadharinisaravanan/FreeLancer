package com.example.freelancing.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Data
@Getter
@Setter
@Table(name="transactions")
public class Transactionentity {
	@Id
	@Column(name="client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int client_id ;
	
	@Column(name="freelancer_id")
	private int freelancer_id ;
	
	
	@Column(name="transaction_id")
	private int transaction_id;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="paystatus")
	private String paystatus;
	
	@Column(name="payment_date")
	private Date payment_date;
	
	

}
