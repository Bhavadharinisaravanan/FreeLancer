package com.example.freelancing.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.freelancing.entity.Proposalentity;
@Repository
public interface Proposalrepo extends JpaRepository<Proposalentity,Integer> {
	List<Proposalentity> findAll();
}
