package com.mvc.citizen.service;


import com.mvc.citizen.entity.Citizen;
import com.mvc.citizen.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService {

    @Autowired
    private CitizenRepository repository;


    public Citizen saveCitizen(Citizen citizen){
        return repository.save(citizen);
    }

    public List<Citizen> saveCitizens(List<Citizen> citizens){
        return repository.saveAll(citizens);
    }

    public List<Citizen> getCitizens(){
        return repository.findAll();
    }

    public Citizen getCitizenById(int id){
        return repository.findById(id).orElse(null);

    }

   // public Citizen getCitizenByName(String name){
     //   return repository.findByName(name);

   // }

    public String deleteCitizen(int id){
        repository.deleteById(id);
        return "citizen removed !!"+id;
    }

    public Citizen updateCitizen(Citizen citizen){
        Citizen existingCitizen=repository.findById(citizen.getId()).orElse(null);
        existingCitizen.setNames(citizen.getNames());
        existingCitizen.setAdress(citizen.getAdress());
        existingCitizen.setDob(citizen.getDob());
        return repository.save(existingCitizen);

    }





}
