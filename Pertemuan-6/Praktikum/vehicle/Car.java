//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220

package vehicle;

public class Car extends MotorVehicle {
    private boolean seatbelt = false;
    
    public Car() {
        
    }
    public void setSeatBelt(int seatbelt) {
        if(seatbelt == 1){
            this.seatbelt = true;
        }else if(seatbelt == 0){
            this.seatbelt = false; 
        }
    }
    public boolean getSeatBelt() {
        return seatbelt;
    }
}