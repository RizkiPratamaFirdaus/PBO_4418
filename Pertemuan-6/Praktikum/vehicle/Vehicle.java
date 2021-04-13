//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220

package vehicle;

public class Vehicle {

    double speed = 0;
    String color = "Orange";
    
    public Vehicle(){
        
    }
    
    public void goStraight(){
        System.out.println("Maju");
    }
    
    public void turnLeft(){
        System.out.println("Belok Kiri");
    }
    
    public void turnRight(){
        System.out.println("Belok Kanan");
   }
}