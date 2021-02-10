package com.src;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
public class EmployeeMain {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpid(34);
		e.setEmpname("ironman");
		e.setEmpaddress("cbe");
		Employee e1=new Employee();
		e1.setEmpid(12);
		e1.setEmpname("thor");
		e1.setEmpaddress("usa");
try {
		JAXBContext con=JAXBContext.newInstance(Employee.class);
	    Marshaller  ms=con.createMarshaller();
	     
			ms.marshal(e,System.out);
			File f=new File("employee.xml");
			ms.marshal(e1,f );
			System.out.println("inserted in to file");
		} catch (JAXBException j) {
			// TODO Auto-generated catch block
			j.printStackTrace();
		}
	    
	}




	}


