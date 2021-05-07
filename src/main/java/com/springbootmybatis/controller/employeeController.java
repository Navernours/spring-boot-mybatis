package com.springbootmybatis.controller;

import com.springbootmybatis.domain.Department;
import com.springbootmybatis.domain.Employee;
import com.springbootmybatis.mapper.departmentMapper;
import com.springbootmybatis.mapper.employeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class employeeController {
    @Autowired
    private employeeMapper employeeMapper;

    @Autowired
    private departmentMapper departmentMapper;


    @RequestMapping("/queryEmployeeList")
    public String queryEmployeeList(Model model){
        List<Employee> employees = employeeMapper.queryEmployeeList();
        model.addAttribute("employeeAll",employees);
        return "list";
    }
    @GetMapping("/addEmployee")
    public String addEmployee(Model model){
        List<Department> departments = departmentMapper.queryDepartmentList();
        model.addAttribute("departments",departments);
        return "add";
    }
    @PostMapping("/addEmployee")
    public String submitEmployee(Employee employee){
        employeeMapper.addEmployee(employee);
        return "redirect:/queryEmployeeList";
    }
    @GetMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable("id")Integer id, Model model){
        Employee employee = employeeMapper.queryEmployeeById(id);
        model.addAttribute("emp",employee);
        List<Department> departments = departmentMapper.queryDepartmentList();
        model.addAttribute("departments",departments);
        return "update";
    }
    @PostMapping("/updateEmployee")
    public String submitUpdateEmployee(Employee employee){
       employeeMapper.updateEmployee(employee);
       return "redirect:/queryEmployeeList";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id")Integer id){
        employeeMapper.deleteEmployeeById(id);
        return "redirect:/queryEmployeeList";
    }

}
