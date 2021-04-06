//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
import java.util.ArrayList;

public class JualMotorArraylist {
    public static void main(String args[]) {
        // TODO code application logic here
           Motor RodaDua = new Motor();
           System.out.println(RodaDua.MotorBekas());

           RodaDua.tambahMotor("Ninja250");
           RodaDua.tambahMotor("PCX150");
           RodaDua.tambahMotor("MioM3");
           System.out.println(RodaDua.MotorBekas());

           RodaDua.MotorGanti(0,"Nmax");
           System.out.println(RodaDua.MotorBekas());

           RodaDua.MotorRusak(2);
           System.out.println(RodaDua.MotorBekas());
    }
}

class DealerMotor {
      ArrayList<String> motorcycle = new ArrayList<>();

      public DealerMotor(){

      }
      public void setMotor(ArrayList<String> motorcycle) {
            this.motorcycle = motorcycle;
      }
      public ArrayList<String> getMotor(){
            return this.motorcycle;
      }
} 

class Motor extends DealerMotor {
      public void tambahMotor(String motorcycle){
            super.getMotor().add(motorcycle);
      }
      public String MotorRusak(int index){
            return super.getMotor().remove(index);
      }
      public void MotorGanti(int index, String motorcycle){
            super.getMotor().set(index, motorcycle);
      }
      public ArrayList<String> MotorBekas(){
            return super.getMotor();
      }
}