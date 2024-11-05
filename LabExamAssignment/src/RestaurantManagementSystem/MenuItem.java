package RestaurantManagementSystem;

public class MenuItem {
    private String itemId;
    private String itemName;
    private double price;

    public MenuItem(String itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }

 
    public String toString() {
        return String.format("ID: %s, Name: %s, Price: %.2f", itemId, itemName, price);
    }
}
