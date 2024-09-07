package com.package1;

// Local
import com.package1.product.ProductForSale;
import com.package1.product.Book;
import com.package1.product.Electronic;
import com.package1.product.Clothing;
import com.package1.order.OrderedItem;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<ProductForSale> productForSales;
    private List<OrderedItem> currentOrder;

    // Constructor
    public Store() {
        this.productForSales = new ArrayList<>();
        this.currentOrder = new ArrayList<>();
    }

    public void addProduct(ProductForSale product) {
        productForSales.add(product);
    }

    public void printOrder() {
        for (ProductForSale product : productForSales) { 
            product.showDetails();
            System.out.println();
        }
    }

    public void addItemToOrder(OrderedItem orderedItem) {
        currentOrder.add(orderedItem);
    }

    public void printReceipt() {
        double total = 0;
        System.out.println("Receipt");
        for (OrderedItem item : currentOrder) { 
            item.product().printPricedItem(item.qty());
            total += item.product().getSalesPrice(item.qty());
        }
        System.out.println("Total: $" + total);
    }

    public static void main(String[] args) {
        Store store = new Store();

        // Menambahkan produk ke dalam toko
        store.addProduct(new Book("Book", 100.0, "Bumi", "Tere Liye"));
        store.addProduct(new Electronic("Laptop", 15000.00, "Asus ROG", "ASUS"));
        store.addProduct(new Clothing("Jas", 500000.00, "Jas Unida", "L"));

        // Cetak detail produk yang akan dijual
        store.printOrder();

        // Menambahkan beberapa item ke order
        store.addItemToOrder(new OrderedItem(new Book("Book", 100.0, "Bumi", "Tere Liye"), 4));
        store.addItemToOrder(new OrderedItem(new Electronic("Laptop", 15000.00, "Asus ROG", "ASUS"), 1));

        store.printReceipt();
    }
}
