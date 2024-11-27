import java.util.ArrayList;
class Snake{
    private int bodylength = 1;
    private int x;
    private int y;
    private ArrayList<Integer> bodyX = new ArrayList<>();
    private ArrayList<Integer> bodyY = new ArrayList<>();

    public void setSnakeCenter(int length,int hight){
        x = length/2;
        y = hight/2;
    }
    public int getSnakeX(){
        return x;
    }
    public int getSnakeY(){
        return y;
    }
    public void setBodyLength(){
        bodylength++;

    }

    public void setSnakeDirection(char direction){
        switch (direction){
            case 'w':
                y--;
                break;
            case 'a':
                x--;
                break;
            case 's':
                y++;
                break;
            case 'd':
                x++;
                break;
        }
    }
    public boolean isSnakeAlive(int length, int hight){
        if((0 <= x && x < length) && (0 <= y && y < hight)){
            return true;
        } else{
            return false;
        }
    }

}