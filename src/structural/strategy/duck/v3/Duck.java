/*
 * Duck.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package structural.strategy.duck.v3;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public abstract class Duck
{
    private String type;
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    
    public void quack()
    {
        flyBehaviour.fly();
    }
    public void fly()
    {
        quackBehaviour.quack();
    }
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