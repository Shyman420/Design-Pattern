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
public class RoomObject {
    private String status;
    
    public void setStatus(String newStatus){
        status = newStatus;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void getMessages(){
        System.out.println(getStatus());
    }
}
