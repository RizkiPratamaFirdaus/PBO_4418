//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
public class Konsumen extends HarpindoKita{
    public String Age(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input age: ");
        age = input1.nextLine();
        return age;
    }

    public String Identitas(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input Nomor Idensitas (KTP): ");
        noID = input1.nextLine();
        return noID;
    }

    public String Nama(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input Nama: ");
        nama = input1.nextLine();
        return nama;
    }    
}