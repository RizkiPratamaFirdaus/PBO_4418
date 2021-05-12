//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
class Print3 extends Car{
    public void printSDN(){
        System.out.println("\nprint data Kendaraan mobil kecil");
        System.out.println("_____________________________");
            
        for(int i=0; i < mobilKecil.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Kendaraan: "+mobilKecil.get(i).get(0));
            System.out.println("Warna     : "+mobilKecil.get(i).get(1));
            System.out.println("Harga     : "+mobilKecil.get(i).get(2));
            System.out.println("");
        }
    }    

    public void printMB(){
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
    }  

    public void printB(){
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
    }

    public void printSemua(){
        printSDN();
        printMB();
        printB();
    }        
}