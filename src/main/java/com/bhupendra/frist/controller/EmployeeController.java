package com.bhupendra.frist.controller;

import com.bhupendra.frist.model.Employee;
import com.bhupendra.frist.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/safe")
    public List<Employee> getAllEmployee() {
        return service.getAllEmployee();
    }

    @PostMapping("/create")
    public String create(@RequestBody Employee employee)
    {
        service.save(employee);
        return "employee";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable  Long id)
    {
        service.delete(id);
        return "Data Delete Succesfully";
    }
    @GetMapping("/safe/{id}")
    public Employee  safe(@PathVariable Long id)
    {
        Employee employee =service.getId(id);
        return employee;

    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id,@RequestBody Employee employee )
    {
        service.update(id, employee);
        return "Update date Succesfully";
    }
//        @PostMapping("/createmultiplevalue")
//        public String create(@RequestBody List<Employee> employee) {
//            service.saveAll(employee);
//            return "employee record saved";
//    }
}








