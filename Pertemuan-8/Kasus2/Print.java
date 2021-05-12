//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
public class Print extends Konsumen{
    public void print(){
            System.out.println("\nCetak semua data");
            System.out.println("_____________________________");
            
        for(int i=0; i < Customer.size(); i++){
            int x = i+1;
            System.out.println("Data ke-"+ x);
            System.out.println("Nama     : "+Customer.get(i).get(0));
            System.out.println("Umur     : "+Customer.get(i).get(1));
            System.out.println("ID       : "+Customer.get(i).get(2));
            System.out.println("");           
        }
    }
}
