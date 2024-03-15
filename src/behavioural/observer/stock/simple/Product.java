/*
 * Product.java
 *
 * Copyright by Hien Ng
 * Da Nang, VN
 * All rights reserved.
 */
package behavioural.observer.stock.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Product implements Observable
{
    private String id;
    private String name;
    private Integer quantity;
    private Double price;
    private boolean isInStock;
    private List<Observer> observers = new ArrayList<>();
    
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Integer getQuantity()
    {
        return quantity;
    }


    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }


    public Double getPrice()
    {
        return price;
    }


    public void setPrice(Double price)
    {
        this.price = price;
    }

    
    public boolean isInStock()
    {
        return isInStock;
    }


    public void setInStock(boolean isInStock)
    {
        this.isInStock = isInStock;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        Product other = (Product)obj;
        return Objects.equals(id, other.id);
    }
    
    
    @Override
    public String toString()
    {
        return "Product [id=" + id + ", name=" + name + "]";
    }
    /**
     * @see behavioural.observer.stock.simple.Observable#addObserver(behavioural.observer.stock.simple.Observer)
     */
    @Override
    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }
    /**
     * @see behavioural.observer.stock.simple.Observable#removeObserver(behavioural.observer.stock.simple.Observer)
     */
    @Override
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }
    /**
     * @see behavioural.observer.stock.simple.Observable#notify(behavioural.observer.stock.simple.Observer)
     */
    @Override
    public void notifyObservers()
    {
        for (Observer observer : observers)
        {
            observer.update(this);
        }
    }

    
}



/*
 * Changes:
 * $Log: $
 */