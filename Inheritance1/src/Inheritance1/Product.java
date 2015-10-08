package Inheritance1;

import java.text.NumberFormat;

public class Product
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    public Product()
    {
        code = "";
        description = "";
        price = 0;
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }
    public void whoAmI(){
    	System.out.println("I am a Product.");
    }
    private String getFormattedPrice() {
		
    	NumberFormat currency = 
                NumberFormat.getCurrencyInstance();
            return currency.format(price);
	}
	// create public access for the count variable
    public static int getCount()   
    {                              
        return count;
    }
}