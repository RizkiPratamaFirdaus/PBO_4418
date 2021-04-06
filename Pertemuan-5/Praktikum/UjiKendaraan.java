//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle Sepedamotor = new MotorVehicle(2, "H 121 ZKI");
        
        kendaraan.goStraight();
        kendaraan.turnRight();
        kendaraan.turnLeft();
        Sepedamotor.getSizeofEngine();
        Sepedamotor.getLicencePlate();
        sepeda.ringBell();
        
        System.out.println("Plat Nomor Sepeda Motor : "+Sepedamotor.getLicencePlate());
        System.out.println("Gigi : "+Sepedamotor.getSizeofEngine());
    }
}