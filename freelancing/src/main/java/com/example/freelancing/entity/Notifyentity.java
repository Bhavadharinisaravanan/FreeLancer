package com.example.freelancing.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emailnotify")
@Data
@NoArgsConstructor
public class Notifyentity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="receiver")
	private String receiver;
	@Column(name="subject")
	private String subject;
	@Column(name="body")
	private String body;
}
