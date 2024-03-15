/*
 * Stock.java
 *
 * Copyright by CRIF AG
 * Z�rich
 * All rights reserved.
 */
package behavioural.observer.stock.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class WareHouse
{
    private Set<Product> productList = new HashSet<>(); 
    public void importProduct(Product product)
    {
        productList.add(product);
        if(product.isInStock())
        {
            product.notifyObservers();
        }
    }
}



/*
 * Changes:
 * $Log: $
 */