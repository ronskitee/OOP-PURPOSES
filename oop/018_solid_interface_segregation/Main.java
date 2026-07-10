// Interface Segregation Principle (ISP) states that no code should be forced
// to depend on methods it does not use.
//
// Here is an example that violates ISP:
//
// abstract class Television {
//     abstract void netflix();
//     abstract void youtube();
//     abstract void digitalChannels();
//     abstract void on();
//     abstract void off();
//     abstract void connectToWifi();
// }
// 
// Having only one base class for television would require all its instances to
// have the same functionalities. Wherein fact not all televisions are not made
// the same.
//
// To solve this we could create multiple interfaces and that we could cherry-pick
// when creating our concreate classes.
//
public class Main {
    public static void main(String[] main) {
        BasicTelevision plainTv = new BasicTelevision();
        plainTv.on();
        plainTv.browseChannels();
        plainTv.off();

        SmartTelevision smartTv = new SmartTelevision();
        smartTv.on();
        smartTv.connectToWifi("walang wifi", "233444");
        smartTv.browseChannels();
        smartTv.youtube();
        smartTv.netflix();
        smartTv.off();
    }
}

abstract class ElectronicDevice {
    public void on() {
        System.out.println("power on");
    }

    public void off() {
        System.out.println("power off");
    }
}

interface Streaming {
    abstract void connectToWifi(String ssid, String pwd);
    abstract void netflix();
    abstract void youtube();
}

abstract class Television extends ElectronicDevice {
    // @TODO: implement browseChannels
}

class BasicTelevision extends Television {

}

class SmartTelevision extends  Television implements Streaming {
    // @TODO: complete our smart television based from our `Streaming` interface
}