/*
 * RedHeadDuck.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package structural.strategy.duck.v2;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RedHeadDuck extends Duck implements Flyable, Quackable
{
    /**
     * @see structural.strategy.duck.v1.Duck#quack()
     */
    @Override
    public void quack()
    {
        System.out.println("Squeak!");
    }

    /**
     * @see structural.strategy.duck.v1.Duck#fly()
     */
    @Override
    public void fly()
    {
        System.out.println("Fly on the sky!");
    }
}



/*
 * Changes:
 * $Log: $
 */