class Product {
    private int inventoryNumber;
    private String brand;
    private String name;
    private double price;

    public Product(int inventoryNumber, String brand, String name, double price) {
        this.inventoryNumber = inventoryNumber;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Inventory Number: " + inventoryNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}