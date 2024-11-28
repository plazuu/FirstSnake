import java.util.ArrayList;
class Snake{
    public int bodylength = 1;
    private int x;
    private int y;
    public ArrayList<Integer> bodyX = new ArrayList<>();
    public ArrayList<Integer> bodyY = new ArrayList<>();

    public void setSnakeCenter(int length,int hight){
        x = length/2;
        y = hight/2;
        bodyX.add(0, x);
        bodyY.add(0, y);
    }
    public int getSnakeX(){
        return bodyX.get(0);
    }
    public int getSnakeY(){
        return bodyY.get(0);
    }
    public void setBodyLength(){
        bodylength++;
    }
    public int getBodyLength(){
        return bodyY.size();
    }

    public void setSnakeDirection(char direction){
        switch (direction){
            case 'w':
                y--;
                bodyY.add(0, y);
                bodyX.add(0, x);
                break;
            case 'a':
                x--;
                bodyX.add(0, x);
                bodyY.add(0, y);
                break;
            case 's':
                y++;
                bodyY.add(0, y);
                bodyX.add(0, x);
                break;
            case 'd':
                x++;
                bodyX.add(0, x);
                bodyY.add(0, y);
                break;
        }
    }
    public boolean isSnakeAlive(int length, int hight, boolean overLap){
        if(((0 <= x && x < length) && (0 <= y && y < hight)) && !overLap){
            return true;
        } else{
            return false;
        }
    }
    public boolean snakeOverLap(){
        for(int i = 1; i < bodyX.size(); i++){
            if((bodyX.get(0) == bodyX.get(i)) && (bodyY.get(0) == bodyY.get(i))){
                return true;
            }
        }
        return false;
    }
}