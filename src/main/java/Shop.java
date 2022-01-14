public class Shop {

    public static void main(String Args[]){

        Phone p = new Phone("iOS", 2, "QCX" , 12.3, 3100 );
        System.out.println(p);

        // Now instead of calling the above we will call the phoneBuilder

        Phone np = new PhoneBuilder().setOs("iOS").getPhone();
        System.out.println(np);
        Phone np1 = new PhoneBuilder().setBattery(3000).setProcessor("QCX").getPhone();
        System.out.println(np1);
    }
}
