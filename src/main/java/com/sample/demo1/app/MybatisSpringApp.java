package com.sample.demo1.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.service.HRService;
import com.sample.demo1.vo.Employee;

public class MybatisSpringApp {
	
	public static void main(String[] args) {
		//		3가지 방법중 하나 선택 
		String resource = "classpath:/META-INF/spring/app-mybatis-tag-context.xml";
//		String resource = "classpath:/META-INF/spring/app-mapper-scanner-context.xml";
//		String resource = "classpath:/META-INF/spring/demo1-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
//		EmployeeMapper mapper = context.getBean(EmployeeMapper.class);
//		List<Employee> employees = mapper.getAllEmployees();
//		System.out.println(mapper);
//		System.out.println("조회된 사원 수 : " + employees.size());
		
		HRService service = context.getBean(HRService.class);
		List<Employee> employees = service.getAllEmployees();
		System.out.println(employees.size());
	}
}
