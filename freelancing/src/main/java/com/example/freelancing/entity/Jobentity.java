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
@Table(name="job1")
public class Jobentity {
	@Id
	@Column(name="job_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int job_id;
	
	@Column(name="client_id")
	private int client_id ;
	
	@Column(name="title")
	private String title;
	
	@Column(name="budget")
	private int budget;
	
	@Column(name="status")
	private String status;
	
	@Column(name="posted_date")
	private Date posted_date;
}
