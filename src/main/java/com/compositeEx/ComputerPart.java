package com.compositeEx;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ComputerPart{

}

interface Component
{

    void showPrice();
}

class Leaf implements Component {

    String name;
    int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price );
    }
}

class Composite implements Component{

    public Composite(String name) {
        this.name = name;
    }

    String name;
    List<Component> components = new ArrayList<>();

    public void addComponent(Component com)
    {
        components.add(com);
    }
    @Override
    public void showPrice() {

        for(Component c:components)
        {
            c.showPrice();
        }
    }
}
