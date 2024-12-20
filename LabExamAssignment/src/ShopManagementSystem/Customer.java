package ShopManagementSystem;

public class Customer {
    private String id;
    private String name;
    private String phone;

    public Customer(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

  
    public String getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }

    
    public String toString() {
        return String.format("ID: %s, Name: %s, Phone: %s", id, name, phone);
    }
}
