package com.company;

public class FurnitureShop {
    private Sofa sofa = new Sofa(30.0f, 12.0f, 13.0f, 4.0f, "красный",5);
    private Armchair armchair = new Armchair(5.0f, 3.0f, 4.0f, 4.0f, "синий",1);
    private Bed bed = new Bed(10.0f, 2.0f, 5.0f, 4.0f, "белый",2);

    public void shop(){
        sofa.tell();
        armchair.tell();
        bed.tell();
    }
}
