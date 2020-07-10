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
public class Product 
{
    private String productName;
    private int stock;

    public Product(String productName, int stock)
    {
        this.productName = productName;
        this.stock = stock;
    }

    public String getProductName() 
    {
        return productName;
    }

    public int getStock() 
    {
        return stock;
    }

    private void setStock(int stock)
    {
        this.stock = stock;
    }

    public void addStock(int additions)
    {
        setStock(getStock() + additions);
    }

    @Override
    public String toString() 
    {
        return ("Product: " + productName + ", stock: " + stock);
    }
}
