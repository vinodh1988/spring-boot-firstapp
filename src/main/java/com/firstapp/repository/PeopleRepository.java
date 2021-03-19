package com.firstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapp.entity.Person;

public interface PeopleRepository extends JpaRepository<Person, Long>{

}
/*
1. add data jpa and database driver dependency in pom.xml
2. create entity class
3. create repository interface --> JPARepository
*/