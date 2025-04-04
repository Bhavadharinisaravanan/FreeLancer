package com.example.freelancing.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.freelancing.entity.Userentity;
import com.example.freelancing.repo.Userrepo;
@Service
public class Freelanceservice {
	@Autowired 
	Userrepo rep;
	
	public List<Userentity> getall()
	{
		return rep.findAll();
	}
	
	public Userentity post(Userentity user)
	{
		return rep.save(user);
	}   
	public String deleteId(int id) {
		if(rep.existsById(id)) {
			rep.deleteById(id);
			return "Value Deleted Successfully";
		}
		else
		{
		    return "Value not Found"+id;
		}
		
	}
	public Userentity updateId(int id,Userentity etd)
	{
		if(rep.existsById(id))  
		{
			Userentity obj=rep.findById(id).get();
			obj.setUser_id(etd.getUser_id());
			obj.setUsername(etd.getUsername());
			obj.setEmail(etd.getEmail());
			obj.setPassword(etd.getPassword());
			obj.setRole(etd.getRole());
			obj.setStatus(etd.getStatus());
			obj.setBio(etd.getBio());
			return rep.save(obj);
			
		}
		return etd;
	}
	public List<Userentity> fetchName(String username){
		return rep.findByUsername(username);
	}
	public List<Userentity> Contain(String username){
		return rep.findByUsernameContains(username);
	}
	
	public List<Userentity> isContain(String username){
		return rep.findByUsernameIsContaining(username);
	}
	
	public List<Userentity> Containing(String username) {
		return rep.findByUsernameContaining(username);
	}
	
	public List<Userentity> Startwith(String username){
		return rep.findByUsernameStartingWith(username);
	}
	public List<Userentity> Endwith(String username){
		return rep.findByUsernameEndingWith(username);
	}
	
	public List<Userentity> NotHaving(String username){
		return rep.findByUsernameNotContains(username);
	}

	public List<Userentity> NotContain(String username) {
		return rep.findByUsernameNotContaining(username);
	}
	public List<Userentity> NotLike(String username) {
		return rep.findByUsernameNotLike(username);
	}
	public Page<Userentity> get_data_all(int page,int size) {
		PageRequest obj=PageRequest.of(page, size);
		return rep.findAll(obj);
		
	}
	public Userentity oneToMany(Userentity user) {
	   	  return rep.save(user);
	     }
	
}
