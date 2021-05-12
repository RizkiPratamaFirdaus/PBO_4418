//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
public class Mobil extends Karyawan{
    Mobil (){
    }

    public void inputMobilKecil(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nMasukkan Kendaraan mobil kecil yang akan di jual");
        for(int i=0; i<b; i++){
            int z = mobilKecil.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type Kendaraan: ");
            typeMobil = input1.nextLine();
            System.out.print("Input warna Kendaraan: ");
            warna = input2.nextLine();
            System.out.print("Input harga Kendaraan: ");
            harga = input.nextLine();
            int p = mobilKecil.size();
            mobilKecil.add(new ArrayList<String>());
            mobilKecil.get(p).add(0, typeMobil);
            mobilKecil.get(p).add(1, warna);
            mobilKecil.get(p).add(2, harga);
        }
    }

    public void inputMobilSedang(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nMasukkan mobil sedang yang akan di jual");
        for(int i=0; i<b; i++){
            int z = mobilSedang.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type Kendaraan: ");
            typeMobil = input1.nextLine();
            System.out.print("Input warna Kendaraan: ");
            warna = input2.nextLine();
            System.out.print("Input harga Kendaraan: ");
            harga = input.nextLine();
            int p = mobilSedang.size();
            mobilSedang.add(new ArrayList<String>());
            mobilSedang.get(p).add(0, typeMobil);
            mobilSedang.get(p).add(1, warna);
            mobilSedang.get(p).add(2, harga);
        }
    }

   public void inputMobilBesar(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
       System.out.println("\nMasukkan mobilBesar yang akan di jual");
        for(int i=0; i<b; i++){
            int z = mobilBesar.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type Kendaraan: ");
            typeMobil = input1.nextLine();
            System.out.print("Input warna Kendaraan: ");
            warna = input2.nextLine();
            System.out.print("Input harga Kendaraan: ");
            harga = input.nextLine();
            int p = mobilBesar.size();
            mobilBesar.add(new ArrayList<String>());
            mobilBesar.get(p).add(0, typeMobil);
            mobilBesar.get(p).add(1, warna);
            mobilBesar.get(p).add(2, harga);
        }
    } 

    
}

