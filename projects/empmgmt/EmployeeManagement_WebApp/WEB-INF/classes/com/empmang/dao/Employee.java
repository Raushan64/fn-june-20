package com.empmang.dao;

import java.util.List;

import com.empmang.exceptions.ApplicationException;
import com.empmang.exceptions.DatabaseOperationException;
import com.empmang.model.EmployeeTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface Employee.
 */
public interface Employee {
	  
  	/**
	   * Adds the emp.
	   *
	   * @param employee the employee
	   * @throws DatabaseOperationException the database operation exception
	   * @throws ApplicationException the application exception
	   */
  	public void addEmp(EmployeeTO employee) throws  DatabaseOperationException, ApplicationException;
	  
  	/**
	   * Delete emp.
	   *
	   * @param userId the user id
	   * @throws DatabaseOperationException the database operation exception
	   * @throws ApplicationException the application exception
	   */
  	public void deleteEmp(int userId) throws DatabaseOperationException, ApplicationException;
	  
  	/**
	   * Update emp.
	   *
	   * @param employee the employee
	   * @throws DatabaseOperationException the database operation exception
	   * @throws ApplicationException the application exception
	   */
  	public void updateEmp(EmployeeTO employee)throws  DatabaseOperationException, ApplicationException;
	  
  	/**
	   * Gets the all emp.
	   *
	   * @return the all emp
	   * @throws DatabaseOperationException the database operation exception
	   * @throws ApplicationException the application exception
	   */
  	public List<EmployeeTO> getAllEmp() throws  DatabaseOperationException, ApplicationException;
	  
  	/**
	   * Gets the emp by id.
	   *
	   * @param empId the emp id
	   * @return the emp by id
	   * @throws DatabaseOperationException the database operation exception
	   * @throws ApplicationException the application exception
	   */
  	public EmployeeTO getEmpById(int empId) throws  DatabaseOperationException, ApplicationException;
  	
  	/**
	 * **************************************************************** This
	 * method is used to retrieve the Employee count.
	 * 
	 * @return the Employee count
	 * @throws DatabaseOperationException
	 *             when any SQLException occurs in the system
	 * @throws ApplicationException
	 *             *************************************************************
	 *             ****
	 */
	public int getAllEmployeeCount() throws DatabaseOperationException,
			ApplicationException;
	
	/**
	 * **************************************************************** This
	 * method is used to get all the employee details which will be paginated
	 * in the view.
	 * 
	 * @return the all employees
	 * @throws DatabaseOperationException
	 *             when any SQLException occurs in the system
	 * @throws ApplicationException
	 *             *************************************************************
	 *             ****
	 */
	public List<EmployeeTO> getAllEmployeesByPagination(String maxPage, String ofset)
			throws DatabaseOperationException, ApplicationException;
	  
}
