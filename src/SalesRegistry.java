import java.util.ArrayList;
import java.util.List;

class SalesRegistry {
    private List<Product> products;
    private List<Customer> customers;
    private List<SalesRecord> salesRecords;

    public SalesRegistry() {
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.salesRecords = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addSalesRecord(SalesRecord salesRecord) {
        salesRecords.add(salesRecord);
    }

    public void displayAllData() {
        System.out.println("Products:");
        for (Product product : products) {
            product.displayInfo();
        }

        System.out.println("\nCustomers:");
        for (Customer customer : customers) {
            customer.displayInfo();
        }

        System.out.println("\nSales Records:");
        for (SalesRecord salesRecord : salesRecords) {

        }
    }

}