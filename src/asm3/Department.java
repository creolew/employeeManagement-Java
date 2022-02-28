package asm3;

import java.util.Scanner;

public class Department {
	private String id_department;
	private String name_department;
	private int num;
	
	
	 /**
	 *  CONSTRUCTOR
	 */
	public Department() {
	    	
		}
	 
	 public Department(String id_department,String name_department,int num) {
	    	this.id_department= id_department;
	    	this.name_department= name_department;
	    	this.num= num;
		}
	    

	    /**
	     * GETTER, SETTER
	     */
	    public String getId_department() {
	    	
	    	
	    	
	    	return id_department;
	   
	    }

	   
	    public void setId_department(String id_department) {
	
	    	this.id_department=id_department;
	    
	    }
	    
	    
	    public String getName_department() {
	    
	 
	    	return name_department;
	   
	    }
	    public void setName_department(String name_department) {
	    	this.name_department= name_department;
	    }
   
	    
	    
	    public int getNum() {
	    	return num;
	   
	    }

	    public void setNum(int num) {
	    	this.num= num;
	    }
	    
	    //------------   
	    

	    
	    /**
	     *	toString()
	     */
	    @Override
		public String toString() {
			return "Department: Business, Technical, Project" ;
		}

	   
}
