public class Cat extends Animal implements Move, EatsSomeBody, HasEatingBySomebody {

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void sayWhoIam() {
        System.out.print("I'm a cat, ");
        super.sayWhoIam();
    }

    @Override
    public void move() {
        System.out.println("Cat " + super.GetName() + "is moving!");
    }

    @Override
    public void eatsSomeBody() {
        System.out.println("Cat " + super.GetName() + " eating animal");
    }

    @Override
    public void hasEatingBySomebody() {
        System.out.println("Somebody has eaten cat" + super.GetName());
    }
}
