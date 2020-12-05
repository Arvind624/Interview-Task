package com.cns.springRestAndDataJpaWithSpringBoot.service;

import java.util.List;

import com.cns.springRestAndDataJpaWithSpringBoot.entity.Employee;
 
public interface EmployeeService {
 public List<Employee> retrieveEmployees();
  
 public Employee getEmployee(Long employeeId);
  
 public void saveEmployee(Employee employee);
  

}