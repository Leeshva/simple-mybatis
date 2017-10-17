package com.sample.demo1.service;

import java.util.List;

import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.vo.Employee;

@Service
public class HRServiceImpl implements HRService{
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeMapper.getAllEmployees();
		if(employees.isEmpty()) {
			throw new RuntimeException("조회결과 없음");
		}
		System.out.println("조회된 사원 수수수수수 : " +employees.size());
		return employees;
	}
}
