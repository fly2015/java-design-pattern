/*
 * Duck.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package structural.strategy.duck.v1;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public abstract class Duck
{
    private String type;
    public abstract void quack();
    public abstract void fly();
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
}



/*
 * Changes:
 * $Log: $
 */