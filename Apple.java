import java.util.Random;
import java.util.ArrayList;
class Apple{
    private int x;
    private int y;
    private boolean eaten = true;
    Random rand = new Random();
    public void setAppleLocation(int length, int hight){
        x = rand.nextInt(length);
        y = rand.nextInt(hight);
    }
    public int getAppleX(){
        return x;
    }
    public int getAppleY(){
        return y;
    }
   public void isEaten(ArrayList<Integer> snakeX, ArrayList<Integer> snakeY){
    if(snakeX.get(0) == x && snakeY.get(0) == y){
        eaten = true;
    } else {
        eaten = false;
    }
    }
    public boolean getEaten(){
        return eaten;
    }
}