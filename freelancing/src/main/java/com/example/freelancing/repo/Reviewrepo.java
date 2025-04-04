package com.example.freelancing.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.freelancing.entity.Reviewentity;
@Repository
public interface Reviewrepo extends JpaRepository<Reviewentity,Integer>{
	List<Reviewentity> findAll();

}
