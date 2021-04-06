//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
import java.util.Stack;

public class JualMotorStack {
    public static void main(String args[]) {
        // TODO code application logic here
            Motor RodaDua = new Motor();
            System.out.println(RodaDua.MotorBekas());
 
            RodaDua.tambahMotor("Kol");
            RodaDua.tambahMotor("Terong");
            RodaDua.tambahMotor("Bayam");
            System.out.println(RodaDua.MotorBekas());
 
            RodaDua.MotorGanti(2,"Semangka");
            System.out.println(RodaDua.MotorBekas());
 
            RodaDua.MotorRusak();
            System.out.println(RodaDua.MotorBekas());   
    }
}
class DealerMotor {
      Stack<String> motorcycle = new Stack<String>();
 
      public DealerMotor(){
 
      }
      public void setMotor(Stack<String> motorcycle) {
            this.motorcycle = motorcycle;
      }
      public Stack<String> getMotor(){
            return this.motorcycle;
      }
} 
class Motor extends DealerMotor {
      public void tambahMotor(String motorcycle){
            super.getMotor().push(motorcycle);
      }
      public String MotorRusak(){
            return super.getMotor().pop();
      }
      public void MotorGanti(int index,String motorcycle){
            super.getMotor().set(index, motorcycle);
      }
      public Stack<String> MotorBekas(){
            return super.getMotor();
      }
}