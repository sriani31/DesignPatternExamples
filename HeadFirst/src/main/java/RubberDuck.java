public class RubberDuck extends Duck  {
//    @Override
//    public void quack() {
//        System.out.printf("This duck Squeaks");
//    }

    FlyBehavior flyBehavior = new FlyNoWay();
    QuackBehavior quackBehavior = new Squeak();

    @Override
    public void display() {
        System.out.println("This is a rubber Duck");
    }

    @Override
    public void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public void performFly() {
        flyBehavior.fly();
    }
}
