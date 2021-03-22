//Nama 	: Rizki Pratama Firdaus
//Kelas : A11.4418
//NIM 	:  A11.2019.12220
public class GamePlayer {
    double width;
    double height;
    int positionX;
    int positionY;
    int currentX;


    public GamePlayer(){

    }

    public GamePlayer(double width, double height){

    }

    public GamePlayer(double width, double height, int positionX, int positionY){

    }

    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void setPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public int getX(){
        return positionX;
    }

    public int getY(){
        return positionY;
    }
    
    public void Run(){
        System.out.println("Player is running");
    }

    public void Run(int incrementX){
        currentX = incrementX += getX() ;
        System.out.println("Player still running... current X position = " + currentX);
    }
}
