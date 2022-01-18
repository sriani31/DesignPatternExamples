class A
{
    public A() {
        System.out.println("Inside A");
    }
    public A(int i) {
        System.out.println("Inside int A");
    }

}

class B extends A
{
    public B() {
        System.out.println("Inside B");
    }
    public B(int i) {
        super(i);
        System.out.println("Inside int B");
    }

}

public class SuperDemo {
    public static void main(String Args[])
    {
        B obj = new B(1);


    }
}
