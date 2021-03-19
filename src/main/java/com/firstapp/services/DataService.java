package com.firstapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapp.entity.Person;
import com.firstapp.repository.PeopleRepository;

@Service
public class DataService {
	@Autowired
	  PeopleRepository people;
	
      
      public List<Person> getPeople(){
    	 return people.findAll();
      }
      
      public void addPerson(Person person) {
    	  people.save(person);
      }

 	 public String[] getTeam() {
     	  String team[] = {
              "Johny","Harry","Kiran","Sara","Nanny","Vinay"
     	  };
     	  
     	  return team;
       }
      
}
