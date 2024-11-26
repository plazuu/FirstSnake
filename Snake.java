class Snake{
    private int Bodylength = 1;
    private int x;
    private int y;

    public void setSnakeCenter(int length,int hight){
        x = length/2;
        y = hight/2;
    }
    public void setSnakeDirection(char direction){
        switch (direction){
            case 'w':
                y++;
            case 'a':
                x--;
            case 's':
                y--;
            case 'd':
                x++;
        }
        System.out.print("x pos" + x + " " + "y pos" + y);
    }
}