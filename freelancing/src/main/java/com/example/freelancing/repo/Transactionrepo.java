package com.example.freelancing.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.freelancing.entity.Transactionentity;
@Repository
public interface Transactionrepo extends JpaRepository<Transactionentity,Integer> {
	List<Transactionentity> findAll();

}
