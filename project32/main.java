package project32;

public class main {
	 public static void main(String[] args) {    
		 employee employee1 = new employee("Ahmet Yılmaz",58,"11111111111","E001",35000,6800,2005);    
		 employee employee2 = new employee("Ayşe Demir",62,"22222222222","E002",42000,8000,1998);      
		 manager manager = new manager("Mehmet Kaya",55,"33333333333","M001",60000,7500,2000,"Bilgi Teknolojileri");     
		 manager.addEmployee(employee1);  
		 manager.addEmployee(employee2);     
		 employee1.showEmployeeInfo();      
		 System.out.println("----------------");     
		 employee2.showEmployeeInfo();  
		 System.out.println("----------------");    
		 manager.showManagerInfo();       
		 System.out.println("----------------");   
		 manager.showManagedEmployees();   
		 System.out.println("----------------");     
		 System.out.println(         
				 "Toplam çalışan sayısı: " +       
        employee.getEmployeeCount()   
				 ); 
		 }

}
