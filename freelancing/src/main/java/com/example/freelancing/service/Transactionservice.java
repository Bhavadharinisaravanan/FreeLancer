package com.example.freelancing.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.freelancing.entity.Transactionentity;
import com.example.freelancing.repo.Transactionrepo;
@Service
public class Transactionservice {
	@Autowired 
	Transactionrepo rep;
	
	public List<Transactionentity> getall()
	{
		return rep.findAll();
	}
	
	public Transactionentity post(Transactionentity user)
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
	public Transactionentity updateId(int id,Transactionentity etd)
	{
		if(rep.existsById(id))  
		{
			Transactionentity obj=rep.findById(id).get();
			obj.setClient_id(etd.getClient_id());
			obj.setFreelancer_id(etd.getFreelancer_id());
			obj.setTransaction_id(etd.getTransaction_id());
			obj.setAmount(etd.getAmount());
			obj.setPaystatus(etd.getPaystatus());
			obj.setPayment_date(etd.getPayment_date());
			return rep.save(obj);	
		}
		return etd;
	}
	public Page<Transactionentity> get_data_all(int page,int size) {
		PageRequest obj=PageRequest.of(page, size);
		return rep.findAll(obj);
		
	}

}
