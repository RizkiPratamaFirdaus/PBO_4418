//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220.
import java.awt.*; 
import java.awt.event.*;
public class Textfield{  
public static void main(String args[]){  
    Frame f= new Frame("JavaAWT_IPUN");  
    f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    TextField t1,t2;  
    t1=new TextField("Selamat Datang");  
    t1.setBounds(50,150, 150,30);  
    t2=new TextField("AWT  1");  
    t2.setBounds(50,250, 150,30);  
    f.add(t1); 
    f.add(t2);  
    f.setSize(400,450);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
}  