package LabAdapterDesign;

public class ApplianceApp {
    public static void main(String[] args) {
        Laptop acer = new Laptop();
        PowerOutlet Laptop = new LaptopAdapter(acer);

        Refrigerator condura = new Refrigerator();
        PowerOutlet Refrigerator = new RefrigeratorAdapter(condura);

        SmartphoneCharger samsung = new SmartphoneCharger();
        PowerOutlet SmartphoneCharger = new SmartphoneAdapter(samsung);

        System.out.println(Laptop.plugIn());
        System.out.println(Refrigerator.plugIn());
        System.out.println(SmartphoneCharger.plugIn());
    }
}
