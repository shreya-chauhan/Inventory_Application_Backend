package com.new_project.Inventory.Inventory;

public class InventoryVariables {
    private Long Product_ID;
    private String ProductName;
    private Float Price;
    private Long Quantity;

    public InventoryVariables() {
    }

    public InventoryVariables(Long product_ID, String productName, Float price, Long quantity) {
        Product_ID = product_ID;
        ProductName = productName;
        Price = price;
        Quantity = quantity;
    }

    public InventoryVariables(String productName, Float price, Long quantity) {
        ProductName = productName;
        Price = price;
        Quantity = quantity;
    }

    public Long getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(Long product_ID) {
        Product_ID = product_ID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "InventoryService{" +
                "Product_ID=" + Product_ID +
                ", ProductName='" + ProductName + '\'' +
                ", Price=" + Price +
                ", Quantity=" + Quantity +
                '}';
    }
}
