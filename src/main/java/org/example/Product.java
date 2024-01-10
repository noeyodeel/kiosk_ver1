package org.example;

public class Product extends Menu{
    private int price;

    public Product(int id,String name,String descretion, int price){
        super(id, name,descretion);
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
    @Override
    public int getId(){
        return super.getId();
    }

}
