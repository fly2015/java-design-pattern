/*
 * DecoyDuck.java
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
public class DecoyDuck extends Duck implements Flyable, Quackable
{

    /**
     * @see structural.strategy.duck.v1.Duck#quack()
     */
    @Override
    public void quack()
    {
        System.out.println("quack quack!");
    }

    /**
     * @see structural.strategy.duck.v1.Duck#fly()
     */
    @Override
    public void fly()
    {
        System.out.println("Fly on the lake!");
    }

}



/*
 * Changes:
 * $Log: $
 */