/*
Создать массив класса тапа животные (Animal) и включающий в себе
классы животного собака (Dog), кошки (Cat) и мыши (Mouse)
При этом каждое животное должно иметь в описании имя, возраст, вес.
Вывести в консоль в цикле информацию о каждом животном из созданного массива, а так
же вызвать все методы реализованные от интерфейсов
Реализовать в этих классах интерфейсы учитывая, что:
- класс кошка (Cat) может передвигаться, может кого-то сьесть и может быть сама сьедена
- класс собака (Dog) может передвигаться и может сьесть кого-то
- класс мыши (Mouse) может передвигаться и быть сьедена

 */
public class Main {
    public static void main(String[] args) {
        final int MAX = 3;
        Animal[] animals = new Animal[MAX];
        animals[0] = new Dog("Sharik", 12, 40);
        animals[1] = new Cat("Myrsik", 2, 8);
        animals[2] = new Mouse("Pipsik", 3, 1);

        for (Animal animal : animals) {
            animal.sayWhoIam();
            if (animal instanceof Move)
                ((Move) animal).move();
            if (animal instanceof EatsSomeBody)
                ((EatsSomeBody) animal).eatsSomeBody();
            if (animal instanceof Move)
                ((Move) animal).move();
            if (animal instanceof HasEatingBySomebody)
                ((HasEatingBySomebody) animal).hasEatingBySomebody();
        }

    }
}
