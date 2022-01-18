public class MallardDuck extends Duck  {

    FlyBehavior flyBehavior = new FlyWithWings();
    QuackBehavior quackBehavior = new Quack();
    @Override
    public void display() {
        System.out.println("This is Mallard Duck");
    }


//    @Override
//    public void fly() {
//        System.out.println("Mallard Duck Flies");
//    }


    @Override
    public void performFly() {
        flyBehavior.fly();
    }

    @Override
    public void performQuack() {
        quackBehavior.quack();
    }
}


