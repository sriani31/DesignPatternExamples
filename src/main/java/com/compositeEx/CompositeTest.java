package com.compositeEx;

import java.util.concurrent.atomic.DoubleAdder;

public class CompositeTest {
    public static void main(String Args[])
    {
        Component hd = new Leaf("HDD" , 3000);
        Component mouse = new Leaf("Mouse", 1200);
        Component monitor = new Leaf("Monitor", 1800);
        Component ram = new Leaf("RAM", 1200);
        Component cpu = new Leaf("CPU", 1500);


        Composite ph = new Composite("Peri");
        Composite cabin = new Composite("Cabinet");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponent(ram);
        mb.addComponent(cpu);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabin.addComponent(hd);
        cabin.addComponent(mb);


        computer.addComponent(ph);
        computer.addComponent(cabin);

        //ram.showPrice();
        //cabin.showPrice();

        computer.showPrice();

    }
}
