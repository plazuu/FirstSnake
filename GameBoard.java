class GameBoard{
    private int length;
    private int hight;

    public void setBoardSize (int givenlength, int givenhight){
        length = givenlength;
        hight = givenhight;
    }
    public void createBoard(){
        for(int i = 0; i < hight; i++){
            for(int j = 0; j < length; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}