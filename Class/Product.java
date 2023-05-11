package Class;

public class Product {
    private String productName;
    private Double productCost;
    private Integer productQuantity;

    public Product (String productName, double productCost, Integer productQuantity) {
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
    }
    public void printProduct() {
        System.out.println("Gallon of " + this.productName + " cost " + this.productCost + " and " + this.productQuantity + " units were purchased.");
    }
    public void totalCost() {
        this.productCost *= this.productQuantity;
        System.out.println("Total cost is: "+ this.productCost);
    }
}