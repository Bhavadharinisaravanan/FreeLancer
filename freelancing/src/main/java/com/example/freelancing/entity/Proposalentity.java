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
@Table(name="proposals")
public class Proposalentity {
	
	@Id
	@Column(name="freelancer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int freelancer_id ;
	
	@Column(name="proposal_text")
	private String proposal_text;
	
	@Column(name="bid_amount")
	private int bid_amount;
	
	@Column(name="proposalstatus")
	private String proposalstatus;
	
	@Column(name="submitted_date")
	private Date submitted_date;
	
}
