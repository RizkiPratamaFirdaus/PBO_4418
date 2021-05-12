//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
public class Karyawan extends HarpindoKita{
    Karyawan(){}

    public String Age(){
        System.out.print("Input umur: ");
        age = input.nextLine();
        return age1;
    }

    public String Identitas(){
        System.out.print("Input Nomor Idensitas Kerja: ");
        noID = input.nextLine();
        return noID1;
    }

    public String Nama(){
        System.out.print("Input Nama: ");
        nama = input.nextLine();
        return nama1;
    }

    public void setKaryawan(){   
        int z = Proceed.size();
        z+=1;
        System.out.println("\nInput ke-"+ z);
        Nama();
        Umur();
        Identitas();
        // super.Beli(int n);

        int p = Proceed.size();
        Proceed.add(new ArrayList<String>());
        Proceed.get(p).add(0, nama);
        Proceed.get(p).add(1, age);
        Proceed.get(p).add(2, noID);
    }

    public void Profit(){
        int z0 = 0;
        for(int i = 0; i<jumlahHarga.size(); i++){
            String z2 = jumlahHarga.get(i);
            int z1 = Integer.parseInt(z2);
            z0 = z0 + z1;
        }
        System.out.println("Untung 10% untuk karyawan sebesar:"+(z0*0.1));
    }
}
