import java.util.Random;
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
   public void isEaten(int snakeX, int snakeY){
    if(snakeX == x && snakeY == y){
        eaten = true;
    } else {
        eaten = false;
    }
    }
    public boolean getEaten(){
        return eaten;
    }
}