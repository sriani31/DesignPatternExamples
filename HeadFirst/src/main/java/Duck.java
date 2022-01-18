public class Duck {

//    public void quack(){
//        System.out.println("quack quack!!!");
//    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void swim(){
        System.out.println("Swim!!");
    }

    public  void display()
    {
        System.out.println("Override");
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void performFly()
    {

    }
//    public void fly()
//    {
//        System.out.println("My Duck is now flying!!! Yay!!!! you sure?");
//    }
}

