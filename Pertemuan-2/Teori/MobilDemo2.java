//Nama 	: Rizki Pratama Firdaus
//elas 	: A11.4418
//NIM 	:  A11.2019.12220
import java.util.Scanner;

class Mobil2{
    String warna;
    int tahunProduksi;
    String hidupkanMobil;
    String matikanMobil;
	String ubahGigi;
	String kondisiMesin;
}
public class MobilDemo2 {
	static void mesinGigi(){		
		Mobil2 mobilku = new Mobil2();
		Scanner scan = new Scanner(System.in);
		String[] gigi = {"Gigi 1", "Gigi 2", "Gigi 3", "Gigi 4", "Gigi 5", "Gigi R"};
		System.out.print("Ubah gigi ke gigi..? (1/2/3/4/5/R)");
		mobilku.ubahGigi = scan.nextLine();
		switch(mobilku.ubahGigi){
			case "1":
				System.out.println("Mobil pada " + gigi[0]);
				break;
			case "2":
				System.out.println("Mobil pada " + gigi[1]);
				break; 
			case "3":
				System.out.println("Mobil pada " + gigi[2]);
				break; 
			case "4":
				System.out.println("Mobil pada " + gigi[3]);
				break; 
			case "5":
				System.out.println("Mobil pada " + gigi[4]);
				break; 
			case "R":
				System.out.println("Mobil pada " + gigi[5]);
				break; 
			default:
				System.out.println("Inputan salah!");
		}	
	}
	public static void main(String[] args){
		// Membuat object
	  	Mobil2 mobilku = new Mobil2();
		//memanggil atribut  dan memberi nilai
	  	mobilku.warna = "Hitam";
	  	mobilku.tahunProduksi = 2006;
		mobilku.hidupkanMobil = "Hidup";
		mobilku.matikanMobil = "Mati";
	  	System.out.println("Warna: " + mobilku.warna);
		System.out.println("Tahun: " + mobilku.tahunProduksi);

		Scanner scan = new Scanner(System.in);
        System.out.print("Hidupkan mobil? (hidup/mati)");
        mobilku.kondisiMesin = scan.nextLine();
		switch(mobilku.kondisiMesin){
            case "hidup":
				System.out.println("Mesin mobil dalam keadaan " + mobilku.hidupkanMobil);
				mesinGigi();
				break;
            case "mati":
                System.out.println("Mesin mobil dalam keadaan " + mobilku.matikanMobil);
                break;
            default:
                System.out.println("Inputan salah!");

		}		
	}
}

