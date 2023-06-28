package com.sannndag.todocode.controller;

import com.sannndag.todocode.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/liters")
    public String litersToGallons(@RequestParam double countGallons) {
        double gallonUnit = 3.78541;
        double litersCount = countGallons * gallonUnit;

        return "The equivalent of 1 gallon in liters is: " + litersCount;
    }

    @GetMapping("/adding/{n1}/{n2}")
    public String adding(@PathVariable int n1, @PathVariable int n2) {
        int result = n1 + n2;

        return "The adding of the numbers is: " + result;
    }

    @PostMapping("/customer")
    public void newCustomer(@RequestBody Customer ent) {
        System.out.println("Customer info \nId: " + ent.getId() + "\nName: " + ent.getName() + "\nLastname: " + ent.getLastname());

    }

    //This was a tutorial using @ResponseBody.
    @GetMapping("/customer/get")
    @ResponseBody
    public List<Customer> getCustomers() {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1L, "Carolina", "Dindi"));
        customerList.add(new Customer(1L, "Paula", "Niro"));
        customerList.add(new Customer(1L, "Maria", "Gril"));

        return customerList;
    }

    //This was a tutorial using @ResponseEntity.
    @GetMapping("/customer/list")
    ResponseEntity<String> getList() {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1L, "Carolina", "Dindi"));
        customerList.add(new Customer(1L, "Paula", "Niro"));
        customerList.add(new Customer(1L, "Maria", "Gril"));

        return new ResponseEntity<>("Response Entity message", HttpStatus.OK);
    }



}
