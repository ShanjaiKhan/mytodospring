package com.techymeet.todo.dao;

import java.util.List;

import com.techymeet.todo.bo.EmployeeBo;
import com.techymeet.todo.vo.EmployeeVo;

public interface EmployeeDao {

	EmployeeVo createEmployee(EmployeeVo employeeVo);

	List<EmployeeVo> retriveEmployeeList();

	EmployeeVo retriveEmployeeBasedOnId(int employeeId);

	void updateEmployee(EmployeeVo employeeVo);

	void deleteEmployee(int employeeId);

	long retriveCount();

	List<EmployeeVo> retriveEmployeeByPagination(EmployeeBo employeeBo);

}
