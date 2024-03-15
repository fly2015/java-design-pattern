/*
 * Observable.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package behavioural.observer.stock.simple;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public interface Observable
{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}



/*
 * Changes:
 * $Log: $
 */