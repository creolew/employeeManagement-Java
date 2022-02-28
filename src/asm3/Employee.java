package asm3;

import java.util.Scanner;

public class Employee extends Staff {
    private int extraTime;

    
    /**
     * CONSTRUCTOR
     */
    public Employee() {
    	super();
	}
    public Employee ( String name, String gender, int age, String id, double coefficients_salary, String startDay, String department, int day_off, int extraTime){
        super(name, gender,  age,  id,  coefficients_salary,  startDay,  department,  day_off);
        this.extraTime= extraTime;
    }
    

    /**
     * Ghi đè method displayInformation() từ class Staff
     */
    @Override
	public void displayInformation() {
		System.out.println("Employee name: " + super.getName());
		System.out.println("Employee gender: " + super.getGender());
		System.out.println("Employee age: " + super.getAge());
		System.out.println("Employee id: " + super.getId());
        System.out.println("Employee coefficients salary: " + super.getCoefficients_salary());
        System.out.println("Employee start day: " + super.getStartDay());
        System.out.println("Employee department: " + super.getDepartment());
        System.out.println("Employee day off: " + super.getDay_off());
        System.out.println("Employee extra time: " + extraTime);
	
    }
    

    
    /**
     * Ihừa kế từ từ class Staff và thêm các thuộc tính mới
     */
    public void inputInfo() {
    	super.inputInfo();
    	Scanner input= new Scanner(System.in);
    	System.out.println("Nhập số giờ làm thêm: ");
    	extraTime= input.nextInt();
    }
    
  
    /**
     * Interface tính lương từ Interface ICalculator
     */
    @Override
    public int getSalary(){
        return ( (int)super.getCoefficients_salary()*3000000 + extraTime*200000);
      
    }

    /**
     * Ghi đè displaySalary() method từ class Staff
     */
    @Override
    public void displaySalary(){
    	System.out.println("SALARY TABLE OF EMPLOYEES");
    	System.out.println("Employee name: " + super.getName());
		System.out.println("Employee gender: " + super.getGender());
		System.out.println("Employee age: " + super.getAge());
		System.out.println("Employee id: " + super.getId());
        System.out.println("Employee coefficients salary: " + super.getCoefficients_salary());
        System.out.println("Employee extra time: " + extraTime);
        System.out.println("Employee salary: " + getSalary());
        
    }
    
    


}
    
    