package com.revature.azurepractice.beans.services;

import com.revature.azurepractice.beans.entities.Complaints;
import com.revature.azurepractice.beans.repos.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository compRepo;


    public Complaints addComplaint(Complaints comp){
        return compRepo.save(comp);
    }


    public Complaints getComplaint(Integer id){
        return compRepo.findById(id).get();
    }
}
