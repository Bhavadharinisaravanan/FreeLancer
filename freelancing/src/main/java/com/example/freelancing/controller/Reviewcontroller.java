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
import com.example.freelancing.entity.Reviewentity;
import com.example.freelancing.service.Reviewservice;
@RestController
public class Reviewcontroller {
	@Autowired
    private Reviewservice review;
    @GetMapping("/revfetch")
    public List<Reviewentity> disp()
    {
   	 return review.getall();
    }
    @PostMapping("/revpost")
	public Reviewentity postall(@RequestBody Reviewentity obj)
	{
		return review.post(obj);
	}
	@DeleteMapping("/revdelete/{sno}")
	public String delId(@PathVariable int sno)
	{
		return review.deleteId(sno);
	}
    @PutMapping("/revupdate/{id}")
    public Reviewentity updateById(@PathVariable int id,@RequestBody Reviewentity ob)
    {
    	return review.updateId(id,ob);
    }
    @GetMapping("/reviewpage")
    public Page<Reviewentity> Paging(@RequestParam int page,@RequestParam int size)
    {
    	return review.get_data_all(page,size);
    }

}
