/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Icad
 */
public class Mains{

    public static void main(String[] args) {
        Warehouse gudangBarang = new Warehouse();
        StockDisplay layar = new StockDisplay();

        gudangBarang.addObserver(layar);

        Product Baju = new Product("Kaos", 10);
        Product Celana = new Product("Kulot", 10);

        gudangBarang.addProduct(Baju);
        gudangBarang.addProduct(Celana);
        //notify observer
        gudangBarang.notifyObservers();
        //add stock
        gudangBarang.addProductStock("Kaos", 5);
        gudangBarang.addProductStock("Kulot", 7);
    }
}
