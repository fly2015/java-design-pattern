/*
 * Subcriber.java
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
public class Subscription
{
    public void subscribe(Product product, String email)
    {
        ProductObserver productObservable = new ProductObserver();
        productObservable.setEmail(email);
        
        product.addObserver(productObservable);
        System.out.println(String.format("The %s subscribed product %s", email, product));
    }
}



/*
 * Changes:
 * $Log: $
 */