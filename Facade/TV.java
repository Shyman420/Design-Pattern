/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Facade.objectRoom.RoomObject;

/**
 *
 * @author Icad
 */
public class TV extends RoomObject {
    public TV(){
        
    }
    public void on(){
        System.out.println("TV : on");
    }
    
    public void off(){
        System.out.println("TV : off");
    }
    
    @Override
    public void getMessages(){
        System.out.println("TV : " + getStatus());
    }
}
