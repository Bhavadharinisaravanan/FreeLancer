package com.example.freelancing.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.freelancing.entity.Userentity;

@Repository

public interface Userrepo extends JpaRepository<Userentity,Integer>{
	List<Userentity> findAll();
	List<Userentity> findByUsername(String username);
	List<Userentity> findByUsernameContains(String username);
	List<Userentity> findByUsernameIsContaining(String username);
	List<Userentity> findByUsernameContaining(String username);
	List<Userentity> findByUsernameStartingWith(String username);
	List<Userentity> findByUsernameEndingWith(String username);
	List<Userentity> findByUsernameNotContains(String username);
	List<Userentity> findByUsernameNotContaining(String username);
	List<Userentity> findByUsernameNotLike(String username);
}
