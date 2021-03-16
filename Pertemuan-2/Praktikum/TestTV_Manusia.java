//Nama 	: Rizki Pratama Firdaus
//elas 	: A11.4418
//NIM 	:  A11.2019.12220
public class TestTV_Manusia {
    public static void main(String[] args) {
    Manusia man1 = new Manusia("Erik");
    System.out.println(man1.namaSaya());
    TV tvku = new TV();
    man1.beliTV(tvku);
    System.out.println(man1.cekTV());
    man1.jualSemuaTV();
    System.out.println(man1.cekTV());
    }
}
