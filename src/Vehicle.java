public class Vehicle {
    void drive() {
        System.out.println("Driving!");
    }
    void VehicleBreak(){
        System.out.println("Driving!");
    }
    void Reverse() {
        System.out.println("reverse!");
    }
}
class Car extends Vehicle {
    void MotorRacing() {
        System.out.println("Racing!");
    }
}
class ModernCar extends Car{
    void Flying (){
        System.out.println("Flying");
    }

}
class Boat extends Vehicle{
    void Surf() {
        System.out.println("Surfing!");
    }
}
class ModernBoat extends Boat{
    void LandRiding (){
        System.out.println("Riding!");
    }
}
class TestOutput {
    public static void main(String[] args) {

        ModernCar mc = new ModernCar();
        ModernBoat mb = new ModernBoat();
        mc.drive();
        mc.Reverse();
        mc.VehicleBreak();
        mc.MotorRacing();
        mc.Flying();
        mb.drive();
        mb.Reverse();
        mb.VehicleBreak();
        mb.Surf();
        mb.LandRiding();

    }
}

