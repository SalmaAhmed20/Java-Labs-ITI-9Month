package pkgTwo;

import pkgOne.TemperatureConverter;

public class TempMain {
    public static void main(String[] args) {
        float x=24;
        System.out.println("Temp is ="+x+"°C "+new TemperatureConverter().apply(x)+"°F");
    }
}
