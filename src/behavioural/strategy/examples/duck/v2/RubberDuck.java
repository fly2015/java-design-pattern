/*
 * RubberDuck.java
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
public class RubberDuck extends Duck implements Flyable, Quackable
{

    /**
     * @see behavioural.strategy.examples.duck.v1.Duck#quack()
     */
    @Override
    public void quack()
    {
        System.out.println("Can not quack!");
    }

    /**
     * @see behavioural.strategy.examples.duck.v1.Duck#fly()
     */
    @Override
    public void fly()
    {
        System.out.println("Can not fly!");
    }

}



/*
 * Changes:
 * $Log: $
 */