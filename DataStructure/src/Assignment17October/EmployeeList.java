package Assignment17October;

public class EmployeeList {

	
	private Employee head;
	
	public void addEmployee(int id , String name, double salary , String email)
	{
		
		
		
		  if (findEmployee(id) != null) {
            System.out.println("Error: Employee ID " + id + " already exists.");
            return;
        }
        Employee newEmployee = new Employee(id, name, salary, email);
        if (head == null) {
            head = newEmployee;
        } else {
            Employee current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEmployee;
        }
        System.out.println("Employee " + name + " registered successfully.");
    }
	
	
	public Employee findEmployee(int id)
	{
		
		Employee current= head;
		while(current!=null)
		{
			
			if(current.id==id)
			{
				return current;
			}
			current=current.next;
		}
		return current;
		
	}
	
	public void displayAllEmployees()
	{
		if(head==null)
		{
			System.out.println("There is no employee in a list !");
			return;
		}
		
		Employee current= head;
		System.out.println("Employee list :");
		
		 while (current != null) {
           System.out.println("ID: " + current.id + ", Name: " + current.name + ", Salary: " + current.salary + ", Email: " + current.email);
           current = current.next;
       }
		
		
	}
	
	}
	

