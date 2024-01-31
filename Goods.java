package org.example;

import java.util.ArrayList;

//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
public class Goods{
    private String name;
    private int price;
    private int rating;

    public Goods() {
    }

    public Goods(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Списать на ноль можно, в минус нельзя");
        }
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Товар "+ name +
                " цена: " + price +
                " рейнинг: " + rating ;
    }
}
