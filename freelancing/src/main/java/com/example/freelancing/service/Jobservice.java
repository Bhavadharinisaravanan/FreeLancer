package com.example.freelancing.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.freelancing.entity.Jobentity;
import com.example.freelancing.repo.Jobrepo;
@Service

public class Jobservice {
	@Autowired 
	Jobrepo rep;
	
	public List<Jobentity> getall()
	{
		return rep.findAll();
	}
	
	public Jobentity post(Jobentity user)
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
	public Jobentity updateId(int jobid,Jobentity etd)
	{
		if(rep.existsById(jobid))  
		{
			Jobentity obj=rep.findById(jobid).get();
			obj.setJob_id(etd.getJob_id());
			obj.setClient_id(etd.getClient_id());
			obj.setTitle(etd.getTitle());
			obj.setBudget(etd.getBudget());
			obj.setStatus(etd.getStatus());
			obj.setPosted_date(etd.getPosted_date());
			
			return rep.save(obj);
			
		}
		return etd;
	}
	public Page<Jobentity> get_data_all(int page,int size) {
		PageRequest obj=PageRequest.of(page, size);
		return rep.findAll(obj);
		
	}
	
	
	

}
