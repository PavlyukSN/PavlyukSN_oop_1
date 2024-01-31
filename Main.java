
//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//3)Создать класс Basket, содержащий массив купленных товаров.
//4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.

// не разобрался как выполнить 5 и 6, и с массивами, порекомендуйте пожалуйтса материал для изучения
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
//Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
//
package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Goods milkOne = new Goods("Удоево",70,5);
        Goods milkTwo = new Goods("Долина", 60, 4);
        Goods butterOne = new Goods("Кваша", 130, 3);
        Goods breadOne = new Goods("Хлеб", 50, 4);
        ArrayList<Goods> milky = new ArrayList<>();
        ArrayList<Goods> meat = new ArrayList<>();
        Rank categoryMilk = new Rank("Первый зал",milky);
        Rank categoryMeat = new Rank("Второй зал",meat);
        Rank categoryCandy = new Rank();

        Goods[] ivanov = new Goods[3];
        ivanov[0] = milkOne;
        ivanov[1] = butterOne;
        ivanov[2] = breadOne;

        System.out.println(milkOne);
        System.out.println(milkTwo);
        System.out.println(butterOne);
        System.out.println(breadOne);
        System.out.println(categoryMilk);
        System.out.println(categoryCandy);
        System.out.println(categoryMeat);

        System.out.println(Arrays.toString(ivanov));

    }
}