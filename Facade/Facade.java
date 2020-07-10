package Facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Facade.objectRoom.AC;
import Facade.objectRoom.Lamp;

/**
 *
 * @author Icad
 */
public class Facade {
    private TV newTv;
    private Lamp newLight;
    private AC newAc;
    

    public Facade(TV newTv, Lamp newLight, AC newAc){
        this.newAc = newAc;
        this.newLight = newLight;
        this.newTv = newTv;
    }
    
    public void startFilm(){
        newAc.on();
        newTv.on();
        newLight.off();        
    }
    
    public void endFilm(){
        newAc.off();
        newTv.off();
        newLight.on();
    }
}
