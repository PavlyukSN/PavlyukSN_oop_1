package org.example;

import java.util.ArrayList;

//2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
public class Rank {

    private String section;
    ArrayList <Goods> goods;

    public Rank() {
    }

    public Rank(String section, ArrayList<Goods> goods) {
        this.section = section;
        this.goods = goods;
    }



    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public ArrayList<Goods> getMilky() {
        return goods;
    }

    public void setMilky(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "section='" + section + '\'' +
                ", goods=" + goods +
                '}';
    }

}
