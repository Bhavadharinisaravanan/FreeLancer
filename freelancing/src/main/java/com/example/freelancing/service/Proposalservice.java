package com.example.freelancing.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.freelancing.entity.Proposalentity;
import com.example.freelancing.repo.Proposalrepo;
@Service

public class Proposalservice {

	@Autowired 
	Proposalrepo rep;
	
	public List<Proposalentity> getall()
	{
		return rep.findAll();
	}
	
	public Proposalentity post(Proposalentity user)
	{
		return rep.save(user);
	}   
	public String deleteId(int freelancerid) {
		if(rep.existsById(freelancerid)) {
			rep.deleteById(freelancerid);
			return "Value Deleted Successfully";
		}
		else
		{
		    return "Value not Found"+freelancerid;
		}
		
	}
	public Proposalentity updateId(int freelancerid,Proposalentity etd)
	{
		if(rep.existsById(freelancerid))  
		{
			Proposalentity obj=rep.findById(freelancerid).get();
			obj.setFreelancer_id(etd.getFreelancer_id());
			obj.setProposal_text(etd.getProposal_text());
			obj.setBid_amount(etd.getBid_amount());
			obj.setProposalstatus(etd.getProposalstatus());
			obj.setSubmitted_date(etd.getSubmitted_date());
			return rep.save(obj);
			
		}
		return etd;
    }
	public Page<Proposalentity> get_data_all(int page,int size) {
		PageRequest obj=PageRequest.of(page, size);
		return rep.findAll(obj);
		
	}
}
