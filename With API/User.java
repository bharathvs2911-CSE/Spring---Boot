package com.example.demo.entity; 
 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import jakarta.persistence.Table; 
 
@Entity 
@Table(name = "sports") public class User { 
 
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)     
	private Long id;     
	private String name;     
	private String department;     
	private String designation;     
	private String qualification; 
    // Matches the spelling from your instructions  
    // Default Constructor     
	public User() { 
    		} 
 
    // Parameterized Constructor 
    public User(String name, String department,String designation,String qualification) {         
		this.name = name; 
        	this.department = department;         
		this.designation = designation;         
		this.qualification = qualification;     
	} 
 
    // Getters and Setters     
	public Long getId() {         
		return id; 
    	}
     	public void setId(Long id) {         
		this.id = id; 
    	}  
    	public String getname() {         
		return name; 
    	}      
	public void setname(String name) {         
		this.name = name; 
    	} 
 	public String getdepartment() {         
		return department; 
    	}  
    	public void setdepartment(String department) {         
		this.department = department; 
    	} 
    	public String getdesignation() {         
		return designation; 
    	}  
    	public void setdesignation(String designation) {         
		this.designation = designation; 
    	} 
    	public String getqualification() {         
		return qualification; 
    	}  
    	public void setqualification(String qualification) {         
		this.qualification = qualification;     
   } 
} 
