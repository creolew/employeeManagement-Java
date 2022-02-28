package asm3;

import java.util.Scanner;

public class Manager extends Staff {
    private String title;
    

    /**
     * CONSTRUCTOR
     */
    public Manager() {
    	super();
	}
    public Manager ( String name, String gender, int age, String id, double coefficients_salary, String startDay, String department, int day_off, String title) {
    	super(name, gender,  age,  id,  coefficients_salary,  startDay,  department,  day_off);
    	this.title= title;
    }
    
    
    /**
     * Ghi đè method displayInformation() từ class Staff
     */
    @Override
	public void displayInformation() {
		System.out.println("Manager name: " + super.getName());
		System.out.println("Manager gender: " + super.getGender());
		System.out.println("Manager age: " + super.getAge());
		System.out.println("Manager id: " + super.getId());
        System.out.println("Manager coefficients salary: " + super.getCoefficients_salary());
        System.out.println("Manager start day: " + super.getStartDay());
        System.out.println("Manager department: " + super.getDepartment());
        System.out.println("Manager day off: " + super.getDay_off());
        System.out.println("Manager title: " + title);
	
    }
    
    
    /**
     * Ihừa kế từ từ class Staff và thêm các thuộc tính mới
     */
    public void inputInfo() {
    	super.inputInfo();
    	Scanner input= new Scanner(System.in);
    	
    	do{
    		
    		System.out.println("Nhập chức danh (gồm: Project Leader, Business Leader, Technical Leader) ");
        	title= input.nextLine();
        	
    	}while(!title.equalsIgnoreCase("Project Leader") && !title.equalsIgnoreCase("Business Leader") && !title.equalsIgnoreCase("Technical Leader"));
    	    	
    }


    /**
     * Interface tính lương từ Interface ICalculator
     */
    @Override
    public int getSalary(){
        int m= 0;
    	if(title.equalsIgnoreCase("Business Leader")) {
    		m= 8000000;
    	}else if(title.equalsIgnoreCase("Project Leader")) {
    		m= 5000000;
    	}else if(title.equalsIgnoreCase("Technical Leader")) {
    		m= 6000000;
    	}
    	
    	return ((int)super.getCoefficients_salary()*5000000 + m);
    }

    /**
     * Ghi đè displaySalary() method từ class Staff
     */
    @Override
    public void displaySalary(){
    	System.out.println("SALARY TABLE OF EMPLOYEES");
    	System.out.println("Manager name: " + super.getName());
		System.out.println("Manager gender: " + super.getGender());
		System.out.println("Manager age: " + super.getAge());
		System.out.println("Manager id: " + super.getId());
        System.out.println("Manager coefficients salary: " + super.getCoefficients_salary());
        System.out.println("Manager title: " + title);
        System.out.println("Manager salary: " + getSalary());
        
    }


}//Manager

