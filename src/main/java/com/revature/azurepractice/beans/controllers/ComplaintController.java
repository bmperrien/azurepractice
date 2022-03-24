package com.revature.azurepractice.beans.controllers;

import com.revature.azurepractice.beans.entities.Complaints;
import com.revature.azurepractice.beans.repos.ComplaintRepository;
import com.revature.azurepractice.beans.services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comps")
public class ComplaintController {
    @Autowired
    private ComplaintService compServ;

    @PostMapping
    public void addComplaint(@RequestBody Complaints comp){
        compServ.addComplaint(comp);
    }

    @GetMapping("/{id}")
    public Complaints getComplaint(@PathVariable("id") Integer id){
        return compServ.getComplaint(id);
    }
}
