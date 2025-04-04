package com.example.freelancing.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.freelancing.entity.Proposalentity;
import com.example.freelancing.service.Proposalservice;
@RestController
public class Proposalcontroller {
	@Autowired
    private Proposalservice proposal;
    @GetMapping("/proposalfetch")
    public List<Proposalentity> disp()
    {
   	 return proposal.getall();
    }
    @PostMapping("/proposalpost")
	public Proposalentity postall(@RequestBody Proposalentity obj)
	{
		return proposal.post(obj);
	}
	@DeleteMapping("/proposaldelete/{sno}")
	public String delId(@PathVariable int sno)
	{
		return proposal.deleteId(sno);
	}
    @PutMapping("/proposalupdate/{id}")
    public Proposalentity updateById(@PathVariable int id,@RequestBody Proposalentity ob)
    {
    	return proposal.updateId(id,ob);
    }
    @GetMapping("/proposalpage")
    public Page<Proposalentity> Paging(@RequestParam int page,@RequestParam int size)
    {
    	return proposal.get_data_all(page,size);
    }

}
