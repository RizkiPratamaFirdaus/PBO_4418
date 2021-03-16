//Nama 	: Rizki Pratama Firdaus
//elas 	: A11.4418
//NIM 	:  A11.2019.12220
class Matematika{
    int pertambahan;
    int pengurangan;
    int perkalian;
    int pembagian;
}
public class matematikaDemo {
    public static void main(String[] args) {
        Matematika kalkulasi = new Matematika(); 
        int a;
        int b;
        int c;
        int d;
        a = 2;
        b = 5;
        c = 10;
        d = 20;
        kalkulasi.pertambahan = d += d;
        kalkulasi.pengurangan = c -= b;
        kalkulasi.perkalian = c *= d;
        kalkulasi.pembagian = d /= a;
        System.out.println("Pertambahan: 20 + 20 = " + kalkulasi.pertambahan);
        ;
        System.out.println("Pngurangan: 10 - 5 = " + kalkulasi.pengurangan);
        ;	
        System.out.println("Perkalian: 10 x 20 = " + kalkulasi.perkalian);
        ;
        System.out.println("Pembagian: 20 / 2 = " + kalkulasi.pembagian);
        ;
    }				
}
