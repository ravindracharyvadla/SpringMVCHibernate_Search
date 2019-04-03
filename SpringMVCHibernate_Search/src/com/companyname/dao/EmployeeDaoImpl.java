package com.companyname.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.companyname.entity.Employee;

@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public Employee searchById(int employeeId) {
		
		Session session = this.sessionFactory.getCurrentSession();		
		Employee employee = (Employee) session.load(Employee.class, new Integer(employeeId));
		if(employee!=null){
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmailId()+"\t"+employee.getContactNumber()+"\t"+employee.getPassword());
		}else{
			System.out.println("Employee is null");
		}
		/*boolean userFound = false;
		Query<Employee> searchQuery=session.createQuery("from Employee as e where e.employeeId=:employeeId");
		searchQuery.setParameter("employeeId", employeeId);
		//logger.info("Employee loaded successfully, Employee details="+e);
		List list = searchQuery.list();
		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		else{
			userFound= false;
		}*/

		//session.close();
		
		return employee; 
		
	}
	
	
}
