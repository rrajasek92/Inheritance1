package Inheritance1;

public class Book extends Product {
    private String author;
    private int pages;
@Override
public void whoAmI(){
	System.out.println("I am a Book.");
}
}