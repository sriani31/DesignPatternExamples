class A1
{
    public A1() {
        System.out.println("Inside constructor A");
    }

    public void show(){
        System.out.println("Inside void A1");
    }
}

class B1 extends A1
{
    public B1() {
        System.out.println("Inside constructor B");
    }

    @Override
    public void show() {
       // super.show();
        System.out.println("Inside void B1");
    }
}

public class Overriding {
    public static void main(String Args[])
    {
        B1 obj = new B1();
        obj.show();

    }
}
