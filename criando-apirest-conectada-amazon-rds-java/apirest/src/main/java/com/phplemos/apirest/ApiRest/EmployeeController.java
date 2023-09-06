package com.phplemos.apirest.ApiRest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeRepository respository;

    public EmployeeController(EmployeeRepository respository) {
        this.respository = respository;
    }

    @GetMapping("/employee")
    public List<Employee> listOfEmployeeAll(){
        return respository.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return respository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/employee")
    public Employee newEmployee(@RequestBody Employee newEmployee){
        return respository.save(newEmployee);
    }
    @PutMapping("/employee/{id}")
    public  Employee replaceEmployee(@RequestBody Employee newEmployee, Long id){
        return respository.findById(id).map(employee -> {
            employee.setName(newEmployee.getName());
            employee.setAddress(newEmployee.getAddress());
            employee.setRole(newEmployee.getRole());
            return respository.save(newEmployee);
        }).orElseGet(()->{
            newEmployee.setId(id);
            return respository.save(newEmployee);
        });
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Long id){
        respository.deleteById(id);
    }
}
