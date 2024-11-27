class GameBoard{
    private int length;
    private int hight;

    public void setBoardSize (int givenlength, int givenhight){
        length = givenlength;
        hight = givenhight;
    }
    public void createBoard(int snakeX, int snakeY){
        for(int i = 0; i < hight; i++){
            for(int j = 0; j < length; j++){
                if(snakeX == j && snakeY == i){
                System.out.print("0");    
                } else {
                System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}