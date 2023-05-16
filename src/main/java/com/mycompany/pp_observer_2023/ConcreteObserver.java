/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_observer_2023;

/**
 *
 * @author nando
 */
public class ConcreteObserver implements Observer {
    private String name;
    
    public ConcreteObserver(String name){
        this.name = name;
    }
    
    @Override
    public void update(){
        System.out.println("Observer "+name+" foi notificado");
    }
}
