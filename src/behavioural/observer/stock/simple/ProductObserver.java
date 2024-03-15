/*
 * ProductObserver.java
 *
 * Copyright by Hien Ng
 * Da Nang, VN
 * All rights reserved.
 */
package behavioural.observer.stock.simple;

import java.util.Objects;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ProductObserver implements Observer
{
    private String email;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(email);
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
        ProductObserver other = (ProductObserver)obj;
        return Objects.equals(email, other.email);
    }

    /**
     * @see behavioural.observer.stock.simple.Observer#update()
     */
    @Override
    public void update(Product product)
    {
        System.out.println(String.format("Hi [%s].Product [%s] are available.", this.email, product));
    }
    
    
}



/*
 * Changes:
 * $Log: $
 */