package com.firstapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstapp.entity.Person;
import com.firstapp.services.DataService;

@RestController
@RequestMapping("/api")
public class FirstRestController {
@Autowired
   DataService data;
	@RequestMapping("/greet")
	public String greet() {
		return "Spring Rest service is running";
	}
	
	@RequestMapping("/team")
	public String[] team() {
		String[] n= {"Johny","Harry","Kiran","Sara","Nanny","Vinay"};
		return n;
	}
	
	@GetMapping(value="/people",produces = {MediaType.APPLICATION_JSON_VALUE,"application/xml"})
	public List<Person> getPeople(){
		return data.getPeople(); //return list of person - automatically ll be converted json
		   
	}
	
	@PostMapping("/people")
	public ResponseEntity<Person> addPerson(@RequestBody Person person) {
		try {
			data.addPerson(person);
			return new ResponseEntity<Person>(person,HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Person>(HttpStatus.INTERNAL_SERVER_ERROR);
		} 
	}
}
