//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220

package transportasi;

public class Mobil {
    String warna;
    int tahun = 2001;
    
    public Mobil() {

    }
    
    public Mobil(String color, int thn) {
        this.warna = color;
        this.tahun = thn;
    }
    
    public String getwarna() {
        return warna;
    }
    public int gettahun() {
        return tahun;
    }
}
