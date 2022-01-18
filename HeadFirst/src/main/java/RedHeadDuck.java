public class RedHeadDuck extends Duck {

    FlyBehavior flyBehavior = new FlyWithWings();
    QuackBehavior quackBehavior = new Quack();

    @Override
    public void display() {
        System.out.println("This is RedHeadDuck");
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
