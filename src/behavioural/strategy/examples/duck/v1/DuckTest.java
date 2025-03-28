/*
 * DuckTest.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package behavioural.strategy.examples.duck.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DuckTest
{
    public static void main(String[] args)
    {
        
        List<Duck> ducks = new ArrayList<>();
        Duck d = new DecoyDuck();
        d.setType(DecoyDuck.class.getName());
        ducks.add(d);
        
        d = new RubberDuck();
        d.setType(RubberDuck.class.getName());
        ducks.add(d);
        
        d = new RedHeadDuck();
        d.setType(RedHeadDuck.class.getName());
        ducks.add(d);
        
        ducks.forEach((duck) -> 
        {
            System.out.println(duck.getType());
            duck.swim();
            duck.quack();
            duck.fly();
        });
        
    }
}



/*
 * Changes:
 * $Log: $
 */