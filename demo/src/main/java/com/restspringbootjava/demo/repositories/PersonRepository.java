package com.restspringbootjava.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restspringbootjava.demo.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {   
}
