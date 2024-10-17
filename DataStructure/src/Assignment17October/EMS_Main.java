package Assignment17October;
import java.util.Scanner;
public class EMS_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		EmployeeList emplist= new EmployeeList();
		
		while(true)
		{
			
			System.out.println("*****Welcome to Employee Management System ******");
			System.out.println("1. <<<<<<<Add Employees>>>>>");
			System.out.println("2. <<<<Find Employees by Id>>");
			System.out.println("3. <Display All the Employees>");
			System.out.println("4. <<<<<<<<<<<<<Exit>>>>>>>>>>");
			System.out.println("Enter your choice....");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			
			case 1:
				
				System.out.println("Enter the employye id ");
				int id= sc.nextInt();
				
				System.out.println("Enter the employye name ");
				String name= sc.next();
			
				
				System.out.println("Enter the employye salary ");
				double salary= sc.nextDouble();
			
				
				System.out.println("Enter the email id ");
				String email= sc.next();
			
				emplist.addEmployee(id, name, salary, email );
				
				break;
				
			case 2:
				
				 System.out.print("Enter Employee ID to search: ");
               int searchId = sc.nextInt();
               Employee employee = emplist.findEmployee(searchId);
               if (employee != null) {
                   System.out.println("Employee found: ID: " + employee.id + ", Name: " + employee.name + ", Salary: " + employee.salary + ", Email: " + employee.email);
               } else {
                   System.out.println("Employee not found.");
               }
              break;
              
			 case 3:
				 emplist.displayAllEmployees();
               break;
           case 4:
               System.out.println("Exiting the system.");
               sc.close();
               return;
           default:
              System.out.println("Invalid option. Please try again.");
				
			}
			

			
		}
	}

}
