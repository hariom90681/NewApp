package com.hariom.repo;

import com.hariom.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{

}
