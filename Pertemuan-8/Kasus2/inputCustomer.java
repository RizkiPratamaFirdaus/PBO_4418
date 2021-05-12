//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
public class inputCustomer extends Konsumen{
    inputCustomer(){
    }

    public void Payment(){
        int z = Customer.size();
        z+=1;
        System.out.println("\nInput ke-"+ z);
        super.Nama();
        super.Age();
        super.Identitas();

        int p = Customer.size();
        Customer.add(new ArrayList<String>());
        Customer.get(p).add(0, age);
        Customer.get(p).add(1, nama);
        Customer.get(p).add(2, noID);
        System.out.print("Pilihan:\n 1. mobilKecil, 2. mobilSedang, 3. mobilBesar\nPilih: ");
        int jns = input.nextInt();
        if (jns==1){
            System.out.println("\nCetak data Kendaraan mobilKecil");
            System.out.println("_____________________________");
                
            for(int i=0; i < mobilKecil.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Kendaraan: "+mobilKecil.get(i).get(0));
                System.out.println("Warna     : "+mobilKecil.get(i).get(1));
                System.out.println("Harga     : "+mobilKecil.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<mobilKecil.get(pil-1).size(); k++){
                    Customer.get(p).add(3, mobilKecil.get(pil-1).get(k));    
                    }
                    jumlahHarga.add(mobilKecil.get(pil-1).get(2));
                }else{
                    i = 10;
                }
            }
        }else if (jns==2){
            System.out.println("\nCetak data Kendaraan mobilSedang");
            System.out.println("_____________________________");
                
            for(int i=0; i < mobilSedang.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Kendaraan: "+mobilSedang.get(i).get(0));
                System.out.println("Warna     : "+mobilSedang.get(i).get(1));
                System.out.println("Harga     : "+mobilSedang.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<mobilSedang.get(pil-1).size(); k++){
                    Customer.get(p).add(3, mobilSedang.get(pil-1).get(k));    
                    }
                    jumlahHarga.add(mobilSedang.get(pil-1).get(2));
                }else{
                    i = 10;
                }
            }
        }else if (jns==3){
            System.out.println("\nCetak data Kendaraan mobilBesar");
            System.out.println("_____________________________");
                
            for(int i=0; i < mobilBesar.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Kendaraan: "+mobilBesar.get(i).get(0));
                System.out.println("Warna     : "+mobilBesar.get(i).get(1));
                System.out.println("Harga     : "+mobilBesar.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.print("\nPilih:\n 1. Beli, 2. Selesai\n Pilih sesuai angka: ");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nInput data ke: ");
                    int pil = input.nextInt();
                    for(int k=0; k<mobilBesar.get(pil-1).size(); k++){
                    Customer.get(p).add(3, mobilBesar.get(pil-1).get(k));    
                    }
                    jumlahHarga.add(mobilBesar.get(pil-1).get(2));
                }else{
                    i = 10;
                }
            }
        }
    }
}