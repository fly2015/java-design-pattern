/*
 * RubberDuck.java
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
public class RubberDuck extends Duck
{

    /**
     * @see Duck#quack()
     */
    @Override
    public void quack()
    {
        System.out.println("Can not quack!");
    }

    /**
     * @see Duck#fly()
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