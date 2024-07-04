package com.artemhodas.spring.springboot.spring_course_springboot.dao;

import com.artemhodas.spring.springboot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

//    public Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

//    public void saveEmployee(Employee employee);
//
//    void deleteEmployee(int id);
}
