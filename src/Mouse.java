public class Mouse extends Animal implements Move, HasEatingBySomebody {

    public Mouse(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void sayWhoIam() {
        System.out.print("I'm a mouse, ");
        super.sayWhoIam();
    }

    @Override
    public void move() {
        System.out.println("Mouse " + super.GetName() + " is moving!");
    }

    @Override
    public void hasEatingBySomebody() {
        System.out.println("Somebody has eaten mouse" + super.GetName());
    }
}
