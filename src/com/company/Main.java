package com.company;


public class Main {
    public static void main(String[] args) {
        Box Box  = new Box ( -2, 5, 2);
        Box Box1 = new Box ( -2, 5, 2);
        Box Box2 = new Box ( 3, 5, 2);
        Box Box3 = new Box ( 5, 5, 2, "черный", "дерево");
        Box Box4 = new Box ( 5, 5, 2);
        Box Box5 = new Box ( 6, 5, 2, "синий","картон");

        Box2.setColor("красный");
        Box2.setMaterial("пластик");
        Box1.setHeight(-5);
        Box1.setIsLong(1);
        Box1.setWidth(1);

        Box.getWidth();
        Box.getIsLong();
        Box.getHeight();

        System.out.println(Box.getValue());
        System.out.println(Box3.getValue());
        System.out.println(Box4.getValue());
        System.out.println(Box5.getValue());

        System.out.println("Объём " + Box1.getValue() + " л");
        System.out.println("Цвет и материал коробки: " + Box1.getColor() +" , " + Box1.getMaterial());

        System.out.println("Объём " + Box3.getValue() + " л");
        System.out.println("Цвет и материал коробки: " + Box3.getColor() +" , " + Box3.getMaterial());

        System.out.println("Объём " + Box5.getValue() + " л");
        System.out.println("Цвет и материал коробки: " + Box5.getColor() +" , " + Box5.getMaterial());

   }
}
