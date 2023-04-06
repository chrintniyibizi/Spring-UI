package com.mvc.citizen.controller;


import com.mvc.citizen.entity.Citizen;
import com.mvc.citizen.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CitizenController {
    @GetMapping(value = "/display")
public String display()
{
    return "index";
}

    @Autowired
    private CitizenService service;

    @PostMapping("/addCitizen")
    public Citizen addCitizen(@RequestBody Citizen citizen){
        return service.saveCitizen(citizen);
    }

    @PostMapping("/addCitizens")
    public List<Citizen> addCitizens(@RequestBody List<Citizen> citizens){
        return service.saveCitizens(citizens);
    }

    @GetMapping("/citizens")
   public List<Citizen> findAllCitizens(){
        return service.getCitizens();
   }

    @GetMapping("/citizens/{name}")
   public Citizen findCitizenById(@PathVariable int id){
        return service.getCitizenById(id);
   }

   // @GetMapping("/citizens/{id}")
    //public Citizen findCitizenByName(@PathVariable String name){
    //    return service.getCitizenByName(name);
  //  }

    @PutMapping("/update")
    public Citizen updateCitizen(@RequestBody Citizen citizen){
        return service.updateCitizen(citizen);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCitizen(@PathVariable int id){
        return service.deleteCitizen(id);
    }

}
