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
import com.example.freelancing.entity.Transactionentity;
import com.example.freelancing.service.Transactionservice;
@RestController

public class Transactioncontroller {
	@Autowired
    private Transactionservice trans;
    @GetMapping("/transfetch")
    public List<Transactionentity> disp()
    {
   	 return trans.getall();
    }
    @PostMapping("/transpost")
	public Transactionentity postall(@RequestBody Transactionentity obj)
	{
		return trans.post(obj);
	}
	@DeleteMapping("/transdelete/{sno}")
	public String delId(@PathVariable int sno)
	{
		return trans.deleteId(sno);
	}
    @PutMapping("/transupdate/{id}")
    public Transactionentity updateById(@PathVariable int id,@RequestBody Transactionentity ob)
    {
    	return trans.updateId(id,ob);
    }
    @GetMapping("/transacpage")
    public Page<Transactionentity> Paging(@RequestParam int page,@RequestParam int size)
    {
    	return trans.get_data_all(page,size);
    }


}
