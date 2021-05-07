package com.springbootmybatis.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

   private Department department;
   private Integer emp_id;
   private String emp_name;
   private String emp_gender;
   private String emp_phone;
   private Integer emp_de_id;


}
