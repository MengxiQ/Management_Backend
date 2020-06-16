package com.mengxi.manageemp.controller;
import com.mengxi.manageemp.dao.IEmployeeDao;
import com.mengxi.manageemp.domain.Department;
import com.mengxi.manageemp.domain.Employee;
import com.mengxi.manageemp.service.EmpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    private final IEmployeeDao iEmployeeDao;
    private final EmpService empService;
    public EmpController(IEmployeeDao iEmployeeDao, EmpService empService) {
        this.iEmployeeDao = iEmployeeDao;
        this.empService = empService;
    }

//    public EmpController(EmpService empService) {
//        this.empService = empService;
//    }

    @RequestMapping(path = "emp", method = RequestMethod.GET)
    public List<Employee> getEmps() {
        List<Employee> employees = empService.getEmps();
//        System.out.println("getemps");
        return employees;
    }

    @RequestMapping(path = "department", method = RequestMethod.GET)
    public List<Department> getDepat() {
        return iEmployeeDao.findAllDepartment();
    }

    @RequestMapping(path = "emp", method = RequestMethod.PUT)
    public void updateEmp(@RequestBody Employee employee) {
        iEmployeeDao.updateEmp(employee);
    }

    @RequestMapping(path = "emp", method = RequestMethod.POST)
    public void addEmp(@RequestBody Employee employee) {
        System.out.println("Insert...");
        System.out.println(employee);
        iEmployeeDao.addEmp(employee);

    }

    @RequestMapping(path = "emp/{id}", method = RequestMethod.DELETE)
    public void deleteEmp(@PathVariable int id) {
        System.out.println("delete:" + id);
        iEmployeeDao.deleteEmp(id);
    }

}
