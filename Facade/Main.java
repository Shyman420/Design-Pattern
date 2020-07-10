package Facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Facade.objectRoom.*;
import java.util.Scanner;

/**
 *
 * @author Icad
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char option;
        boolean quit = false;
        Facade room = new Facade(new TV(), new Lamp(), new AC());
        System.out.println("Turning on the TV..");
        room.startFilm();
        while (quit == false) {
            System.out.print("Continue Watching? (y/n) : ");
            option = in.next().charAt(0);
            switch (option) {
                case 'y':
                    room.startFilm();
                    break;
                case 'n':
                    room.endFilm();
                    quit = true;
                    System.out.println("You're not watching TV anymore..");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
