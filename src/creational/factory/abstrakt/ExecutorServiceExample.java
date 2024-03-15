/*
 * ExecutorServiceExample.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package creational.factory.abstrakt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ExecutorServiceExample
{
    public static void main(String[] args)
    {
        // ============================================= 
        // Abstract Factory Interface:: Executors
        
        // ============================================= 
        // Concrete Factory Classes:
        // Different pool provide their own implementations of the ExecutorService interface.
        
        // ============================================= 
        // Abstract Products:
        // Future
        
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Future<Integer> future1 = newCachedThreadPool.submit(() -> {return 0;});
        
        ExecutorService newWorkStealingPool = Executors.newWorkStealingPool();
        Future<Integer> future2 = newWorkStealingPool.submit(() -> {return 0;});
    }
}



/*
 * Changes:
 * $Log: $
 */