package Inheritance1;

public class Software extends Product {
    private String programmer;
    private String platform; //linux, mac, or pc
    private String os; 
    @Override
    public void whoAmI(){
    	System.out.println("I am a piece of software.");
    }
}