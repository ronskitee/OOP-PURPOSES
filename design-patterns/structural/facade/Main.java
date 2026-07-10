package structural.facade;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        System.out.println(
                coffeeMaker.brew("Robusta", 120));
    }
}

// Subsystem #1
class Grinder {
    public String grind(String what) {
        System.out.println("Grinding " + what + "...");
        return "Grinded beans";
    }
}

// Subsystem #2
class WaterHeater {
    public String heat(int milliliters) {
        System.out.println("Heating " + milliliters + " of water...");
        return "Hot water";
    }
}

// Subsystem #3
class Dripper {
    public String drip(String water, String grindedBeans) {
        System.out.println("Dripping " + water + " to " + grindedBeans + "...");
        return "Hot brewed coffee";
    }
}

// Facade
class CoffeeMaker {
    private Grinder grinder;
    private WaterHeater heater;
    private Dripper dripper;

    public CoffeeMaker() {
        grinder = new Grinder();
        heater = new WaterHeater();
        dripper = new Dripper();
    }

    public String brew(String what, int milliliters) {
        String grinded = grinder.grind(what);
        String hotWater = heater.heat(milliliters);
        return dripper.drip(hotWater, grinded);
    }
}
