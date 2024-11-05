package RestaurantManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MenuRepository {
    private final String filePath ="D:\\Rahul Patil\\Rahul patil\\Rahul patil\\LabExamTextFiles\\RestaurantManagementSystem\\Menu.txt"; 

    public void saveMenu(List<MenuItem> menu) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (MenuItem item : menu) {
                writer.write(item.getItemId() + "," + item.getItemName() + "," + item.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving menu: " + e.getMessage());
        }
    }

    public List<MenuItem> loadMenu() {
        List<MenuItem> menu = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                menu.add(new MenuItem(parts[0], parts[1], Double.parseDouble(parts[2])));
            }
        } catch (IOException e) {
            System.err.println("Error loading menu: " + e.getMessage());
        }
        return menu;
    }
}
