package com.example.securityapp.securityapp.repositories;


import org.springframework.data.repository.CrudRepository;

import com.example.securityapp.securityapp.entities.Employees;

public interface EmployeeRepository extends CrudRepository<Employees, Long> {

}
