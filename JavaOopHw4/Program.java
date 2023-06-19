package JavaOopHw4;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void shiftFruits (Box<Fruit> fruitBoxOut, Box<Fruit> fruitBoxIn, int count) {
        if (
             ((fruitBoxOut.getFruit() instanceof Apple && fruitBoxIn.getFruit() instanceof Apple) ||
             (fruitBoxOut.getFruit() instanceof Orange && fruitBoxIn.getFruit() instanceof Orange)) &&
              fruitBoxOut.getQuantityFruitInBox() >= count) {
            fruitBoxOut.removeFruitInBox(count);
            fruitBoxIn.addFruitToBox(count);
        } else System.out.println("Операция невозможна");
    }

    public static void main(String[] args) {
        
        Apple apple = new Apple();
        Box <Fruit> boxApple1 = new Box<>(apple);
        System.out.println(boxApple1);

        boxApple1.addFruitToBox(3);
        System.out.println(boxApple1);
        System.out.println("Фрукты в коробке: " + boxApple1.getQuantityFruitInBox());
        System.out.println("Вес коробки: " + boxApple1.getBoxWeight());

        Orange orange = new Orange();
        Box<Fruit> boxOrange1 = new Box<>(orange);
        boxOrange1.addFruitToBox(3);
        System.out.println(boxOrange1);
        boxOrange1.addFruitToBox(-5);
        System.out.println(boxOrange1);
        System.out.println("Фрукты в коробке: " + boxOrange1.getQuantityFruitInBox());
        System.out.println("Вес коробки: " + boxOrange1.getBoxWeight());

        System.out.println("Одинаковые коробки по весу? - " + boxOrange1.compare(boxApple1));

        Box<Fruit> boxOrange2 = new Box<>(orange);
        boxOrange2.addFruitToBox(3);
        System.out.println(boxOrange2);
        System.out.println("Фрукты в коробке: " + boxOrange2.getQuantityFruitInBox());
        System.out.println("Вес коробки: " + boxOrange2.getBoxWeight());

        shiftFruits (boxOrange1, boxOrange2, 2);
        System.out.println("Фрукты в коробке: " + boxOrange1.getQuantityFruitInBox());
        System.out.println("Вес коробки: " + boxOrange1.getBoxWeight());
        System.out.println("Фрукты в коробке: " + boxOrange2.getQuantityFruitInBox());
        System.out.println("Вес коробки: " + boxOrange2.getBoxWeight());

        shiftFruits (boxOrange1, boxApple1, 1);
    }

}
