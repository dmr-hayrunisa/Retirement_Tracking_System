package project32;

import java.util.ArrayList;
import java.util.List;

public class manager extends employee{
	  private String department; 
	  private List<employee> employees;   
	  public manager(String name,int age,String id,String employeeId,double salary,int premiumDays,int workStartYear,String department) {     
		  super(name,age,id,employeeId,salary,premiumDays,workStartYear  );   
		  this.department = department;     
		  this.employees = new ArrayList<>();  
		  }    public void addEmployee(employee employee) {   
			  employees.add(employee);  
			  } 
		  public void showManagedEmployees() {    
			  System.out.println(name + " tarafından yönetilen çalışanlar:");    
			  for (employee employee : employees) {        
				  System.out.println("- " + employee.name + " | Emeklilik durumu: " + (employee.canRetire() ? "Uygun" : "Uygun değil")  );       
				  } 
			  }  
		  public int getEmployeeCountInDepartment() {    
			  return employees.size();   
			  }  
		  public void showManagerInfo() {    
			  showEmployeeInfo();     
			  System.out.println("Departman: " + department);  
			  System.out.println("Yönettiği çalışan sayısı: " + employees.size());  
			  }

}
