package com.example.freelancing.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.freelancing.entity.Reviewentity;
import com.example.freelancing.repo.Reviewrepo;
@Service
public class Reviewservice {
	@Autowired 
	Reviewrepo rep;
	
	public List<Reviewentity> getall()
	{
		return rep.findAll();
	}
	
	public Reviewentity post(Reviewentity user)
	{
		return rep.save(user);
	}   
	public String deleteId(int jobid) {
		if(rep.existsById(jobid)) {
			rep.deleteById(jobid);
			return "Value Deleted Successfully";
		}
		else
		{
		    return "Value not Found"+jobid;
		}
		
	}
	public Reviewentity updateId(int jobid,Reviewentity etd)
	{
		if(rep.existsById(jobid))  
		{
			Reviewentity obj=rep.findById(jobid).get();
			obj.setJob_id(etd.getJob_id());
			obj.setRater_id(etd.getRater_id());
			obj.setRatee_id(etd.getRatee_id());
			obj.setRating(etd.getRating());
			obj.setReview(etd.getReview());
			return rep.save(obj);
			
		}
		return etd;
	}
	public Page<Reviewentity> get_data_all(int page,int size) {
		PageRequest obj=PageRequest.of(page, size);
		return rep.findAll(obj);
		
	}

}
