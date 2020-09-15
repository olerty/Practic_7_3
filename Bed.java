package com.company;

public class Bed extends Furniture {

    public Bed(float weight, float length, float width, float height, String color, int numSeats){
        super(weight, length, width, height, color, numSeats);
    }

    @Override
    public void tell() {
        System.out.println("Я Кровать!" +
                "\nМои размеры: " + getWidth() + " x " +
                getLength() + " x " + getHeight() +
                "\nЯ вешу " + getHeight() + " кг" +
                "\nМой цвет " + getColor() +
                "\nНа меня лягут " + getNumSeats() + " человек(а)");
    }
}
