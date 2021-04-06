//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
import java.util.Queue;
import java.util.LinkedList;

public class JualMotorQueue {
    public static void main(String args[]) {
        // TODO code application logic here
            Motor RodaDua = new Motor();
            System.out.println(RodaDua.MotorBekas());
 
            RodaDua.tambahMotor("CBR150R");
            RodaDua.tambahMotor("Nmax");
            RodaDua.tambahMotor("PCX");
            RodaDua.tambahMotor("MioM3");
            RodaDua.tambahMotor("Vario150");
            System.out.println(RodaDua.MotorBekas());
 
            RodaDua.MotorRusak(2);
            System.out.println(RodaDua.MotorBekas());
    }
}
class DealerMotor {
      Queue<String> motorcycle = new LinkedList<String>();
 
      public DealerMotor(){
 
      }
      public void setMotor(Queue<String> motorcycle) {
            this.motorcycle = motorcycle;
      }
      public Queue<String> getMotor(){
            return this.motorcycle;
      }
}

class Motor extends DealerMotor {
      public void tambahMotor(String motorcycle){
            super.getMotor().add(motorcycle);
      }
      public void MotorRusak(int index){
            System.out.println(super.getMotor().poll());
      }
      public Queue<String> MotorBekas(){
            return super.getMotor();
      }
}