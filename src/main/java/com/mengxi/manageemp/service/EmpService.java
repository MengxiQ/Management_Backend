package com.mengxi.manageemp.service;

import com.mengxi.manageemp.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mengxi.manageemp.dao.IEmployeeDao;

import java.util.List;

@Service
public class EmpService {
    private final IEmployeeDao iEmployeeDao;
    public EmpService(IEmployeeDao iEmployeeDao) {
        this.iEmployeeDao = iEmployeeDao;
    }

    public List<Employee> getEmps() {
        List<Employee> employees = iEmployeeDao.finAll();
        for (Employee employee : employees) {
            int gender = employee.getGender();
            if (gender == 1) {
                employee.setEmp_gender("男");
            } else {
                employee.setEmp_gender("女");
            }
        }
        return  employees;
    }

}
