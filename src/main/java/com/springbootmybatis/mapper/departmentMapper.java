package com.springbootmybatis.mapper;

import com.springbootmybatis.domain.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface departmentMapper {
    List<Department> queryDepartmentList();

    Department queryDepartmentById(Integer de_id);
}
