package com.example.freelancing.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.freelancing.entity.Jobentity;

@Repository
public interface Jobrepo extends JpaRepository<Jobentity,Integer>{
	List<Jobentity> findAll();
	
	
}
