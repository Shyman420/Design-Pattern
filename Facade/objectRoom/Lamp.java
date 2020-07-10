/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade.objectRoom;

/**
 *
 * @author Icad
 */
public class Lamp extends RoomObject{
    public Lamp(){
        
    }
    public void on(){
        System.out.println("Lights : on");
    }
    
    public void off(){
        System.out.println("Lights : off");
    }
    
    @Override
    public void getMessages(){
        System.out.println("Lamp : " + getStatus());
    }
}
