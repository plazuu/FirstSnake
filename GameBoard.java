class GameBoard{
    private int length;
    private int hight;
    Apple apple = new Apple();


    public void setBoardSize (int givenlength, int givenhight){
        length = givenlength;
        hight = givenhight;
        apple.setAppleLocation(length, hight);
    }
    public void createBoard(int snakeX, int snakeY){
        apple.isEaten(snakeX, snakeY);
        if(apple.getEaten()){
            apple.setAppleLocation(length, hight);
        }
        for(int i = 0; i < hight; i++){
            for(int j = 0; j < length; j++){
                if(snakeX == j && snakeY == i){
                    System.out.print("0");    
                } else if (apple.getAppleX() == j && apple.getAppleY() == i){
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

}