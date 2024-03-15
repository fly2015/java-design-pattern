/*
 * Process.java
 *
 * Copyright by Hien Ng
 * Da Nang, VN
 * All rights reserved.
 */
package behavioural.observer.stock.simple;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Process
{
    public static void main(String[] args)
    {
        // Product Data
        final Product product1 = new Product();
        product1.setId("product_1");
        product1.setName("Product 1");
        product1.setInStock(false);
        
        final Product product2 = new Product();
        product2.setId("product_2");
        product2.setName("Product 2");
        product2.setInStock(false);
        
        
        // User subscribe
        Subscription subscription = new Subscription();
        subscription.subscribe(product1, "email_a@gmail.com");
        subscription.subscribe(product1, "email_b@gmail.com");
        
        subscription.subscribe(product2, "email_c@gmail.com");
        subscription.subscribe(product2, "email_d@gmail.com");
        subscription.subscribe(product2, "email_e@gmail.com");
        
        // Import product to warehouse
        WareHouse wareHouse = new WareHouse();
        product1.setInStock(true);
        wareHouse.importProduct(product1);

        product2.setInStock(true);
        wareHouse.importProduct(product2);
    }
}



/*
 * Changes:
 * $Log: $
 */