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
public class AC extends RoomObject{
    public AC(){
        
    }
    public void on(){
        setStatus("on");
        getMessages();        
    }
    
    public void off(){
        setStatus("off");
        getMessages();
    }
    
    @Override
    public void getMessages(){
        System.out.println("AC : " + getStatus());
    }
}
