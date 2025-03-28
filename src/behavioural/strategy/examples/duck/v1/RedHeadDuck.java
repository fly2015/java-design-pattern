/*
 * RedHeadDuck.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package behavioural.strategy.examples.duck.v1;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RedHeadDuck extends Duck
{
    /**
     * @see Duck#quack()
     */
    @Override
    public void quack()
    {
        System.out.println("Squeak!");
    }

    /**
     * @see Duck#fly()
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