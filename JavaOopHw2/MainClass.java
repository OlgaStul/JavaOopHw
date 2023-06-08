// ЗАДАНИЕ

// 1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, 
//    в миске 10 еды, а кот пытается покушать 15-20).
// 2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось 
//    покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто 
//    не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
// 3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом 
//    вывести информацию о сытости котов в консоль.
// 4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

package JavaOopHw2;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 12, false),
                new Cat("Пушок", 7, false),
                new Cat("Томас", 10, false),
                new Cat("Тишка", 9, false),
                new Cat("Персик", 15, false),
                new Cat("Мурзик", 17, false),
                new Cat("Дымок", 14, false),
                new Cat("Паштет", 8, false),
                new Cat("Маркиз", 18, false),
                new Cat("Оскар", 10, false),
        };

        Plate plate = new Plate(100);

        for (Cat cat : cats) {
            if (plate.getFood() >= cat.getAppetite()) {
                plate.info();
                plate.setFood(plate.getFood() - cat.getAppetite());
                cat.satiety(cat.eat());
                System.out.println();

            } else if (plate.getFood() < cat.getAppetite()) {
                plate.info();
                cat.satiety(cat.getAppetite());
                plate.addFood(cat.getAppetite());
                plate.setFood(plate.getFood() - cat.getAppetite());
                cat.satiety(cat.eat());
                System.out.println();
            }
        }

    }
}
