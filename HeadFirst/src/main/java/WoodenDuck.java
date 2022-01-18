public class WoodenDuck extends Duck{
    FlyBehavior flyBehavior = new FlyNoWay();
    QuackBehavior quackBehavior = new MuteQuack();

    @Override
    public void display() {
        System.out.println("This is a wooden duck");
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
