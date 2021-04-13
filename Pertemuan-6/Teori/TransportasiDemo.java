//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220

import transportasi.Bicycle;
import transportasi.Mobil;

public class TransportasiDemo {
    public static void main(String[] args){
        Bicycle bike1 = new Bicycle();
        bike1.changeCadence(25);
        bike1.speedUp(10);
        bike1.changeGear(3);
        bike1.printStates(); 
        
        Mobil car1 = new Mobil("Merah", 1998);
        car1.getwarna();
        car1.gettahun();
        
        System.out.println("Warna Mobil : "+car1.getwarna());
        System.out.println("Thun Mobil : "+car1.gettahun());
        
    }

}