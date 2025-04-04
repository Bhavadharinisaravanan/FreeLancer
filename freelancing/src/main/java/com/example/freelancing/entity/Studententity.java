package com.example.freelancing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Studententity {
	@Id
    @Column(name="roll_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int roll_id;
    @Column(name="Name")
    private String name;
    @Column(name="Department")
    private String dept;
    @Column(name="Address")
    private String address;
	

}
