package project32;

public class person {
    protected String name;  
    protected int age;   
    protected String id;   
    public person(String name, int age, String id) {     
    	this.name = name;     
    	this.age = age;       
    	this.id= id;   
    	}  
    public void showBasicInfo() {     
    	System.out.println("Ad: " + name);   
    	System.out.println("Yaş: " + age);   
    	}
    }


