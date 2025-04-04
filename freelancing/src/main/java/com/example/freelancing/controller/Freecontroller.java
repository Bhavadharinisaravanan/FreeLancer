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
import com.example.freelancing.entity.Userentity;
import com.example.freelancing.service.Freelanceservice;
@RestController
    public class Freecontroller {
	@Autowired
    private Freelanceservice log;
    @GetMapping("/fetch")
    public List<Userentity> disp()
    {
   	 return log.getall();
    }
    @PostMapping("/post")
	public Userentity postall(@RequestBody Userentity obj)
	{
		return log.post(obj);
	}
	@DeleteMapping("/delete/{sno}")
	public String delId(@PathVariable int sno)
	{
		return log.deleteId(sno);
	}
    @PutMapping("/update/{id}")
    public Userentity updateById(@PathVariable int id,@RequestBody Userentity ob)
    {
    	return log.updateId(id,ob);
    }
    @GetMapping("/fetchname")
    public List<Userentity> getName(@RequestParam String username)
    {
    	return log.fetchName(username);
    	
    }
    @GetMapping("/Contain")
    public List<Userentity> Having(@RequestParam String username)
    {
    	return log.Contain(username);
    }
    @GetMapping("/Containing")
    public List<Userentity> Containing(@RequestParam String user)
    {
    	return log.Containing(user);
    }
    @GetMapping("/isContains")
    public List<Userentity> isContains(@RequestParam String user)
    {
    	return log.isContain(user);
    }
    @GetMapping("/startwith")
    public List<Userentity> Startswith(@RequestParam String user)
    {
    	return log.Startwith(user);
    }
    @GetMapping("/endwith")
    public List<Userentity> Endswith(@RequestParam String user)
    {
    	return log.Endwith(user);
    } 
    @GetMapping("/notContaining")
    public List<Userentity> NotContaining(@RequestParam String username)
    {
    	return log.NotContain(username);
    }
    @GetMapping("/notContains")
    public List<Userentity> NotContains(@RequestParam String username)
    {
    	return log.NotHaving(username);
    }
    @GetMapping("/notLike")
    public List<Userentity> NotLikes(@RequestParam String user)
    {
    	return log.NotLike(user);
    }
    @GetMapping("/userpage")
    public Page<Userentity> Paging(@RequestParam int page,@RequestParam int size)
    {
    	return log.get_data_all(page,size);
    }
    @PostMapping("/oneToMany")
    public Userentity postUser(@RequestBody Userentity sig) {
    	
    	return log.oneToMany(sig);
    }
}