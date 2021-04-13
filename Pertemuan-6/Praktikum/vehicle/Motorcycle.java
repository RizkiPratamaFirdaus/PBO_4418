//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220

package vehicle;

public class Motorcycle extends MotorVehicle {
    private int numGear = 0;
    
    public Motorcycle() {
        
    }
    public void setGearFoot(int numGear) {
        this.numGear = numGear;
    }
    public int getGearFoot() {
        return numGear;
    }
}