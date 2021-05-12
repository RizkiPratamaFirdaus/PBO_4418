//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
public class PrintS extends HarpindoKita{
    public void print(){
        System.out.println("\nCetak semua data");
        
            
        for(int i=0; i < Customer.size(); i++){
            System.out.println("_____________________________");
            if(Customer.get(i).size()>5){
                System.out.println("Data borong");
                System.out.println("Nama     : "+Customer.get(i).get(0));
                System.out.println("Umur     : "+Customer.get(i).get(1));
                System.out.println("ID       : "+Customer.get(i).get(2));
                int x=3;
                System.out.println("Kendaraan yang dibeli:");
                int z9=0;
                while( x < Customer.get(i).size()){
                    int y = x;
                    System.out.println("\nType Kendaraan: "+Customer.get(i).get(y+2));
                    System.out.println("Warna     : "+Customer.get(i).get(y+1));
                    System.out.println("Harga     : "+Customer.get(i).get(y));
                    String z2 = Customer.get(i).get(y);
                    int z1 = Integer.parseInt(z2);
                    z9 = z9 + z1;
                    x=x+3;
                }
                System.out.println("\nTotal harga: "+z9);
            }else{
                System.out.println("Data satuan");
                System.out.println("Nama     : "+Customer.get(i).get(0));
                System.out.println("Umur     : "+Customer.get(i).get(1));
                System.out.println("ID       : "+Customer.get(i).get(2));
                System.out.println("Kendaraan yang dibeli:");
                System.out.println("Type Kendaraan: "+Customer.get(i).get(3));
                System.out.println("Warna     : "+Customer.get(i).get(4));
                System.out.println("Harga     : "+Customer.get(i).get(5));
            }
            System.out.println("");           
        }
    }
}