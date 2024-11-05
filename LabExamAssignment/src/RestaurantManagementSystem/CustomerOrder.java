package RestaurantManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class CustomerOrder {
    private String orderId;
    private Map<MenuItem, Integer> itemList;
    private double totalPrice;

    public CustomerOrder(String orderId) {
        this.orderId = orderId;
        this.itemList = new HashMap<>();
        this.totalPrice = 0;
    }

    public void addItem(MenuItem item, int quantity) {
        itemList.put(item, quantity);
        totalPrice += item.getPrice() * quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public Map<MenuItem, Integer> getItemList() {
        return itemList;
    }

   
    public String toString() {
        StringBuilder summary = new StringBuilder("Order ID: " + orderId + "\n");
        for (Map.Entry<MenuItem, Integer> entry : itemList.entrySet()) {
            summary.append(entry.getKey().getItemName())
                    .append(" x ")
                    .append(entry.getValue())
                    .append(" = ")
                    .append(entry.getKey().getPrice() * entry.getValue())
                    .append("\n");
        }
        summary.append("Total Price: ").append(totalPrice);
        return summary.toString();
    }
}
