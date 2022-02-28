package asm3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;


public class HumanResource {
	
	static ArrayList<Staff> employeeList= new ArrayList<Staff>();
	
	static int choose;
	static Scanner input= new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
           	
    	System.out.println("--- HUMAN RESOURCES ---");
    	
    	do {
    		showMenu();
    		System.out.println("Chọn 1 chức năng: ");
    		choose= input.nextInt();
    		
    		switch(choose) {
    			case 1: //hiển thị nhân viên
    				showEmployeeList();
    				break;
    			case 2:
    				showDepartment();
    				break;
    			case 3: 				  		
    			showEmployeePerDepartment();		
    			break;
    			case 4:// thêm nhân viên
    				addEmployee();  				
    				break;
    			case 5: //tìm kiếm nhân viên

    				searchEmployee();
    				break;
    			case 6: // hiển thị bảng lương toàn công ty
    				showSalaryTable();  				
    				break;
    			    			
    			
    			case 7: //hiển thị bảng lương tăng dần

    				showSalaryTableIncrease();
    				break;
    			case 8: //hiển thị bảng lương giảm dần
    				showSalaryTableDecrease();
    				break;
    			
    		}
    		
    	}while(choose!=8);
    
    
    }
	
	/**
     * showMenu() method
     */
    static void showMenu() {
    	System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty");
    	System.out.println("2. Hiển thị các bộ phận trong công ty");
    	System.out.println("3. Hiển thị các nhân viên theo từng bộ phận");
    	System.out.println("4. Thêm nhân viên mới vào công ty");
    	System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
    	System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty");
    	System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần");
    	System.out.println("8. Hiển thị bảng lương của nhân viên theo thứ tự giảm dần");
    
    	
    }

    /**
     * showEmployeeList() method
     */
    public static void showEmployeeList() {
    	for(int i= 0; i< employeeList.size(); i++) {
			System.out.println("LIST OF EMPLOYEES");
			employeeList.get(i).displayInformation(); 					
			System.out.println("------");
		}				
    }

    /**
     * showDepartment() method
     */
    
    public static void showDepartment() {
    	Department s = new Department();
		
		System.out.println(s.toString());
    }

    /**
     * showEmployeePerDepartment() method
     */
    public static void showEmployeePerDepartment() {
		input.nextLine();
		int count2= 0;
		int dep;
		
		do {
			System.out.println("Nhập tên bộ phận cần hiển thị: 1= Business, 2= Technical, 3= HR");
			dep= input.nextInt();
		}while(dep!= 1 && dep!=2 && dep!=3);
		
		
		if(dep== 1) {
			for(Staff stff : employeeList) {
				if(stff. getDepartment().equalsIgnoreCase("Business")) {
					System.out.println("DEPARTMENT BUSINESS");
					stff.displayInformation();
					count2++;
				}
			}
		}

		if(dep== 2) {
			for(Staff stff : employeeList) {
				if(stff. getDepartment().equalsIgnoreCase("Technical")) {
					System.out.println("DEPARTMENT TECHNICAL");
					stff.displayInformation();
					count2++;
				}
			}
		}
		
		
		if(dep== 3) {
			for(Staff stff : employeeList) {
				if(stff. getDepartment().equalsIgnoreCase("HR")) {
					System.out.println("DEPARTMENT HR");
					stff.displayInformation();
					count2++;
				}
			}
		}
		
		if(count2== 0) {
			System.err.println("Bộ phận không có nhân viên");
		}
		
    }

    /**
     * addEmployee() method
     */
    public static void addEmployee() {
    	String k;
		input.nextLine();
	
		
		do {
			System.out.println("Nhập 1 để thêm nhân viên, 2 để thêm quản lý");
			k= input.nextLine();
		}while(!(k.equals("1")) && !(k.equals("2")));
		
		if(k.equals("1")) {
			int n;
			System.out.println("Nhập số nhân viên cần thêm: ");
			n= input.nextInt();
			for(int i= 0; i< n; i++) {
				Employee emp= new Employee();
				emp.inputInfo();
				employeeList.add(emp);
				System.out.println("------");
				

			}
		
		}
		else if(k.equals("2")) {
			int n;
			System.out.println("Nhập số nhân viên cần thêm: ");
			n= input.nextInt();
			for(int i= 0; i< n; i++) {
				Manager mng= new Manager();
				mng.inputInfo();
				employeeList.add(mng);
				System.out.println("------");
	
			}
		}
    }

    /**
     * searchEmployee() method
     */
    public static void searchEmployee() {
    	input.nextLine();
		System.out.println("Nhập tên nhân viên hoặc mã số nhân viên cần tìm: ");
		String x= input.nextLine();
		int count= 0;
		for(Staff stff : employeeList) {
			if(stff.getName().equals(x) || stff.getId().equals(x)) {
				System.out.println("INFORMATION OF EMPLOYEE");
				stff.displayInformation();
				count++;
			}
		}
		if(count== 0) {
			System.err.println("Không tìm thấy nhân viên");
		}
	
    }

    /**
     * showSalaryTable() method
     */
    public static void showSalaryTable() {
    	for(int i= 0; i< employeeList.size(); i++) {
			employeeList.get(i).displaySalary();
			System.out.println("------");
		}
    }
    
    
    /**
     * showSalaryTableIncrease() method
     */
    public static void showSalaryTableIncrease() {
    	Collections.sort(employeeList, new Comparator <Staff>() {
			
			@Override
			public int compare(Staff o1, Staff o2) {
				// TODO Auto-generated method stub
				return o1.getSalary() <= o2.getSalary()?-1:1;
			}
			
		});
		
		//hiển thị
		for(int i= 0; i< employeeList.size(); i++) {
			System.out.println("LIST OF EMPLOYEES");
			employeeList.get(i).displaySalary();
			System.out.println("------");
		}
    }

    /**
     * showSalaryTableDecrease() method
     */
    public static void showSalaryTableDecrease() {
    	Collections.sort(employeeList, new Comparator <Staff>() {

			@Override
			public int compare(Staff o1, Staff o2) {
				// TODO Auto-generated method stub
				return o1.getSalary() >= o2.getSalary()?-1:1;
			}
			
		});
		
		//hiển thị
		for(int i= 0; i< employeeList.size(); i++) {
			System.out.println("LIST OF EMPLOYEES");
			employeeList.get(i).displaySalary();
			System.out.println("------");
		}
    }
}

