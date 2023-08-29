package com.restspringbootjava.demo.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.restspringbootjava.demo.data.vo.v2.PersonVOV2;
import com.restspringbootjava.demo.model.Person;

@Service
public class PersonMapper {
    public PersonVOV2 converEntityToVo(Person person){
        PersonVOV2 vo = new PersonVOV2();
        vo.setId(person.getId());
        vo.setAddress(person.getAddress());
        vo.setBirthDay(new Date());
        vo.setFirstName(person.getFirstName());
        vo.setLastName(person.getLastName());
        vo.setGender(person.getGender());
        return vo;
    }
    public Person converVoToEntity(PersonVOV2 person){
        Person entity = new Person();
        entity.setId(person.getId());
        entity.setAddress(person.getAddress());
        //entity.setBirthDay(new Date());
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setGender(person.getGender());
        return entity;
    }
}
