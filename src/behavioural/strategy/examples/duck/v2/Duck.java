/*
 * Duck.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package behavioural.strategy.examples.duck.v2;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public abstract class Duck
{
    private String type;
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
    public abstract void quack();
    public abstract void fly();
}



/*
 * Changes:
 * $Log: $
 */