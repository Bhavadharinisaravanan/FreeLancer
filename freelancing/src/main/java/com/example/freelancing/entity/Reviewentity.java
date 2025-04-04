package com.example.freelancing.entity;
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
@Table(name="reviews")

public class Reviewentity {
	@Id
	@Column(name="job_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int job_id;
	
	@Column(name="rater_id")
	private int rater_id ;
	
	@Column(name="ratee_id")
	private int ratee_id ;
	
	@Column(name="rating")
	private int rating ;
	
	@Column(name="review")
	private String review;

}
