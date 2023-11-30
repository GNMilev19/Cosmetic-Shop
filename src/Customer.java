class Customer {
    private String name;
    private String address;
    private String egn;

    public Customer(String name, String address, String egn) {
        this.name = name;
        this.address = address;
        this.egn = egn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("EGN: " + egn);
    }
}