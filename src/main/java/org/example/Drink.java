package org.example;

public class Drink extends Menu{
    private int price;

    public Drink(String name,String descretion, int price){
        super(name,descretion);
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    @Override
    public String getName(){
        return super.getName();
    }
    @Override
    public String getDescription(){
        return super.getDescription();
    }
}
