//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
public class editHarga extends Print3{
    Scanner input1 = new Scanner(System.in);
    public void change(){
        System.out.println("Semua karyawan=");
        for(int i=0; i < Proceed.size(); i++){
            int x = i+1;
            System.out.println(x+". "+Proceed.get(i).get(0));
        }
        System.out.print("\nPilih siapa yang ingin mengubah harga dengan menyantumkan angka: ");
        int plh = input.nextInt();
        System.out.print("\n1. Mobil kecil, 2. Mobil Sedang, 3.mobilBesar\nPilih: ");
        int plh2 = input.nextInt();
        if (plh2==1){
            super.printSDN();
            System.out.println(Proceed.get(plh-1).get(0)+" Ingin mengubah harga mobil kecil");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input.nextInt();
            System.out.println("Type Kendaraan: "+mobilKecil.get(plh3-1).get(0));
            System.out.println("Warna     : "+mobilKecil.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+mobilKecil.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            mobilKecil.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+mobilKecil.get(plh3-1).get(2));
        }else if (plh2==2){
            super.printMB();
            System.out.println(Proceed.get(plh-1).get(0)+" Ingin mengubah harga mobilSedang");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input.nextInt();
            System.out.println("Type Kendaraan: "+mobilSedang.get(plh3-1).get(0));
            System.out.println("Warna     : "+mobilSedang.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+mobilSedang.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            mobilSedang.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+mobilSedang.get(plh3-1).get(2));
        }else if (plh2==3){
            super.printB();
            System.out.println(Proceed.get(plh-1).get(0)+" Ingin mengubah harga mobilBesar");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input.nextInt();
            System.out.println("Type Kendaraan: "+mobilBesar.get(plh3-1).get(0));
            System.out.println("Warna     : "+mobilBesar.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+mobilBesar.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            mobilBesar.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+mobilBesar.get(plh3-1).get(2));
        }               
    }
}