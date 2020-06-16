package com.mengxi.manageemp.dao;

import com.mengxi.manageemp.domain.Department;
import com.mengxi.manageemp.domain.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IEmployeeDao {
    @Select("select employee.*,department.departmentName from employee join department on employee.d_id = department.id")
    List<Employee> finAll();

    @Select("select * from department")
    List<Department> findAllDepartment();

    @Update("update employee set lastName = #{lastName},email = #{email},gender = #{gender},d_id = #{d_id} where id = #{id}")
    void updateEmp(Employee employee);

    @Insert("insert employee(lastName,email,gender,d_id)  values(#{lastName},#{email},#{gender},#{d_id});")
    void addEmp(Employee employee);

    @Delete("delete from employee where id = #{id}")
    void deleteEmp(int id);

    @Select("select email from employee")
    List<String> getAllEmail();
}
