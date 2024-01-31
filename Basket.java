package org.example;

//3)Создать класс Basket, содержащий массив купленных товаров.
public class Basket {
    static Goods[] ivanov = new Goods[3];

    public Basket() {
    }

    public static void main (String[] args){
        for (int i = 0; i<3; i++){
            System.out.println(ivanov[i]);
        }
    }


}
