package org.example;

public class Menu {
    private String name;
    private String description;


    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
