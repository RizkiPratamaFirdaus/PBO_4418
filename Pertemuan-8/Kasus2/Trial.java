//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
public class Trial {
    public static void main(String args[]){
        Karyawan k = new Karyawan();
        System.out.println("Input Karyawan");
        k.set2D();
        k.set2D();
        Print2 p2 = new Print2();
        p2.Print();

        Mobil c = new Mobil();
        c.inputMobilKecil(1);
        c.inputMobilSedang(1);
        c.inputMobilBesar(1);
        Print3 p3 = new Print3();
        p3.Printsemua();

        editHarga eh = new editHarga();
        eh.change();

        inputCustomer ic = new inputCustomer();
        System.out.println("\nInput Customer");
        ic.Payment();
        ic.Payment();
        Print p = new Print();
        p.Print();

        PrintS ps = new PrintS();
        ps.Print();
        k.untung();
	}
}