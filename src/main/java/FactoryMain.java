import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String args[])
    {
            System.out.println(args[0]);
            OperatingSystemFactory opFactory = new OperatingSystemFactory();
            OS opSys = opFactory.getInstance(args[0]);
            opSys.specs();
    }
}
