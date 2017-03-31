package com.ecil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeCaptureData
 */
@WebServlet("/EmployeeCaptureData")
public class EmployeeCaptureData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		
		
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		
		
		Employee employee=new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		
InsertEmployeeData1 insertEmployeeData1=new InsertEmployeeData1();
insertEmployeeData1.InsertEmployeeData1(employee);
		
		PrintWriter out = response.getWriter();
		out.println("record is inserted");
	}

}
