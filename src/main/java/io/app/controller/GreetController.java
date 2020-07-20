package io.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.app.model.GreetResponse;
import io.app.repository.GreetRepository;

@Controller
public class GreetController {
	
	@Autowired
	private GreetRepository greetRepository;
	
    @RequestMapping(value="greet-response",method=RequestMethod.POST)
	public String greetResponse(@ModelAttribute GreetResponse greetResponse) {
        greetRepository.save(greetResponse);
		return "index";
	}
    
    @RequestMapping(value="/response",method=RequestMethod.GET)
    @ResponseBody
	public List<GreetResponse> all(){
    	return greetRepository.findAll();
    }
}
