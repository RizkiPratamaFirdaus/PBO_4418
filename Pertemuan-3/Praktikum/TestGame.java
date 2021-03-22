//Nama 	: Rizki Pratama Firdaus
//Kelas : A11.4418
//NIM 	:  A11.2019.12220
public class TestGame {
    public static void main(String[] args) {
        GamePlayer GP = new GamePlayer();
        GP.setDimension(4,5);
        GP.setPosition(6,7);
        GP.Run();
        GP.Run(8);
        
        GameEnemy GE = new GameEnemy();
        GE.setDimension(9,10);
        GE.setPosition(11,12);
        GE.Run();
    }
}
