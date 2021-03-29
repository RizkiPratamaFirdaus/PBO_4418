import java.util.ArrayList;
public class GameEnvironment {
    double width;
    double height;
    ArrayList<GamePlayer> arrPlayer=new ArrayList<GamePlayer>();;
    ArrayList<GameEnemy> arrEnemy=new ArrayList<GameEnemy>();

    public GameEnvironment(){
    
    }

    public GameEnvironment(double width, double height){
        this.width=width;
        this.height=height;
    }

    public void addPlayer(GamePlayer GamePlayer){
        arrPlayer.add(GamePlayer);
    }
    
    public void removePlayer(GamePlayer GamePlayer){
        arrPlayer.remove(GamePlayer);
    }
    
    public void getAllPlayers(){
        System.out.println("Player List: " + arrPlayer);
    }
    
    // Enemy
    public void addEnemy(GameEnemy GameEnemy){
        arrEnemy.add(GameEnemy);
    }
    
    public void removeEnemy(GameEnemy GameEnemy){
        arrEnemy.remove(GameEnemy);
    }
    
    public void getAllEnemy(){
        System.out.println("Enemy List: " + arrEnemy);
    }
    
    public void interaction(){
        if (arrPlayer == null || arrEnemy == null){
            System.out.println("Player or Enemy not Set");
        } else {
            for (int i = 0; i < arrPlayer.size(); i++){
                for (int j = 0; j < arrEnemy.size(); j++){
                    if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                        System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j) + " not in the same Y position");
                    }
                
                    if (EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(), arrEnemy.get(j).getX(), arrEnemy.get(j).getY()) < 2){
                        System.out.println("Player: " + arrPlayer.get(i) + " Attacked");
                        System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                        removeEnemy(arrEnemy.get(j));
                    } else {
                        System.out.println("==> Player "+arrPlayer.get(i));
                        arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                        System.out.println("current x position =  " + arrPlayer.get(i).getX() +" <==");
                    }
                    
                }
            }
        }
    }

    public double EuclideanDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
