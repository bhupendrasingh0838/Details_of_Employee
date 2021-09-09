package com.bhupendra.frist.service;


import com.bhupendra.frist.model.Employee;
import com.bhupendra.frist.repository.EmployeeRepository;
import com.bhupendra.frist.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repository;


    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public  Employee getId(Long id) {
        return repository.findById(id).get();

    }

//   @Override
   public void update(Long id,Employee employee){

      Employee employee1 = repository.findById(id).get();
      employee1.setFirstName(employee.getFirstName());
     employee1.setMiddleName(employee.getMiddleName());
     employee1.setLastName(employee.getLastName());
      employee1.setAddress(employee.getAddress());
      repository.save(employee1);
  }

    /*@Override
    public void saveAll(Employee employee){
         repository.saveAll(employee);


    }*/

}
