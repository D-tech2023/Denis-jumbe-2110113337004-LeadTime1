package com.LeadTime;

import com.LeadTime.Repo.LeadRepo;
import models.leadtime;
import org.springframework.web.bind.annotation.*;

import static models.leadtime.deleteleadtime;

@Econtrollers
public class Leadcontroller {
    private LeadRepo LeadRepo;
    private long leadRepo;

    public <LeadRepo> Leadcontroller(LeadRepo leadRepo) {
        this.LeadRepo = LeadRepo;
    }

    @GetMapping(value="/leadtime")
    public long getleadtime(){
        return leadRepo;
    }
    @PostMapping(value = "/save")
    public String saveleadtime( leadtime leadtime){
        LeadRepo.save(leadtime);
        return "Saved";
    }
    @PutMapping(value = "update/{id}")
    public String updateleadtime(@PathVariable String id, @RequestBody leadtime leadtime) {
        leadtime updatedleadtime = LeadRepo.findById(id).get();
        updatedleadtime.setCustomerName(leadtime.getCustomerName());
        updatedleadtime.setOrderTime(models.leadtime.getOrderName());
        updatedleadtime.setReceptionStore(models.leadtime.getRecptionStore());
        return ("leadtime updated");


    }
    @DeleteMapping(value =("/delete/{id}"))

    public String deleteleadtime(@PathVariable String id){
        deleteleadtime = java.util.Optional.of(LeadRepo.findById(id).get());
        LeadRepo.delete(deleteleadtime);
        return "deleted leadtime with id"+id;

    }

    }



