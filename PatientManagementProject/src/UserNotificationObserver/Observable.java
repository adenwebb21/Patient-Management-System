/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserNotificationObserver;

/**
 *
 * @author adenw
 */
public interface Observable {
    
    /**
     *
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     *
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     *
     */
    public void notifyObservers();

}
