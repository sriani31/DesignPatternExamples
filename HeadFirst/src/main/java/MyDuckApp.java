public class MyDuckApp {
    public static void main(String args[])
    {
//        MallardDuck mallardDuck = new MallardDuck();
//
//        mallardDuck.display();
//        mallardDuck.quack();
//        mallardDuck.swim();
//        mallardDuck.fly();

  //      RubberDuck rubberDuck = new RubberDuck();

    //    rubberDuck.display();
        //rubberDuck.fly();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();


    }
}
