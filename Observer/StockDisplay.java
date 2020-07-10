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
import java.util.HashSet;
import java.util.Iterator;

public class StockDisplay implements Observer
{
    @Override
    public void update(HashSet products)
    {
        Iterator<Product> itr = products.iterator();
        while(itr.hasNext())
        {
            System.out.println((itr.next().toString()));
        }
        System.out.println();
    }
}
