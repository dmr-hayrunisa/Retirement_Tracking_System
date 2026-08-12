package project32;

public class employee extends person{
	protected String employeeId;  
	protected double salary;
	protected int premiumDays; 
	protected int workStartYear;  
	private static int employeeCount = 0;
	private static String id;  
	private static final int REQUIRED_PREMIUM_DAYS = 7200;  
	private static final int RETIREMENT_AGE = 60;   
	public employee(   
			String name,          
			int age,           
			String id,        
			String employeeId,           
			double salary,          
			int premiumDays,          
			int workStartYear    ) 
	{  
  super(name, age,id);     
  this.employeeId = employeeId;     
  this.salary = salary;     
  this.premiumDays = premiumDays;   
  this.workStartYear = workStartYear;    
  employeeCount++;  
  }   
	public boolean canRetire() {    
		return age >= RETIREMENT_AGE &&          
		premiumDays >= REQUIRED_PREMIUM_DAYS;  
		}   
	public double calculateEstimatedRetirementSalary() {      
		return salary * 0.65;    
		}   
	public void showEmployeeInfo() {      
		showBasicInfo();    
		System.out.println("Çalışan ID: " + employeeId);     
		System.out.println("Maaş: " + salary);    
		System.out.println("Prim günü: " + premiumDays);    
		System.out.println("Emeklilik durumu: " +           
		(canRetire() ? "Emekli olabilir" : "Henüz olamaz")); 
		}    
	public static int getEmployeeCount() {    
		return employeeCount;   
		}   
	public static int getRequiredPremiumDays() { 
		return REQUIRED_PREMIUM_DAYS; 
		}
	}

