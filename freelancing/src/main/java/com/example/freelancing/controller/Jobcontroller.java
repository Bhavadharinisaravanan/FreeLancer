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
import com.example.freelancing.entity.Jobentity;
import com.example.freelancing.service.Jobservice;
@RestController
public class Jobcontroller {
	
	@Autowired
    private Jobservice job;
    @GetMapping("/jobfetch")
    public List<Jobentity> disp()
    {
   	 return job.getall();
    }
    @PostMapping("/jobpost")
	public Jobentity postall(@RequestBody Jobentity obj)
	{
		return job.post(obj);
	}
	@DeleteMapping("/jobdelete/{sno}")
	public String delId(@PathVariable int sno)
	{
		return job.deleteId(sno);
	}
    @PutMapping("/jobupdate/{id}")
    public Jobentity updateById(@PathVariable int id,@RequestBody Jobentity ob)
    {
    	return job.updateId(id,ob);
    }
    @GetMapping("/jobpage")
    public Page<Jobentity> Paging(@RequestParam int page,@RequestParam int size)
    {
    	return job.get_data_all(page,size);
    }
}
