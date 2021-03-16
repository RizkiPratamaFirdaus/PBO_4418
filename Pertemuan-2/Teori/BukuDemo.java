//Nama 	: Rizki Pratama Firdaus
//elas 	: A11.4418
//NIM 	:  A11.2019.12220
class Buku {
	String judul;
    String pengarang;
    String penerbit;
	int tahun;

	public Buku(String judul, String pengarang, String penerbit, int tahun){
		this.judul = judul;
		this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
	}
	public void cetakBuku(){
		System.out.println("Judul: " + this.judul);
	    System.out.println("Pengarang: " + this.pengarang);
        System.out.println("Penerbit: " + this.penerbit);
        System.out.println("Tahun: " + this.tahun);
	}
}
public class BukuDemo{
	public static void main(String[] args){
		Buku bukuku = new Buku("PBO", "Indra", "Elex", 2007);
		bukuku.cetakBuku();
        Buku bukuku1 = new Buku("Java", "Ajib", "Andi", 2007);
		bukuku1.cetakBuku();
    }   
}
