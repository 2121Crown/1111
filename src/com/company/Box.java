package com.company;


public class Box {

    private int height;
    private int width;
    private int isLong;
    private String color;
    private String material;


    public Box(int height, int width, int isLong) {

        if (isLong <= 0 || height <= 0 || width <= 0) {
            System.out.println("Неверно задано значение");
         } else {
        this.height = height;
        this.width = width;
        this.isLong = isLong;}
    }
    public Box(int height, int width, int isLong, String color,  String material) {

        this.height = height;
        this.width = width;
        this.isLong = isLong;
        this.color = color;
        this.material = material;

        if (isLong <= 0 || height <= 0 || width <= 0) {
            System.out.println("Неверно задано значение");
        }}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("Неверно задано значение");
            return;
        }
        this.height = height;

    }    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.out.println("Неверно задано значение");
            return;
        }
        this.width = width;
    }
    public int getIsLong() {
        return isLong;
    }

    public void setIsLong(int isLong) {
        if (isLong <= 0){
            System.out.println("Неверно задано значение");
            return;
    }
    this.isLong = isLong;

}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public int getValue () {

            return height * width * isLong;

        }
    }
