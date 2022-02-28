package asm3;

import java.util.Scanner;

public abstract class Staff implements ICalculator{
    private String name;
    private String gender;
    private int age;
    private String id;
    private double coefficients_salary;
    private String startDay;
    private String department;
    private int day_off;
    

    /**
     * CONSTRUCTOR
     */
    public Staff() {
    	
    }
    
    public Staff(String name, String gender, int age, String id, double coefficients_salary, String startDay, String department, int day_off){
        this.name= name;
        this.gender= gender;
        this.age= age;
        this.id= id;
        this.coefficients_salary= coefficients_salary;
        this.startDay= startDay;
        this.department= department;
        this.day_off= day_off;
    }
  
    
    /**
     * displayInformation() method
     */
    public abstract void displayInformation();
   
    /**
     * displaySalary() method
     */
    public abstract void displaySalary();
 
    /**
     * getSalary() method
     */
    public abstract int getSalary();
 
    

    /**
     * inputInfo() method
     */
    public void inputInfo() {
    	Scanner input= new Scanner(System.in);
    	
    	//Nhập tên và kiểm tra Name có được nhập không
    	System.out.println("Nhập tên: ");

   	 	do{
   	 		name= input.nextLine();
   	 		boolean check= setName(name);
   	 		if(check) {break;}
   		
   	 	}while(true);
    	
   	 	//Nhập giới tính và kiểm tra giới tính có được nhập không
    	System.out.println("Nhập giới tính: ");
    	
    	do{
    		gender= input.nextLine();
   	 		boolean check= setGender(gender);
   	 		if(check) {break;}
   		
   	 	}while(true);
    	
    	//Nhập tuổi
    	System.out.println("Nhập tuổi: ");  	
    	age= input.nextInt();

    	//Nhập MSSV và kiểm tra MSSV có được nhập không
    	System.out.println("Nhập mã số nhân viên: ");
    	input.nextLine();
    	 do{
    		 id= input.nextLine();
    		boolean check= setId(id);
    		if(check) {break;}
    		
    	}while(true);
    
    	 //nhập hệ số lương
    	System.out.println("Nhập hệ số lương: ");
    	coefficients_salary= input.nextDouble();
    	input.nextLine();
    	
    	//nhập ngày và kiểm tra ngày bắt đầu làm có được nhập không
    	System.out.println("Nhập ngày bắt đầu làm (dd-mm-yyyy): ");    	
 	
   	 	do{
   	 		startDay= input.nextLine();
   	 		boolean check= setStartDay(startDay);
   	 		if(check) {break;}
   		
   	 	}while(true);
    	
    	
    	//nhập department và kiểm tra department có được nhập không
    	System.out.println("Nhập bộ phận ( gồm: Business, Technical, HR )");
    	do{
    		department= input.nextLine();
   	 		boolean check= setDepartment(department);
   	 		if(check) {break;}
   		
   	 	}while(true);
    	
    	
    	System.out.println("Số ngày nghỉ phép: ");
    	day_off= input.nextInt();
    }
     
    /**
     * GETTER, SETTER
     */
    public String getName() {
		return name;
	}
    //kiểm tra Name có được nhập không
	public boolean setName(String name) {
		if(name != "") {
			this.name= name;
			return true;
		}else {
			System.err.println("Nhập lại tên: ");
			return false;
		}
	}
	 //----
	
	public String getGender() {
		return gender;
	}
	//kiểm tra Gender có được nhập không
	public boolean setGender(String gender) {
		if(gender != "") {
			this.gender= gender;
			return true;
		}else {
			System.err.println("Nhập lại giới tính: ");
			return false;
		}
	}
	 //----
    
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age= age;
	}
	 //----
    
	public String getId() {
		return id;
	}

    //kiểm tra MSNV có được nhập hay không
    public boolean setId(String id) {
		if(id != null && id.length()== 5) {
			this.id= id;
			return true;
		}else {
			System.err.println("Nhập lại mã nhân viên gồm 5 kí tự: ");
			return false;
		}
        	
	}
 //----
   
    public double getCoefficients_salary() {
		return coefficients_salary;
	}

	public void setCoefficients_salary(int coefficients_salary) {
		this.coefficients_salary = coefficients_salary;
	}

	 //----
    public String getStartDay() {
		return startDay;
	}
    //Kiểm tra startDay có được nhập hay không
	public boolean setStartDay(String startDay) {
		if(startDay != "") {
			this.startDay= startDay;
			return true;
		}else {
			System.err.println("Nhập lại: ");
			return false;
		}
	}

	 //----

	
    public String getDepartment() {
		return department;
	}
  //Kiểm tra department có được nhập hay không
	public boolean setDepartment(String department) {
		if(department != "" && (department.equalsIgnoreCase("Business") || department.equalsIgnoreCase("Technical") || department.equalsIgnoreCase("HR"))) {
			this.department= department;
			return true;
		}else {
			System.err.println("Nhập lại: ");
			return false;
		}
	}

	 //----
    public int getDay_off() {
		return day_off;
	}

	public void setDay_off(int day_off) {
		this.day_off = day_off;
	}

	 //----

	 


}










