class Car{
    private int windows;
    private int headlight;
    private int tailLights;
    private boolean gasEngine;
    private boolean dieselEngine;
    private boolean electric;
    private int wheels;
    private boolean isManual;
    private int engineSize;
    private int doors;
    private String carMake;
    private String carModel;

    public Car(boolean gasEngine, boolean dieselEngine, boolean electric, int wheels, boolean isManual) {
        this.gasEngine = gasEngine;
        this.dieselEngine = dieselEngine;
        this.electric = electric;
        this.wheels = wheels;
        this.isManual = isManual;
    }

    public int amountOfWindows(){
        return this.windows = 4;
    }

    public int amountOfHeadLights(){
        return this.headlight = 2;
    }

    public int amountOfTailLights(){
        return this.tailLights = 4;
    }

    public int amountOfCylinders(){
        return this.engineSize = 4;
    }

    public int amountOfDoors(){
        return this.doors = 5;
    }

    public String carMake(){
        return this.carMake = "Unknown";
    }

    public String carModel(){
        return this.carModel = "Default";
    }
}

class Ford extends Car{
    private String make;
    private String model;

    public Ford(boolean isManual,
                String make,
                String model) {
        super(true, false, false, 4, isManual);
        this.make = make;
        this.model = model;
    }

    @Override
    public String carMake() {
       return this.make;
    }

    @Override
    public String carModel() {
        return this.model;
    }
}

class Polaris extends Car{
    private String make;
    private String model;
    private int windows;


    public Polaris(int wheels, boolean isManual, String make, String model, int windows) {
        super(true, false, false, wheels, isManual);
        this.make = make;
        this.model = model;
        this.windows = windows;
    }

    @Override
    public int amountOfWindows() {
        return this.windows;
    }

    @Override
    public String carMake() {
        return this.make;
    }

}

class Hyundai extends Car{
    private String make;
    private String model;
    private int amountOfCylinders;

    public Hyundai(int wheels,
                   boolean isManual,
                   String make,
                   String model,
                   int amountOfCylinders) {
        super(false, false, true, wheels, isManual);
        this.make = make;
        this.model = model;
        this.amountOfCylinders = amountOfCylinders;
    }

    @Override
    public int amountOfCylinders() {
        return this.amountOfCylinders;
    }

    @Override
    public String carMake() {
        return this.make;
    }

    @Override
    public String carModel() {
        return this.model;
    }
}

//Add additional classes above
public class Main {
    public static void main(String[] args) {
        Hyundai hyundai = new Hyundai(4,
                false,
                "Hyundai",
                "Santa Fe",
                6);

        System.out.println(hyundai.carMake());
        System.out.println(hyundai.carModel());
        System.out.println(hyundai.amountOfCylinders());

        Ford ford = new Ford(false, "Ford", "Velocitor");

        System.out.println(ford.carMake());
        System.out.println(ford.carModel());


        Polaris polaris = new Polaris(3, true, "Polaris", "Slingshot", 2);

        System.out.println(polaris.carMake());
        System.out.println(polaris.carModel());
        System.out.println(polaris.amountOfWindows());



    }
}
