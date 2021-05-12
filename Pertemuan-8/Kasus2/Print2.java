//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
class Print2 extends Karyawan{
    public void print2(){
        System.out.println(Proceed);
        System.out.println("\nCetak semua data");
          
        for(int i=0; i < Proceed.size(); i++){
            int x = i+1;
            System.out.println("_____________________________");
            System.out.println("Data ke-"+ x);
            System.out.println("Nama     : "+Proceed.get(i).get(0));
            System.out.println("Umur     : "+Proceed.get(i).get(1));
            System.out.println("ID Karyawan: "+Proceed.get(i).get(2));
            System.out.println("");
            
        }
    }
}