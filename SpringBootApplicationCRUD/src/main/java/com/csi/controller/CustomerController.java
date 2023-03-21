package com.csi.controller;

import com.csi.model.Customer;
import com.csi.services.CustomereServices;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomereServices customereServicesImpl;
    @PostMapping("/savedata")
    public ResponseEntity<String> saveData(@RequestBody Customer customer){
        customereServicesImpl.saveData(customer);
        return ResponseEntity.ok("Customer Data saved Successfully");
    }

    @GetMapping("/getdatabyid/{custId}")
    public ResponseEntity<Customer> getDataById(@PathVariable int custId){
        return ResponseEntity.ok(customereServicesImpl.getDataById(custId));
    }

    @GetMapping("/getalldata")
    public  ResponseEntity<List<Customer>> getAllData(){
        return ResponseEntity.ok(customereServicesImpl.getAlldata());
    }

    @PutMapping("/updatedata/{custId}")
    public ResponseEntity<String> updateData(@PathVariable int custId, @RequestBody Customer customer){
        customereServicesImpl.updateData(custId, customer);
        return ResponseEntity.ok("Customer Record Updated Successfully");

    }

    @DeleteMapping("/deletedata/{custId}")
    public  ResponseEntity<String> deleteData(@PathVariable int custId){
        customereServicesImpl.deleteData(custId);
        return ResponseEntity.ok("Customer Record Deleted Successfully");
    }
}
