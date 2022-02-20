public class Dog extends Animal implements Move, EatsSomeBody {


    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void sayWhoIam() {
        System.out.print("I'm a dog, ");
        super.sayWhoIam();
    }

    @Override
    public void move() {
        System.out.println("Dog " + super.GetName() + " is moving!");
    }

    @Override
    public void eatsSomeBody() {
        System.out.println("Dog " + super.GetName() + " eating animal");
    }
}
