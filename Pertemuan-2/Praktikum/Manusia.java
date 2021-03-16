//Nama 	: Rizki Pratama Firdaus
//elas 	: A11.4418
//NIM 	:  A11.2019.12220
public class Manusia {
    String nama;
    boolean punyaTV;

    public Manusia(){
    }

    public Manusia(String nama){
        this.nama = nama;
    }

    public String namaSaya(){
        return nama;
    }

    public void beliTV(TV tiviku){
        punyaTV = true;
    }

    public void jualSemuaTV(){
        punyaTV = false;
    }
    public boolean cekTV(){
        return punyaTV;
    }
}
