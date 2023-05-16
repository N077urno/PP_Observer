/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_observer_2023;

/**
 *
 * @author nando
 */

public class PP_Observer_2023 {

    public static void main(String[] args) {
        Observable observable = new Observable();
        
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Observer observer3 = new ConcreteObserver("Observer 3");
        Observer observer4 = new ConcreteObserver("Observer 4");
        Observer observer5 = new ConcreteObserver("Observer 5");
        
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        observable.addObserver(observer4);
        observable.addObserver(observer5);
        
        observable.notifyObservers();
        
        System.out.println("-----------");
        
        observable.removeObserver(observer2);
        observable.removeObserver(observer4);
        
        observable.notifyObservers();
        
        System.out.println("-----------");
        
        observable.addObserver(observer4);
        
        observable.notifyObservers();
        
        System.out.println("-----------");
    }
}
