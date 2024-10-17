//package LinkedList;
//
////public class LinkD {
//
//
//
//
//import java.util.Scanner;
//
//class Employee {
//    int id;
//    String name;
//    double salary;
//    String email;
//    Employee next;
//
//    Employee(int id, String name, double salary, String email) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//        this.email = email;
//        this.next = null;
//    }
//}
//
//class EmployeeList {
//    private Employee head;
//
//    
//    public void addEmployee(int id, String name, double salary, String email) {
//        if (findEmployee(id) != null) {
//            System.out.println("Error: Employee ID " + id + " already exists.");
//            return;
//        }
//        Employee newEmployee = new Employee(id, name, salary, email);
//        if (head == null) {
//            head = newEmployee;
//        } else {
//            Employee current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newEmployee;
//        }
//        System.out.println("Employee " + name + " registered successfully.");
//    }
//
//
//    public Employee findEmployee(int id) {
//        Employee current = head;
//        while (current != null) {
//            if (current.id == id) {
//                return current;
//            }
//            current = current.next;
//        }
//        return null;
//    }
//
//   
//    public void displayAllEmployees() {
//        if (head == null) {
//            System.out.println("No employees in the system.");
//            return;
//        }
//        Employee current = head;
//        System.out.println("Employee List:");
//        while (current != null) {
//            System.out.println("ID: " + current.id + ", Name: " + current.name + ", Salary: " + current.salary + ", Email: " + current.email);
//            current = current.next;
//        }
//    }
//}
//
////public class EmployeeManagementSystem {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        EmployeeList employeeList = new EmployeeList();
//
//        while (true) {
//            System.out.println("\nEmployee Management System");
//            System.out.println("1. Add Employee");
//            System.out.println("2. Find Employee by ID");
//            System.out.println("3. Display All Employees");
//            System.out.println("4. Exit");
//            System.out.print("Choose an option: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter Employee ID: ");
//                    int id = scanner.nextInt();
//                    scanner.nextLine(); 
//                    System.out.print("Enter Employee Name: ");
//                    String name = scanner.nextLine();
//                    System.out.print("Enter Employee Salary: ");
//                    double salary = scanner.nextDouble();
//                    scanner.nextLine(); // Consume newline
//                    System.out.print("Enter Employee Email: ");
//                    String email = scanner.nextLine();
//                    employeeList.addEmployee(id, name, salary, email);
//                    break;
//                case 2:
//                    System.out.print("Enter Employee ID to search: ");
//                    int searchId = scanner.nextInt();
//                    Employee employee = employeeList.findEmployee(searchId);
//                    if (employee != null) {
//                        System.out.println("Employee found: ID: " + employee.id + ", Name: " + employee.name + ", Salary: " + employee.salary + ", Email: " + employee.email);
//                    } else {
//                        System.out.println("Employee not found.");
//                    }
//                    break;
//                case 3:
//                    employeeList.displayAllEmployees();
//                    break;
//                case 4:
//                    System.out.println("Exiting the system.");
//                    scanner.close();
//                    return;
//                default:
//                    System.out.println("Invalid option. Please try again.");
//            }
//        }
//    }
//}
