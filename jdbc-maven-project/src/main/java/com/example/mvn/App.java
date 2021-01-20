package com.example.mvn;

import java.sql.SQLException;

import com.example.mvn.model.Employee;
import com.example.mvn.service.EmployeeServiceImpl;
import com.example.mvn.service.IEmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IEmployeeService service=null;
    	try {
			 service=new EmployeeServiceImpl();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
   //    Employee emp=new Employee(1001,"Mohit Sharma","mohit@yahho.com");
       try {
		Employee emp1=service.getEmployee(1002);
		System.out.println(emp1);
		//System.out.println("Employee Added Successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
    }
}
