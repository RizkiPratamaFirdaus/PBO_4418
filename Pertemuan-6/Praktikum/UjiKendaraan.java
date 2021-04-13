//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220

import vehicle.*;
public class UjiKendaraan {

    public static void kendaraanMelaju(Vehicle Vehicle){
        Vehicle.goStraight();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle Sepedamotor = new MotorVehicle(2, "H 121 ZKI");
        Motorcycle motor = new Motorcycle();
        Car mobil = new Car();
        kendaraanMelaju(new Vehicle());
        kendaraanMelaju(new Bicycle());
        kendaraanMelaju(new MotorVehicle());
        
        kendaraan.goStraight();
        kendaraan.turnLeft();
        kendaraan.turnRight();
        Sepedamotor.getSizeofEngine();
        Sepedamotor.getLicencePlate();
        sepeda.ringBell();
        motor.setGearFoot(2);
        mobil.setSeatBelt(1);
//        mobil.setSeatBelt(1);
        
        System.out.println("Plat Nomor Sepeda Motor : "+Sepedamotor.getLicencePlate());
        System.out.println("Gigi : "+Sepedamotor.getSizeofEngine());
        System.out.println("Gear of motor3: " + motor.getGearFoot());
//        System.out.println("Use sealbelt: " + mobil.getSeatBelt());
        System.out.println("Use sealbelt: " + mobil.getSeatBelt());
    }
    
}