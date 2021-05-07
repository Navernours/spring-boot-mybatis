package com.springbootmybatis.mapper;

import com.springbootmybatis.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper//表明这是一个mybatis的mapper类
@Repository //dao的注解
public interface employeeMapper {


    List<Employee> queryEmployeeList();

    Employee queryEmployeeById(Integer emp_id);

    Integer addEmployee(Employee employee);

    Integer updateEmployee(Employee employee);

    Integer deleteEmployeeById(Integer emp_id);



}
